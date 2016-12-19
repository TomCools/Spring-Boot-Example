package be.tomcools.account.service.repository;

import be.tomcools.account.service.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByLastName(String lastName);
}
