public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Employee name", 27191, 100000);
        Employee employee2 = new Employee("Employee name", 82781, 200000);
        Employee employee3 = new Employee("Employee name", 72839, 250000);

        Department department = new Department("Department Name");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        department.displayEmployees();
    }
}
