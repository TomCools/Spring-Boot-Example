package be.tomcools.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tomco on 19/12/2016.
 */
@RestController
public class CurrencyResource {

    @Autowired
    CurrencyService service;

    @RequestMapping("/convert/EUR/{to}")
    public CurrencyConversionRate getCurrencyConversion(@PathVariable("to") String pathVariable) {
        return service.conversionRateFromEuro(pathVariable);
    }
}
