public class Main {
    public static void main(String[] args) {
        Country country = new Country("Russia");
        country.setCapital("Moscow");
        System.out.println(country.getCapital());
        System.out.println(country.getName());
        country.setSeaExit(true);
        System.out.println(country.getSeaExit());
    }
}
