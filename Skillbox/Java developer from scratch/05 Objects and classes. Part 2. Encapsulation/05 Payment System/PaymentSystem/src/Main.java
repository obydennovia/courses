public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("123123123123");
        Company company = new Company("Smart", details);
        //some code
        System.out.println(company);
        details.setBillNumber("asdasdasd");
        System.out.println(company);
    }
}
