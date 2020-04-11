package com.myproject.onlinestore.DTO;

import java.util.ArrayList;
import java.util.List;

public class ProductSelectDTO {
    List<String> selectedProducts;

    public ProductSelectDTO() {
        this.selectedProducts = new ArrayList<>();
    }

    public List<String> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<String> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }
}
