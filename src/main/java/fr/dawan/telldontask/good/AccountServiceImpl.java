package fr.dawan.telldontask.good;

public class AccountServiceImpl implements AccountService {
    private AccountRepository repository;

    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void debiter(int id, double amount) throws Exception {
        Account account = repository.findById(id);
        account.debit(amount);
        repository.save(account);
    }
}
