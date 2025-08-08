package ch04_class;

public class ComputerMain {
    public static void main(String[] args) {

        Computer cmp1 = new Computer();
        Computer cmp2 = new Computer();
        Computer cmp3 = new Computer();

        cmp1.cpuGHz = 2.4;
        cmp1.cores = 8;
        cmp1.ramGB = 16;
        cmp1.ssdSpeedMBps = 2500;

        cmp1.display();

        cmp2.cpuGHz = 2.4;
        cmp2.cores = 16;
        cmp2.ramGB = 32;
        cmp2.ssdSpeedMBps = 2500;

        cmp2.display();

        cmp3.cpuGHz = 6.0;
        cmp3.cores = 24;
        cmp3.ramGB = 32;
        cmp3.ssdSpeedMBps = 10000;

        cmp3.display();

    }
}
