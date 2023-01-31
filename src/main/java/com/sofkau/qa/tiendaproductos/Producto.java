package com.sofkau.qa.tiendaproductos;
import java.util.Scanner;

public class Producto {
    private String nombreProducto;
    private int valor;
    private int stock;

    public Producto(){

    }

    /**
     * Constructor
     * @param nombreProducto
     * @param valor
     * @param stock
     */
    public Producto(String nombreProducto, int valor, int stock) {
        this.nombreProducto = nombreProducto;
        this.valor = valor;
        this.stock = stock;
    }

    /**
     * Métodos getters y setters
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Lista de productos: \n" +
                "Nombre del producto: " + nombreProducto + "\n" +
                "Valor: " + "$"+ valor + "\n" +
                "Cantidad: " + stock + "\n";
    }
}
