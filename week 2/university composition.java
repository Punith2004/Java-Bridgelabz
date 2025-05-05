import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void deleteUniversity() {
        departments.clear();
        System.out.println("University and all its departments have been deleted.");
    }

    public List<Department> getDepartments() {
        return departments;
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University("SRM Institute of Science and Technology");
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mechanical Engineering");
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        Faculty faculty1 = new Faculty("Arpit");
        Faculty faculty2 = new Faculty("Sunil");

        System.out.println("University: " + university.getDepartments().size() + " departments.");
        System.out.println("Faculty Members: " + faculty1.getName() + ", " + faculty2.getName());

        university.deleteUniversity();
    }
}
