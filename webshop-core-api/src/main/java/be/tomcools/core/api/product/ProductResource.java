package be.tomcools.core.api.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    ProductServiceCaller productServiceCaller;

    @RequestMapping("/topselling")
    public TopSellingProduct topSelling() {
        return productServiceCaller.findTopSellingProduct();
    }
}
