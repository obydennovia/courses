public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addProducts(54);
        order1.addProducts(600);
        System.out.println(order1.getProductsCount());
    }
}
