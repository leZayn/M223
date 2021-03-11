package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.user.dto.UserDTOSupplier;

public class ProductDTOCustomer {

    private String description;

    private float purchasingPrice;

    private Availability availability;

    private UserDTOSupplier userDTOSupplier;

    public ProductDTOCustomer(String description, float purchasingPrice, Availability availability, UserDTOSupplier userDTOSupplier) {
        this.description = description;
        this.purchasingPrice = purchasingPrice;
        this.availability = availability;
        this.userDTOSupplier = userDTOSupplier;
    }

    public ProductDTOCustomer() {
    }

    public String getDescription() {
        return description;
    }

    public ProductDTOCustomer setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getPurchasingPrice() {
        return purchasingPrice;
    }

    public ProductDTOCustomer setPurchasingPrice(float purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public ProductDTOCustomer setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public UserDTOSupplier getUserDTOCustomer() {
        return userDTOSupplier;
    }

    public ProductDTOCustomer setUserDTOCustomer(UserDTOSupplier userDTOSupplier) {
        this.userDTOSupplier = userDTOSupplier;
        return this;
    }
}


