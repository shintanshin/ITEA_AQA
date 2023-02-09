package Employee;

public class Report {
    public static void main(String[] args) {
        Employee client = new Employee();
        Employee bankAc = new Employee();
        Employee employee = new Employee();
        //Employee salary = new Employee(23.5); - Cannot resolve this constructor because it has private access modifier
        System.out.println(client.surname);
        System.out.println(bankAc.id);
        employee.info();
        employee.clientInfo();
        employee.cash();
    }
}
