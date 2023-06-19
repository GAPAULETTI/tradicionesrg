package com.tradicionesrg.app;

import com.tradicionesrg.app.products.Product;

public class Item {

    private int cantidad;
    private Product product;

    public Item(int cantidad, Product product) {
        this.cantidad = cantidad;
        this.product = product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
