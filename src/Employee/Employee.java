package Employee;

public class Employee {
    private double salary = 759.35;
    public String surname = "Johnson";
    int id = 56;

    public void clientInfo() {
        System.out.println(surname);
    }

    public void info() {
        System.out.println("Bank Accaunt id:" + id + "\nSalary:" + salary);
    }

    public void cash() {
        System.out.println(salary);
    }

    public Employee(String surname) {
        this.surname = surname;
    }

    Employee(int ID) {
        this.id = ID;
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
        Employee methods = new Employee();
        methods.info();

    }
}
