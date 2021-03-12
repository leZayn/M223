package ch.noser.uek223.domain.product.dto;

import java.util.UUID;

public class ProductDTOWithoutPurchasePrice {

    private UUID id;

    private double sellingPrice;

    public ProductDTOWithoutPurchasePrice(UUID id, double sellingPrice) {
        this.id = id;
        this.sellingPrice = sellingPrice;
    }

    public ProductDTOWithoutPurchasePrice() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
