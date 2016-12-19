package be.tomcools.core.api.repository;

import be.tomcools.core.api.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByLastName(String lastName);
}
