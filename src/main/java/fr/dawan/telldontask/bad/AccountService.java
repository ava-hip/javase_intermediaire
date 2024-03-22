package fr.dawan.telldontask.bad;

public class AccountService {
    private AccountRepository repository;
    public void debit(int id, double amount) {
        Account account = repository.findById(id);
        if (account.getBalance() < amount) {
            throw new IllegalArgumentException("Le solde est inssufisant");
        }
        account.setBalance(account.getBalance() - amount);
    }
}
