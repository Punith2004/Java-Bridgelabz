import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void deleteCompany() {
        departments.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company("BharatTech");
        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");
        dept1.addEmployee(new Employee("Amit"));
        dept1.addEmployee(new Employee("Priya"));
        dept2.addEmployee(new Employee("Rajesh"));
        company.addDepartment(dept1);
        company.addDepartment(dept2);
        company.deleteCompany();
    }
}
