public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 20);
        Product product2 = new Product("Bred", 7);
        Product product3 = new Product("Apple", 23);
        Product product4 = new Product("Peach", 13);
        Product product5 = new Product("Mellow", 27);
        Product product6 = new Product("Toy", 17);
        Product product7 = new Product("Car", 2);

        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());
    }
}
