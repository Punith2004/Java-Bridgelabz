class Process {
    int pid;
    int burstTime;
    int priority;
    int remainingTime;
    int waitingTime = 0;
    int turnaroundTime = 0;
    Process next;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head = null;
    Process tail = null;
    int timeQuantum = 4;
    int currentTime = 0;

    void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = newProcess;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    void removeProcess(Process prev, Process toRemove) {
        if (toRemove == head && toRemove == tail) {
            head = tail = null;
        } else if (toRemove == head) {
            head = head.next;
            tail.next = head;
        } else if (toRemove == tail) {
            prev.next = head;
            tail = prev;
        } else {
            prev.next = toRemove.next;
        }
    }

    void simulate() {
        if (head == null) return;
        Process current = head;
        Process prev = tail;
        int totalWaitingTime = 0, totalTurnaroundTime = 0, processCount = 0;

        while (head != null) {
            if (current.remainingTime > 0) {
                System.out.println("Executing Process ID: " + current.pid);
                int execTime = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= execTime;
                currentTime += execTime;

                Process temp = head;
                do {
                    if (temp != current && temp.remainingTime > 0) {
                        temp.waitingTime += execTime;
                    }
                    temp = temp.next;
                } while (temp != head);

                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    System.out.println("Process " + current.pid + " completed at time " + currentTime);
                    totalWaitingTime += current.waitingTime;
                    totalTurnaroundTime += current.turnaroundTime;
                    processCount++;
                    removeProcess(prev, current);
                    current = prev.next;
                    if (head == null) break;
                } else {
                    prev = current;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }

            displayProcesses();
        }

        double avgWaitingTime = (double) totalWaitingTime / processCount;
        double avgTurnaroundTime = (double) totalTurnaroundTime / processCount;

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }
        System.out.println("Current Process Queue:");
        Process temp = head;
        do {
            System.out.println("PID: " + temp.pid + " | Remaining: " + temp.remainingTime + " | Waiting: " + temp.waitingTime);
            temp = temp.next;
        } while (temp != head);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 6, 3);
        scheduler.addProcess(4, 8, 2);

        scheduler.simulate();
    }
}
