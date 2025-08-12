package ch04_class;

public class Computer {
    double cpuGHz;
    int cores;
    int ramGB;
    int ssdSpeedMBps;
    double score = 0.0;

    double calculatePerformanceScore() {
        // 간단한 가중치 기반 계산
        double cpuScore = cpuGHz * cores * 10;
        double ramScore = ramGB * 2;
        double ssdScore = ssdSpeedMBps / 10.0;

        return cpuScore + ramScore + ssdScore;
    }

    String showPerfomance() {

        score = calculatePerformanceScore();
        //System.out.println("-->" + score);
        String msg = "";

        if (score > 2000){
            msg = "최고급 사양";
        } else if (score > 1000) {
            msg = "고급 사양";
        } else if (score > 500) {
            msg = "일반 사양";
        } else {
            msg = "저사양";
        }

        String message =  msg + "("+score+"점) 입니다.";
        return message;
    }

    void display() {
        System.out.println("컴퓨터 성능정보");
        System.out.println("CPU 코어수 : " + cores);
        System.out.println("램 용량    : " + ramGB);
        System.out.println("저장속도   : " + ssdSpeedMBps);
        System.out.println(showPerfomance());
        System.out.println();

    }
}
