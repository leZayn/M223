package ch.noser.uek223.domain.purchase;

import ch.noser.uek223.domain.product.Product;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Purchase {
    @Id
    private UUID id;
    @Column(name = )
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "product_purchase",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "purchase_id")
    )
    private Set<Product> products = new HashSet<>();


}
