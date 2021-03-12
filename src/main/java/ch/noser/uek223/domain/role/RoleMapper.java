package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.authority.dto.AuthorityDTO;
import ch.noser.uek223.domain.role.dto.RoleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

        RoleDTO roleToRoleDTO(Role role);
    }

