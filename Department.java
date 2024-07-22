public class Department {

    private String departmentName;
    private Employee[] employees;
    private int employeeNumber;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new Employee[10000];
        this.employeeNumber = 0;
    }

    public void addEmployee(Employee employee){
        if (employeeNumber < employees.length) {
            employees[employeeNumber] = employee;
            employeeNumber++;
        } else {
            System.out.println("The number of employees in this department has reached its limit.");
        }
    }

    public void displayEmployees(){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            } else {
                break;
            }
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

}