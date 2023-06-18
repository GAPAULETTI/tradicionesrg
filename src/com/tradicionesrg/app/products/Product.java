package com.tradicionesrg.app.products;

public class Product {
    private int id;
    private String name;
    private String size;
    private String color;
    private String shape;
    private double price;
    private int quantity;

    //Constructors


    public Product() {
    }

    public Product(int id, String name, String size, String color, String shape, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
