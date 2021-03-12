package ch.noser.uek223.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findByArchived(boolean archived) {
        return productRepository.findByArchived(archived);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(UUID id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElseGet(Product::new);
    }

    @Override
    public List<Product> findByPriceWithBounds(float lower, float upper) {
        List<Product> products = findAll();
        products.removeIf(p -> p.getRetailPrice() < lower || p.getRetailPrice() > upper);
        return products;
    }

    @Override
    public Product archiveById(UUID id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setArchived(true);
            productRepository.save(product);
            return product;
        } else {
            return new Product();
        }
    }
}
