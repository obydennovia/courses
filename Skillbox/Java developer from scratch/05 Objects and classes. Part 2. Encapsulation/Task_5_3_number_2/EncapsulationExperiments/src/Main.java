import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        Field field = new Field("WOOL");
        System.out.println(field.getName());
        field.setGreen(false);
        System.out.println(field.getGreen());
        field.setSideA(4.5);
        System.out.println(field.getSideA());
        field.setSideB(5);
        System.out.println(field.getSideB());
    }
}
