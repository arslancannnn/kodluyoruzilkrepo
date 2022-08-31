package Siniflar.Maas;

public class Employee {
    
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, Double salary, int workHours, int hireYear){

        this.name      = name;
        this.salary    = salary;
        this.workHours = workHours;
        this.hireYear  = hireYear;
    }

    public void tax(double salary){

        if(salary >= 1000){
            System.out.println("Vergi: "+salary*0.03+" TL");
            this.salary = salary - (salary*0.03);
        }else{
            System.out.println("Vergi: 0 TL");
        }   
    }
    public void bonus(int workHours){

        if(workHours > 40){
            System.out.println("Bonus: "+(workHours-40)*30+" TL");
            this.salary = salary + ((workHours-40)*30);
        }else{
            System.out.println("Bonus: 0 TL");
        }

    }
    public void raiseSalary(int hireYear) {
        if(2021-hireYear>19){
            System.out.println("Zam: "+this.salary*0.15);
            this.salary = salary+(salary*0.15);
        }else if(2021-hireYear > 9 ){
            System.out.println("Zam: "+this.salary*0.10);
            this.salary = salary+(salary*0.10);
        }else{
            System.out.println("Zam: "+this.salary*0.05);
            this.salary = salary+(salary*0.05);
        }
    }

    public void printEmployee() {
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
    }
}
