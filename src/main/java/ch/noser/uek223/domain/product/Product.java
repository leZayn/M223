package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product_purchase.ProductPurchase;
import ch.noser.uek223.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Product {
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
    @Column(name = "id", updatable = true, nullable = true)
    private UUID id;

    private String description;

    @Column(name = "selling_price", nullable = false)
    private double sellingPrice;


    @Column(name = "purchase_price", nullable = false)
    private double purchasePrice;

    @Column(nullable = true)
    private float price;

    @Enumerated(EnumType.ORDINAL)
    private Availability availability;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private User supplier;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private Set<ProductPurchase> productPurchases;

    public Product(UUID id, String description, double sellingPrice, double purchasePrice, float price, Availability availability, User supplier, Set<ProductPurchase> productPurchases) {
        this.id = id;
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.price = price;
        this.availability = availability;
        this.supplier = supplier;
        this.productPurchases = productPurchases;
    }

    public Product() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public User getSupplier() {
        return supplier;
    }

    public void setSupplier(User supplier) {
        this.supplier = supplier;
    }

    public Set<ProductPurchase> getProductPurchases() {
        return productPurchases;
    }

    public void setProductPurchases(Set<ProductPurchase> productPurchases) {
        this.productPurchases = productPurchases;
    }
}