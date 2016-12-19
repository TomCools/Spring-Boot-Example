package be.tomcools.currency.resource;

import java.util.Map;

/**
 * Created by tomco on 19/12/2016.
 */
public class CurrencyServiceResponse {
    private String base;
    private Map<String, Double> rates;

    public CurrencyServiceResponse() {
    }

    public String getBase() {
        return base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}
