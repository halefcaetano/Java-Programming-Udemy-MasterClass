public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1000, "tim@myemail.com");

        System.out.println(customer.getName());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
    }
}
