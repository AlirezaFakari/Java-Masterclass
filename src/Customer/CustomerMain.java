package Customer;

public class CustomerMain extends Object{
    public static void main(String[] args) {
        Customer customer = new Customer("Alireza",12345.5,"alireza@gmail.com");

        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getName());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmailAddress());

        Customer ThirdCustomer = new Customer("John","john@gmail.com");
        System.out.println(ThirdCustomer.getCreditLimit());
        System.out.println(ThirdCustomer.getName());
        System.out.println(ThirdCustomer.getEmailAddress());
    }
}