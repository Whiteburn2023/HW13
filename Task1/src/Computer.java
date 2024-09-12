import display.Display;
import harddisk.Disk;
import keyboard.Keyboard;
import memory.Ram;
import processor.Proc;

public class Computer {
    private final String vendor, name;

    private Proc proc;
    private Ram ram;
    private Disk disk;
    private Display display;
    private Keyboard keyboard;

    public double getTotalWeight() {
        return proc.getWeight() + ram.getWeight() + disk.getWeight() + display.getWeight() + keyboard.getWeight();
    }

    public Computer(String vendor, String name, Proc proc, Ram ram, Disk disk, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.proc = proc;
        this.ram = ram;
        this.disk = disk;
        this.display = display;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Proc getProc() {
        return proc;
    }

    public void setProc(Proc proc) {
        this.proc = proc;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
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
