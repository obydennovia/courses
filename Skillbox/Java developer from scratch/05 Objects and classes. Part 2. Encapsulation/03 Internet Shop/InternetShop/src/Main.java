public class Main {
    public static void main(String[] args) {
        Product product = new Product("Milk", 56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);
        product.print();
    }
}
