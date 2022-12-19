public class Main {
    public static void main(String[] args) {
        int maxWeight = 3200;
        int minCost = 1000;

        int weight = 6000;
        int cost = 750;

        if ((weight <= maxWeight) && (cost >= minCost)) {
            System.out.println("Доставка бесплатная");
        }
    }
}