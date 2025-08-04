package ch05_package_inheritance.mysport;

public class Baseball extends Sport {
    private int innings; // 이닝 수
    private double hitrate; // 타율


    public Baseball(String name, int entry, int innings, double hitrate) {
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("%d개의 이닝으로 구성이 되며, 타율 %5.3f 를 기록하였습니다.", innings, hitrate);
        System.out.println();
    }
}
