public class Empoyee {

    private int id;
    private String name;
    private String midleName;
    private String surName;
    private int department;
    private double salary;
    private static int idCounter = 0;

    public Empoyee() {
        this.id = ++idCounter;
    }

    public Empoyee(String surName, String name, String midleName) {
        this.id = ++idCounter;
        this.name = name;
        this.midleName = midleName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return  " " + idCounter + "/ Ф.И.О.: " + surName + " " + name + " " + surName + ", номер отдела- " + department + ". Сумма зарплаты: " + salary +"рублей.";
    }
}
