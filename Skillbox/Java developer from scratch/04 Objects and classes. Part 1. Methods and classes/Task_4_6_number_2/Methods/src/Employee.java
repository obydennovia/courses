public class Employee {
    public String name ="";
    public String email = "не задан";
    public int phone = 0;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Employee(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + ((phone > 0) ? phone : "не задан"));
        System.out.println();
    }
}
