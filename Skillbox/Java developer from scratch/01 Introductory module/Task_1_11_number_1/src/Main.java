public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоимости топлива");

        int fuelType = 95;  // Тип бензина
        int amount = 420;    // Количество литров бензина

        double fuel92price = 60.2;  // Цена 92 бензина
        double fuel95price = 67.33; // Цена 95 бензина
        int maxAmount = 400;

        double fuelPrice = 0;

        if (fuelType == 92) {
            fuelPrice = fuel95price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println("Указан неверный тип топлива");
        }

        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = maxAmount;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}