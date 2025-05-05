class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head = null;
    Task tail = null;
    Task current = null;

    void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = newTask;
            current = head;
        } else {
            newTask.next = head;
            tail.next = newTask;
            head = newTask;
        }
    }

    void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (tail == null) {
            head = tail = newTask;
            newTask.next = newTask;
            current = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 1 || head == null) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) {
            tail = newTask;
        }
    }

    void removeTaskById(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId && head == tail) {
            head = tail = current = null;
            return;
        }
        Task temp = head;
        Task prev = tail;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                if (current == temp) current = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentTask() {
        if (current != null) {
            System.out.println("Current Task: " + current.taskId + " | " + current.taskName + " | " + current.priority + " | " + current.dueDate);
        }
    }

    void moveToNextTask() {
        if (current != null) {
            current = current.next;
        }
    }

    void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.priority + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.priority + " | " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskAtEnd(101, "Attend Standup", 1, "2025-04-10");
        scheduler.addTaskAtBeginning(102, "Code Review", 2, "2025-04-09");
        scheduler.addTaskAtPosition(2, 103, "Fix Bugs", 1, "2025-04-11");
        scheduler.displayAllTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();
        System.out.println("Search by Priority 1:");
        scheduler.searchByPriority(1);
        scheduler.removeTaskById(102);
        System.out.println("After Removal:");
        scheduler.displayAllTasks();
    }
}
