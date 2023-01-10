public class Main {
    public static void main(String[] args) {
        //4_10 Task 1 begin
        Arithmetic arithmetic = new Arithmetic(100,101);

        arithmetic.sumAB();
        arithmetic.multiAB();
        arithmetic.maxAB();
        arithmetic.minAB();
        //4_10 Task 1 end

        System.out.println();

        //4_10 Task 2 begin
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
        //4_10 Task 2 end

        //6_8 Task 1 begin
        Basket basket1 = new Basket();
        basket1.add("Milk", 3, 1, 17.05);
        basket1.add("Apple", 6, 1, 10.37);

        Basket basket2 = new Basket();
        basket2.add("Bred", 7, 1, 1.5);
        basket2.add("Potato", 13, 3, 10.7);

        System.out.println();
        System.out.println("Всего корзин: " + Basket.getCount()); //3 корзины с учётом корзины basket из задания 4_10
        System.out.println("Средняя цена товара в корзине: " + Basket.averagePrice());
        System.out.println("Средняя стоимость корзины: " + Basket.averageBasketPrice());
        //6_8 Task 1 end
    }
}
