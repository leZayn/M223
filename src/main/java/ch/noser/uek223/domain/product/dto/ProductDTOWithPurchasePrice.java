package ch.noser.uek223.domain.product.dto;


import java.util.UUID;

public class ProductDTOWithPurchasePrice {

    private UUID id;

    private double sellingPrice;

    private double purchasePrice;

    public ProductDTOWithPurchasePrice(UUID id, double sellingPrice, double purchasePrice) {
        this.id = id;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
    }

    public ProductDTOWithPurchasePrice() {
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

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
