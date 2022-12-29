import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(EngineType.DIESEL, 13, 15);
        Car car = new Car(engine, CarType.HATCHBACK, 100);
        System.out.println(
                "Тип автомобиля: " + car.getType() + "\n" +
                "Масса двигателя: " + car.getWeight() + "\n" +
                "Тип двигателя: " +  car.getEngine().getEngineType() + "\n" +
                "Объём двигателя: " + car.getEngine().getVolume() + "\n" +
                "Мощность двигателя: " + car.getEngine().getPower() + "\n"
                );
    }
}
