package application_constructor;

public class Product {
    public String name;
    public double price;
    public int quantity;


    //construtor
    public Product(String name, double price, int quantity){
        //this serve para referencia para o proprio objeto
        //this esta se referindo ao name, price e quantity la de cima e nao os paremetros
        this.name = name;
        this.price = price;
        this.quantity = quantity;

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
