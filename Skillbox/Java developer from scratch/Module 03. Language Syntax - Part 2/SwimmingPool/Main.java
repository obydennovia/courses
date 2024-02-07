public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int currentVolume = 0;
        int fillingTime = 0;

        while (true) {
            if (currentVolume < volume) {
                currentVolume = currentVolume + fillingSpeed - devastationSpeed;
                fillingTime = fillingTime + 1;
            } else {
                break;
            }
        }

        System.out.println("Pool fill time: " + fillingTime + " minute(s)");
    }
}
