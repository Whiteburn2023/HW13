import display.Display;
import display.DisplayType;
import harddisk.Disk;
import harddisk.DiskStorageType;
import keyboard.Keyboard;
import keyboard.KeyboardLight;
import keyboard.KeyboardType;
import memory.Ram;
import memory.RamType;
import processor.Proc;
import processor.ProcBrend;
import processor.ProcCore;
import processor.ProcFrq;

public class Main {
    public static void main(String[] args) {
        Proc proc = new Proc(ProcFrq.CPU_2_8 , ProcCore.CORE_8, ProcBrend.AMD, 0.2);
        Ram ram = new Ram(RamType.DDR4, 16, 0.3);
        Disk disk = new Disk(DiskStorageType.HDD, 500.0, 0.7);
        Display display = new Display(24, DisplayType.IPS, 4.2);
        Keyboard keyboard = new Keyboard(KeyboardType.MEMBRANE, KeyboardLight.NO, 0.8);
        Computer computer = new Computer("Dell", "comp1", proc, ram, disk, display, keyboard);
        System.out.println(computer);

        System.out.println(computer.getTotalWeight());

        Proc proc1 = new Proc(ProcFrq.CPU_3_2 , ProcCore.CORE_16, ProcBrend.Intel, 0.3);
        Ram ram1 = new Ram(RamType.DDR5, 32, 0.7);
        Disk disk1 = new Disk(DiskStorageType.SSD, 500.0, 0.6);
        Display display1 = new Display(27, DisplayType.VA, 4.8);
        Keyboard keyboard1 = new Keyboard(KeyboardType.MECHANICAL, KeyboardLight.YES, 0.9);
        Computer computer1 = new Computer("MSI", "catane", proc1, ram1, disk1, display1, keyboard1);
        System.out.println(computer1);


        /*
        calc.ArithmeticCalculator arithmeticCalculator = new calc.ArithmeticCalculator(4, 8);
        arithmeticCalculator.calculate(calc.Operation.ADD);
        arithmeticCalculator.calculate(calc.Operation.MULTIPLY);
        arithmeticCalculator.calculate(calc.Operation.SUBSTRACT);

         */

    }
}