public class Employee {
    private int id;
    private String fullName;
    private int department;
    private double salary;
    private static int idCounter = 0;


    public Employee(String fullName, int department, double salary){
        this.id = ++idCounter;
        this.fullName = fullName;
        if (department <0) {
            throw new IllegalArgumentException("Номер отдела не может быть отрицательным");
        }
        this.department = department;
        if (salary <0) {
            throw new IllegalArgumentException("Оплата труда не может быть меньше 0 )");
        }
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department <0) {
            throw new IllegalArgumentException("Номер отдела не может быть отрицательным");
        }
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <0) {
            throw new IllegalArgumentException("Оплата труда не может быть меньше 0 )");
        }
        this.salary = salary;
    }
    @Override
    public String toString() {
        return   "" + id + "/ Ф.И.О.: " + fullName + " " + ", номер отдела- " + department + ". Сумма зарплаты: " + salary +"рублей.";
    }
}
