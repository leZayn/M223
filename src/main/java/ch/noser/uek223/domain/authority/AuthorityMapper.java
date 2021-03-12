package ch.noser.uek223.domain.authority;

import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import ch.noser.uek223.domain.product.Product;
import ch.noser.uek223.domain.product.dto.ProductDTOWithoutPurchasePrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorityMapper {

        AuthorityDTO authorityToAuthorityDTO(Authority authority);
    }

