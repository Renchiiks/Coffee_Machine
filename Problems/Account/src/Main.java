public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, "String", true);
    }
}

class Account {
    long balance;
    String ownerName;
    boolean locked;

    public Account(long balance, String ownerName, boolean locked) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}