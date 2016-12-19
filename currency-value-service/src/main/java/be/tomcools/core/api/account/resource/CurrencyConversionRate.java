package be.tomcools.core.api.account.resource;

/**
 * Created by tomco on 19/12/2016.
 */
public class CurrencyConversionRate {
    private String code;
    private Double conversionRate;

    public CurrencyConversionRate(String code, Double value) {
        this.code = code;
        this.conversionRate = value;
    }

    public String getCode() {
        return code;
    }

    public Double getConversionRate() {
        return conversionRate;
    }
}
