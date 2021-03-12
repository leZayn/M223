package ch.noser.uek223.domain.user.dto;

import ch.noser.uek223.domain.role.dto.RoleDTO;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class UserDTO {

    private UUID id;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Collection<RoleDTO> roles = new HashSet<>();

    public UserDTO(UUID id, String firstname, String lastname, String email, String password, Collection<RoleDTO> roles) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UserDTO() {
    }

    public UserDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public UserDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserDTO setFirstname(String firstName) {
        this.firstname = firstName;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserDTO setLastname(String lastName) {
        this.lastname = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public Collection<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTO setRoles(Collection<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }
}
