public class Computer {
    private final String vendor;
    private final String name;

    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Display display;
    private Keyboard keyboard;

    public Computer(String vendor, String name, Processor processor, RAM ram, Storage storage, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
    }

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer setProcessor(Processor processor){
        return new Computer(vendor, name, processor, ram, storage, display, keyboard);
    }

    public Computer setRAM(RAM ram){
        return new Computer(vendor, name, processor, ram, storage, display, keyboard);
    }

    public Computer setStorage(Storage storage){
        return new Computer(vendor, name, processor, ram, storage, display, keyboard);
    }

    public Computer setDisplay(Display display){
        return new Computer(vendor, name, processor, ram, storage, display, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard){
        return new Computer(vendor, name, processor, ram, storage, display, keyboard);
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getWeight() {
        return processor.getWeight() + ram.getWeight() + storage.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return "Vendor: " + getVendor() + "\n" +
                "Name: " + getName() + "\n" +
                "Processor: " + processor.getFrequency() + " GHz, " + processor.getCores() + " Cores, " +
                processor.getManufacturer() + ", " + processor.getWeight() + " g\n" +
                "RAM: " + ram.getRamType() + ", "+ ram.getVolume() + " Gb, " + ram.getWeight() + " g\n" +
                "Storage: " + storage.getStorageType() + ", " + storage.getVolume() + " Gb, " +
                storage.getWeight() + " g\n" +
                "Display: " + display.getDiagonal() + " inch, " + display.getDisplayType() + ", " +
                display.getWeight() + " kg\n" +
                "Keyboard: " + keyboard.getKeyBoardType() + ", " + keyboard.isLight() + " light, " +
                keyboard.getWeight() + " g\n" +
                "Weight: " + getWeight() + " g";
    }
}
