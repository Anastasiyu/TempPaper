public class Main {
    public static void main(String[] args) {
        Empoyee empoyee = new Empoyee("Иванов", "Иван", "Иванович");
        empoyee.setDepartment (1);
        empoyee.setSalary (44500.00);
        System.out.println(empoyee);
        Empoyee empoyee2 = new Empoyee("Сидорова", "Ольга", "Олеговна");
        empoyee2.setDepartment (3);
        empoyee2.setSalary (32400.30);
        System.out.println(empoyee2);
    }
}