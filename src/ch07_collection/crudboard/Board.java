package ch07_collection.crudboard;

// 이 클래스는 객체 1개를 생성해 내기 위한 탬플릿 클래스로써, 웹 프로그래밍에서 이를 Bean 클래스라고 부릅니다.
public class Board {
    int no; //글번호
    private String title; //제목
    private String writer; //작성자
    private String regDate; //작성일자
    private int readCount; //조회수

    // 생성자, getter, setter, toString() 메소드 구현하기

    public Board() {}

    public Board(int no, String title, String writer, String regDate, int readCount) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.regDate = regDate;
        this.readCount = readCount;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", regDate='" + regDate + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}
