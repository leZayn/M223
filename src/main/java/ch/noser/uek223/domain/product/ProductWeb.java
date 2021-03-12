package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductDTOForSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductWeb {

    private ProductService productService;
    private ProductMapper productMapper;

    @Autowired
    public ProductWeb(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping({"", "/"})
    @PreAuthorize("hasRole('SUPPLIER')")
    public ResponseEntity<List<ProductDTOForSupplier>> findNonArchivedForSupplier() {
        return ResponseEntity.ok().body(productMapper.productsToProductDTOsForSupplier(productService.findByArchived(false)));
    }

    @GetMapping(value = {"", "/"}, params = {"inclArchived=true"})
    @PreAuthorize("hasRole('SUPPLIER')")
    public ResponseEntity<List<ProductDTOForSupplier>> findAllForSupplier() {
        return ResponseEntity.ok().body(productMapper.productsToProductDTOsForSupplier(productService.findAll()));
    }

    @GetMapping({"/{id}", "/{id}/"})
    @PreAuthorize("hasRole('SUPPLIER')")
    public ResponseEntity<ProductDTOForSupplier> findByIdForSupplier(@PathVariable("id") UUID id) {
        return ResponseEntity.ok().body(productMapper.productToProductDTOForSupplier(productService.findById(id)));
    }

    @GetMapping({"/{lower}/{upper}", "/{lower}/{upper}/"})
    @PreAuthorize("hasRole('SUPPLIER')")
    public ResponseEntity<List<ProductDTOForSupplier>> findByPriceWithBoundsForSupplier(@PathVariable("lower") float lower, @PathVariable("upper") float upper) {
        return ResponseEntity.ok().body(productMapper.productsToProductDTOsForSupplier(productService.findByPriceWithBounds(lower, upper)));
    }

    @DeleteMapping({"/{id}", "/{id}/"})
    @PreAuthorize("hasRole('SUPPLIER')")
    public ResponseEntity<ProductDTOForSupplier> archiveByIdForSupplier(@PathVariable("id") UUID id) {
        return ResponseEntity.ok().body(productMapper.productToProductDTOForSupplier(productService.archiveById(id)));
    }
}
