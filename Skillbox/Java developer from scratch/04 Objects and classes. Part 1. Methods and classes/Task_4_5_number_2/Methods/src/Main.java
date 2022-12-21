public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addProducts(201, 40000);
        order1.addProducts(317, 12000);
        System.out.println("Количество: " + order1.getProductsCount());
        System.out.println("Стоимость: " + order1.getTotalCost());
    }
}
