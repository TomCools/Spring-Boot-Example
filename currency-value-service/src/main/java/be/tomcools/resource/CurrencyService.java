package be.tomcools.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {
    private final static String URL = "http://api.fixer.io/latest";

    @Autowired
    RestTemplate restTemplate;

    public CurrencyConversionRate conversionRateFromEuro(String toValue) {
        ResponseEntity<CurrencyServiceResponse> entity = restTemplate.getForEntity(URL, CurrencyServiceResponse.class);
        Double conversionRate = entity.getBody().getRates().get(toValue);
        return new CurrencyConversionRate(toValue, conversionRate);
    }


    @Bean
    private RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
