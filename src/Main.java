public class Main {

    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee(null, 1, 45600.00);
        employees[1] = new Employee("Сидорова Ольга Николаевна", 3, 40200.00);
        employees[2] = new Employee("Прохоров Прохор Петрович", 2, 42600.50);
        employees[3] = null;
        employees[4] = new Employee("Смирнов Владимир Владимирович", 4, 41600.00);
        employees[5] = new Employee("Ветров Петр Петрович", 5, 48900.00);
        employees[6] = new Employee("Петрова Надежда Николаевна", 3, 46600.80);
        employees[7] = new Employee("Кротов Сергей Сергеевич", 2, 38600.00);
        employees[8] = new Employee("Золотов Роман Романович", 1, 48300.00);
        employees[9] = new Employee("Николаева Нина Николаевна", 4, 49600.00);


        employees[0].setDepartment(5);
        employees[0].setSalary(44500.00);

        employees[2].setFullName("Прохоров Петр Петрович");

        printAllNameEmployee(employees);
        System.out.println(getCalculateSumSalary());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAvarageSalaryEmployee());
        printNameAllEmployee(employees);
    }

    public static void printAllNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }}
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double min = 0;
        int index = 0;

        Employee employeeMinSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary; }

        public static Employee getEmployeeMaxSalary() {
        double max = 0;
        int index = 0;
            Employee employeeMaxSalary = employees[index];
            for (int i = index; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    employeeMaxSalary = employees[i];
                }

        }
        return employeeMaxSalary;
    }

        public static double getAvarageSalaryEmployee() {
        double sum = 0;
        int countEmp = 0;

        for (Employee emp : employees) {
            if (emp == null) {continue;}
            countEmp++;
            sum = sum + emp.getSalary();
        }
        return  sum/countEmp;
    }

        public static void printNameAllEmployee(Employee[] employees){
        for (Employee empl:employees){
            if (empl ==null){continue;}
            System.out.println(empl.getFullName());
        }
    }
}










