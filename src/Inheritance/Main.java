package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee alireza = new Employee("Alireza","05.12.2002","01.02.2026");
        System.out.println(alireza);
        System.out.println("Age  = "+alireza.getAge());
        System.out.println("Pay = "+alireza.collectPay());

        SalariedEmployee mani = new SalariedEmployee("Mani","05.12.2006 ","01.01.2026",35000);
        System.out.println(mani);
        System.out.println("Mani´s Paycheck = €"+mani.collectPay());

        mani.retire();
        System.out.println("Mani´s Pension check = €" + mani.collectPay());

        HourlyEmployee arshia = new HourlyEmployee("Arshia","05.12.2002 ","01.12.2025",17);
        System.out.println(arshia);
        System.out.println("Arshia´s Paycheck = €"+arshia.collectPay());
        System.out.println("Arshia´s Holliday Pay = €"+arshia.getDoublePay());
    }
}
