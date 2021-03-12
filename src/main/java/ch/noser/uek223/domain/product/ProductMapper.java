package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductDTOWithPurchasePrice;
import ch.noser.uek223.domain.product.dto.ProductDTOWithoutPurchasePrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTOWithoutPurchasePrice productToProductDTOToWithoutPurchasePrice(Product product);
//    ProductDTOWithPurchasePrice productToProductDTOWithPurchasePrice(Product product);

}
