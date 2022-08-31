package Siniflar.Maas;

public class Main {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("kemal", 2000.0, 45, 1985);

        emp1.printEmployee();
        emp1.raiseSalary(emp1.hireYear);
        emp1.bonus(emp1.workHours);
        System.out.println("Zam ve bonuslarla birlikte maaş: "+emp1.salary+" TL");
        emp1.tax(emp1.salary);
        System.out.println("Vergi kesintisinden sonra kalan para: "+emp1.salary+" TL");

    }
}
