package Employee;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void clientInfo() {
        System.out.println(surname);
    }

    public void info() {
        System.out.println("Bank Account id:" + id + "\nSalary:" + salary);
    }

    public void cash() {
        System.out.println(salary);
    }

    public Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id) {
        this.id = id;
    }

    public Employee() {
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee salary = new Employee();
        Employee client = new Employee();
        Employee bankAc = new Employee();
        Employee employee = new Employee();
        employee.info();

    }
}
