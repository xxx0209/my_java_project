package ch07_collection.crudboard;

// 이 클래스는 객체 1개를 생성해 내기 위한 탬플릿 클래스로써, 웹 프로그래밍에서 이를 Bean 클래스라고 부릅니다.
public class Member {

    private String id; //아이디
    private String name; //이름
    int age; //나이
    private String sex; //작성일자

    // 생성자, getter, setter, toString() 메소드 구현하기
    public Member() {}

    public Member(String id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
