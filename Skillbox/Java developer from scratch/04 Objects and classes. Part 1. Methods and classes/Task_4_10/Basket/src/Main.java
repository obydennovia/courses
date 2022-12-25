public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 3, 17);
        basket.print("Milk");
        System.out.println();
        System.out.println("Вес одного товара в корзине: " + basket.getTotalWeight());
        System.out.println();
        basket.add("Apple", 12, 4, 10);
        basket.print("Apple");
        System.out.println();
        System.out.println("Вес двух товаров в корзине: " + basket.getTotalWeight());

    }
}
