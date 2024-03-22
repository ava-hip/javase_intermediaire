package fr.dawan.telldontask.good;

public class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void debit(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Le solde est inssufisant");
        }
        balance -= amount;
    }
}
