package com.tradicionesrg.app;
import com.tradicionesrg.app.*;

import java.util.Date;

public class Factura {

    private int codigo;
    private String description;
    private Date fecha;
    private Cliente cliente;
    private Item[] items;
    private int indiceItems;
    private static int ultimoCodigo;

    public Factura(String description, Cliente cliente){
        this.description = description;
        this.cliente = cliente;
        this.items = new Item[10];
        this.codigo = ++ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item[] getItems() {
        return items;
    }

    public void addItem(Item item){
        this.items[indiceItems++] = item;

    }
}
