public class Employee {
    private String name;
    private int salary;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return this.department + " | " + this.name + " | " + this.salary;
    }
}
