package com.tradicionesrg.app;
import com.tradicionesrg.app.products.Product;

public class Main {
    public static void main(String[] args) {

        Product pr1 = new Product();
                pr1.setId(1);
                pr1.setName("Termo");
        System.out.println(pr1);
    }


}
