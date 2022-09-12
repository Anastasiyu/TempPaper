public class Main {

    private static Empoyee[] employees = new Empoyee[10];
    public static void main(String[] args) {

        employees[0] = new Empoyee(null, 1, 45600.00);
        employees[1] = new Empoyee("Сидорова Ольга Николаевна", 3, 40200.00);
        employees[2] = new Empoyee("Прохоров Прохор Петрович", 2, 42600.50);
        employees[3] = null;
        employees[4] = new Empoyee("Смирнов Владимир Владимирович", 4, 41600.00);
        employees[5] = new Empoyee("Ветров Петр Петрович", 5, 48900.00);
        employees[6] = new Empoyee("Петрова Надежда Николаевна", 3, 46600.80);
        employees[7] = new Empoyee("Кротов Сергей Сергеевич", 2, 38600.00);
        employees[8] = new Empoyee("Золотов Роман Романович", 1, 48300.00);
        employees[9] = new Empoyee("Николаева Нина Николаевна", 4, 49600.00);


        employees[0].setDepartment(5);
        employees[0].setSalary(44500.00);

        employees[2].setFullName("Прохоров Петр Петрович");
        printAllNameEmployee(employees);
        System.out.println(getCalculateSumSalary());
        System.out.println(getEmpoyeeMinSalary());
        System.out.println(getEmpoyeeMaxSalary());
        System.out.println(getAvarageSalaryEmployee());
        printNameAllEmployee(employees);
    }

    public static void printAllNameEmployee(Empoyee[] employees) {
        for (Empoyee employee : employees) {
            System.out.println(employee);

        }
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Empoyee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Empoyee getEmpoyeeMinSalary() {
        double min = 0;
        int index = 0;

        Empoyee employeeMinSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary; }

        public static Empoyee getEmpoyeeMaxSalary() {
        double max = 0;
        int index = 0;
            Empoyee employeeMaxSalary = employees[index];
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

        for (Empoyee emp : employees) {
            if (emp == null) {continue;}
            countEmp++;
            sum = sum + emp.getSalary();
        }
        return  sum/countEmp;
    }

        public static void printNameAllEmployee(Empoyee[] employees){
        for (Empoyee empl:employees){
            if (empl ==null){continue;}
            System.out.println(empl.getFullName());
        }
    }
}










