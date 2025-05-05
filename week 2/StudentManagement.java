public class StudentManagement {
    
   
    static class Student {
        private int studentId;
        private String name;
        private int age;
        private String grade;

        public Student(int studentId, String name, int age, String grade) {
            this.studentId = studentId;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        
        public void displayInfo() {
            System.out.println("ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        
        Student[] students = new Student[20];

        
        for (int i = 0; i < 20; i++) {
            students[i] = new Student(i + 1, "Student " + (i + 1), 15 + (i % 5), "Grade " + (1 + (i % 4)));
        }

    
        for (Student student : students) {
            student.displayInfo();
        }
    }
}