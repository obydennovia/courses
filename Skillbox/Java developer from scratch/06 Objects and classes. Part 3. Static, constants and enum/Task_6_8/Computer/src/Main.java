public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor(1100, 1, "Intel", 1.1);
        RAM ram1 = new RAM(RAMType.DDR3, 1.4, 1.2);
        Storage storage1 = new Storage(StorageType.SSD, 1.4, 1.3);
        Display display1 = new Display(17.1, DisplayType.IPS, 1.4);
        Keyboard keyboard1 = new Keyboard(KeyBoardType.BLUETOOTH, false, 1.5);
        Computer computer1 = new Computer("Vendor1", "Name1", processor1, ram1, storage1, display1, keyboard1);
        System.out.println("Computer #1 information");
        System.out.println("----------");
        System.out.println(computer1.toString());
        System.out.println("----------");
        System.out.println();

        Processor processor2 = new Processor(2200, 2, "AMD", 2.1);
        RAM ram2 = new RAM(RAMType.DDR5, 2.4, 2.2);
        Storage storage2 = new Storage(StorageType.HDD, 2.4, 2.3);
        Display display2 = new Display(17.2, DisplayType.VA, 2.4);
        Keyboard keyboard2 = new Keyboard(KeyBoardType.MAGIC, true, 2.5);
        Computer computer2 = new Computer("Vendor2", "Name2", processor2, ram2, storage2, display2, keyboard2);
        System.out.println("Computer #2 information");
        System.out.println("----------");
        System.out.println(computer2.toString());
        System.out.println("----------");
        System.out.println();
    }
}
