package Student;

import Employee.Employee;

public class Stipend {
    public static void main(String[] args) {
        Employee client = new Employee("Amund");
        //Employee bankAc = new Employee(); - Cannot resolve this constructor because it has default access modifier
        Employee methods = new Employee();
        //Employee salary = new Employee(23.5); - Cannot resolve this constructor because it has private access modifier
        System.out.println(client.surname);
        methods.info();
        methods.clientInfo();
        methods.cash();
    }
}
