package be.tomcools.account.service.resource;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by tomco on 18/12/2016.
 */
@Service
public class AccountServiceCaller {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serverDown")
    public Collection<AccountFirstname> findFirstnamesOfAccounts() {
        List<AccountFirstname> list = restTemplate.exchange("http://account-service/accounts",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<AccountFirstname>>() {
                }).getBody();

        return list;
    }

    public Collection<AccountFirstname> serverDown() {
        return Collections.emptyList();
    }

}












    /*
       //@HystrixCommand
    public Collection<AccountFirstname> incaseOfError() {
        return Collections.emptyList();
    }
    */
