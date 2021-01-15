
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account artosAccount = new Account("Matthews account", 1000.00);
        Account artosSwissAccount = new Account("My account", 0);

        artosAccount.withdrawal(100);
        artosSwissAccount.deposit(100);

        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
    }
}
