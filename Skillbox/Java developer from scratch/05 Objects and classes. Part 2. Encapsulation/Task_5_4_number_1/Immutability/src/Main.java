public class Main {
    public static void main(String[] args) {
        Product product = new Product("Milk", "12345");
        product.setPrice(43);
        System.out.println(product.getName());
        System.out.println(product.getBarCode());
        System.out.println(product.getPrice());
    }
}
