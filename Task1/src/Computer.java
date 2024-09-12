public class Computer {
    private final String vendor, name;

    private static Proc proc;
    private static Ram ram;
    private static Disk disk;
    private static Display display;
    private static Keyboard keyboard;

    public static double getTotalWeight() {
        return proc.getWeight() + ram.getWeight() + disk.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public static Proc getProc() {
        return proc;
    }

    public static void setProc(Proc proc) {
        Computer.proc = proc;
    }

    public static Ram getRam() {
        return ram;
    }

    public static void setRam(Ram ram) {
        Computer.ram = ram;
    }

    public static Disk getDisk() {
        return disk;
    }

    public static void setDisk(Disk disk) {
        Computer.disk = disk;
    }

    public static Display getDisplay() {
        return display;
    }

    public static void setDisplay(Display display) {
        Computer.display = display;
    }

    public static Keyboard getKeyboard() {
        return keyboard;
    }

    public static void setKeyboard(Keyboard keyboard) {
        Computer.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                "\n" + getProc()  +
                "\n" + getRam()  +
                "\n" + getDisk()  +
                "\n" + getDisplay()  +
                "\n" + getKeyboard()  +
                "\n" + "Total_weight: "+ getTotalWeight() +
        '}';
    }
}
