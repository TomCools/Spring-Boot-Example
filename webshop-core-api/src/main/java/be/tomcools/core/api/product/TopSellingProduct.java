package be.tomcools.core.api.product;

/**
 * Created by tomco on 19/12/2016.
 */
public class TopSellingProduct {
    private String name;
    private Double euro;
    private Double dollar;

    public TopSellingProduct() {
    }

    public TopSellingProduct(String name, Double euro, Double dollar) {
        this.name = name;
        this.euro = euro;
        this.dollar = dollar;
    }

    public String getName() {
        return name;
    }

    public Double getEuro() {
        return euro;
    }

    public Double getDollar() {
        return dollar;
    }
}
