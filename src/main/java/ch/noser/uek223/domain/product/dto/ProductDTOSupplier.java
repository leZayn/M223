package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.user.dto.UserDTOSupplier;

public class ProductDTOSupplier {

    private float sellingPrice;

    private float purchasingPrice;

    private Availability availability;

    private UserDTOSupplier supplier;

    public ProductDTOSupplier(float sellingPrice, float purchasingPrice, Availability availability, UserDTOSupplier userDTOSupplier) {
        this.sellingPrice = sellingPrice;
        this.purchasingPrice = purchasingPrice;
        this.availability = availability;
        this.supplier = userDTOSupplier;
    }

    public ProductDTOSupplier() {
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public ProductDTOSupplier setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public float getPurchasingPrice() {
        return purchasingPrice;
    }

    public ProductDTOSupplier setPurchasingPrice(float purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
        return this;
    }

    public Availability getAvailability() {
        return availability;
    }

    public ProductDTOSupplier setAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    public UserDTOSupplier getSupplier() {
        return supplier;
    }

    public ProductDTOSupplier setSupplier(UserDTOSupplier supplier) {
        this.supplier = supplier;
        return this;
    }
}
