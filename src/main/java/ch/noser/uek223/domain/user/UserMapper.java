package ch.noser.uek223.domain.user;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import ch.noser.uek223.domain.user.dto.UserDTOSupplierDetail;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTOSupplierDetail toDTO(User user);
    User userDTOTOUser(UserDTOSupplierDetail user);
    }

