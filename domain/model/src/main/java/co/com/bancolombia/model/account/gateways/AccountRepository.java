package co.com.bancolombia.model.account.gateways;

import co.com.bancolombia.model.account.Account;

import java.util.List;

public interface AccountRepository {
    public List<Account> getAccounts();
    public Account getAccountById(int accountNumber);
}
