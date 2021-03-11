package ch.noser.uek223.domain.role;

import ch.noser.uek223.domain.authority.Authority;
import ch.noser.uek223.domain.user.Users;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Role {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "name", nullable = false)
    private String name;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_authority",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private Set<Authority> authorities;

    @JsonBackReference
    @ManyToMany(mappedBy = "roles")
    private Set<Users> users = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public Role setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Role setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
        return this;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public Role setUsers(Set<Users> users) {
        this.users = users;
        return this;
    }
}
