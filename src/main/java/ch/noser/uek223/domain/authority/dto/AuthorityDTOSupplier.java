package ch.noser.uek223.domain.authority.dto;

public class AuthorityDTOSupplier {

    private String name;

    public AuthorityDTOSupplier(String name) {
        this.name = name;
    }

    public AuthorityDTOSupplier() {
    }

    public String getName() {
        return name;
    }

    public AuthorityDTOSupplier setName(String name) {
        this.name = name;
        return this;
    }
}
