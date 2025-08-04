package ch05_package_inheritance.mysport;

public class Football extends Sport{
    private int halves; //하프 타임
    private int golas; //골수

    public Football(String name, int entry, int halves, int golas) {
        super(name, entry);
        this.halves = halves;
        this.golas = golas;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("%d개의 하프타임으로 구성이 되며, %d 골이 들어갔습니다.!", halves, golas);
        System.out.println();
    }
}
