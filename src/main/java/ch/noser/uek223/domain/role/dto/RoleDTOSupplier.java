package ch.noser.uek223.domain.role.dto;

import ch.noser.uek223.domain.authority.dto.AuthorityDTOSupplier;

import java.util.List;

public class RoleDTOSupplier {

    private String name;

    private List<AuthorityDTOSupplier> authorities;

    public RoleDTOSupplier(String name, List<AuthorityDTOSupplier> authorityDTOSupplier) {
        this.name = name;
        this.authorities = authorityDTOSupplier;
    }

    public RoleDTOSupplier() {
    }

    public String getName() {
        return name;
    }

    public RoleDTOSupplier setName(String name) {
        this.name = name;
        return this;
    }

    public List<AuthorityDTOSupplier> getAuthorities() {
        return authorities;
    }

    public RoleDTOSupplier setAuthorities(List<AuthorityDTOSupplier> authorities) {
        this.authorities = authorities;
        return this;
    }
}
