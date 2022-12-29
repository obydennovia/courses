public class BankDetails {
    public BankDetails(String billNumber, String correspondenceBill, String bikNumber, String bankName, String city) {
        this.billNumber = billNumber;
        this.correspondenceBill = correspondenceBill;
        this.bikNumber = bikNumber;
        this.bankName = bankName;
        this.city = city;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public void setCorrespondenceBill(String correspondenceBill) {
        this.correspondenceBill = correspondenceBill;
    }

    public void setBikNumber(String bikNumber) {
        this.bikNumber = bikNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String billNumber;
    private String correspondenceBill;
    private String bikNumber;
    private String bankName;
    private String city;

    public String getBillNumber() {
        return billNumber;
    }

    public String getCorrespondenceBill() {
        return correspondenceBill;
    }

    public String getBikNumber() {
        return bikNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getCity() {
        return city;
    }

    public BankDetails() {
        billNumber = "N/A";
        correspondenceBill = "N/A";
        bikNumber = "N/A";
        bankName = "N/A";
        city = "N/A";
    }

    public String toString() {
        return "bill: " + billNumber + "\n" + "c/b: " + correspondenceBill + "\n" + "bik: " + bikNumber + "\n" + "in " + bankName + " (" + city + ")";
    }
}
