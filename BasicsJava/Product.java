package BasicsJava;

public class Product {
    String name;
    Product() {
        name = "Laptop";
    }
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.name);
    }
}