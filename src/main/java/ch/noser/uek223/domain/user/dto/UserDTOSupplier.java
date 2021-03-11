package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dto.RoleDTOSupplier;

import java.util.List;

public class UserDTOSupplier {

    private String firstname;

    private String surname;

    private String email;

    private List<RoleDTOSupplier> roles;

    public UserDTOSupplier(String firstname, String surname, String email, List<RoleDTOSupplier> roleDTOSupplier) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.roles = roleDTOSupplier;
    }

    public UserDTOSupplier() {
    }

    public String getFirstname() {
        return firstname;
    }

    public UserDTOSupplier setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserDTOSupplier setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTOSupplier setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<RoleDTOSupplier> getRoles() {
        return roles;
    }

    public UserDTOSupplier setRoles(List<RoleDTOSupplier> roles) {
        this.roles = roles;
        return this;
    }
}
