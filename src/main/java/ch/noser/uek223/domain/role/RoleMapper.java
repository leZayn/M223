package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.role.dto.RoleDTO;
import ch.noser.uek223.domain.role.dto.RoleDTOWithoutAuthorities;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO roleToRoleDTO(Role role);

    RoleDTOWithoutAuthorities roleToRoleDTOWithoutAuthorities(Role role);
}
