package be.tomcools.resource;

import be.tomcools.Account;
import be.tomcools.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/accounts")
public class AccountResource {

    AccountRepository accountRepository;

    @Autowired
    public AccountResource(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping
    public Collection<Account> accounts() {
        return accountRepository.findAll();
    }
}
