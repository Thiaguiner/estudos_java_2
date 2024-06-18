package predicate_ex.entities;

public class Product {
    private String name;
    private int idade;

    public Product(){

    }
    public Product(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public static boolean staticMethod(Product product){
        return product.getName().charAt(0) == 'T';
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}
