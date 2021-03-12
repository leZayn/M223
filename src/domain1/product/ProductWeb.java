package ch.noser.uek223.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductWeb {

    private final ProductService productService;

    @Autowired
    public ProductWeb(ProductService productService) {
        this.productService = productService;
    }

}
