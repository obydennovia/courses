public class Main {
    public static void main(String[] args) {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        System.out.println(moneyCalculator.calculateCassetteCount(4005) + "\n");

        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        int visits = analytics.countVisit();
        System.out.println("Всего посещений: " + visits);
    }
}
