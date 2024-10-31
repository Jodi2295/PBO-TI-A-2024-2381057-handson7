package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount jodiYusup = new BankAccount(100);

        jodiYusup.withdraw(10);
        System.out.println("Corrent balance is: " + jodiYusup.getBalance());
    }
}
