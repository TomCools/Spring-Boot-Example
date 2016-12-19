package be.tomcools.core.api.product;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tomco on 18/12/2016.
 */
@Service
public class ProductServiceCaller {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serverDown")
    public TopSellingProduct findTopSellingProduct() {
        return restTemplate.getForEntity("http://product-service/topselling", TopSellingProduct.class).getBody();
    }

    public TopSellingProduct serverDown() {
        return new TopSellingProduct("Not Found", 0.0, 0.0);
    }

}












    /*
       //@HystrixCommand
    public Collection<AccountFirstname> incaseOfError() {
        return Collections.emptyList();
    }
    */
