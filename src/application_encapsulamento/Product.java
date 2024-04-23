package application_encapsulamento;

import jdk.jshell.spi.SPIResolutionException;

public class Product {
    private String name;
    private double price;
    private int quantity;


    //construtor
    public Product(String name, double price, int quantity) {
        //this serve de referência para o próprio objeto
        //this esta se referindo ao name, price e quantity la de cima e nao os paremetros
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

public int getQuantity(){
        return quantity;
}
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalValueInStock();
    }

}
