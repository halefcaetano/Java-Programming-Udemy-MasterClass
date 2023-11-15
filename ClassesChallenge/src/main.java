public class main {
    public static void main(String[] args) {

       //  Account bobsAccount = new Account();

      //  bobsAccount.setNumber("12345");
       // bobsAccount.setBalance(1000);
       // bobsAccount.setCustomerName("Bob Brown");
       // bobsAccount.setCustomerEmail("myemail@bob.com");
       // bobsAccount.setCustomerPhone("(087) 123 - 4567");
       // bobsAccount.withdrawFunds(100);
       // bobsAccount.depositFunds(250);
       // bobsAccount.withdrawFunds(50);

       // bobsAccount.withdrawFunds(45.50);

        Account bobsAccount = new Account("12345", 500, "Bob Brown",
                "myemail@bob.com", "(807) 123-456");

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getBalance());

    }
}
