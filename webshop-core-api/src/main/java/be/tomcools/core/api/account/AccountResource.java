package be.tomcools.core.api.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/accounts")
public class AccountResource {

    @Autowired
    AccountServiceCaller serviceCaller;

    @RequestMapping
    public Collection<AccountFirstname> getAccounts() {
        return serviceCaller.findFirstnamesOfAccounts();
    }
}
