package ch04_class;

public class ComputerMain04 {
    public static void main(String[] args) {

        Computer04 cmp1 = new Computer04();
        Computer04 cmp2 = new Computer04();
        Computer04 cmp3 = new Computer04();

        cmp1.setSsdSpeedMBps(2500);
        cmp1.setRamGB(16);
        cmp1.setCores(8);
        cmp1.setCpuGHz(0.0D);

        cmp1.display();

        cmp2.setSsdSpeedMBps(2500);
        cmp2.setRamGB(32);
        cmp2.setCores(16);
        cmp2.setCpuGHz(2.4);

        cmp2.display();

        cmp3.setSsdSpeedMBps(10000);
        cmp3.setRamGB(32);
        cmp3.setCores(24);
        cmp3.setCpuGHz(6.0);

        cmp3.display();

    }
}
