package ch07_collection.crudboard;

import ch07_collection.crudboard.Member;
import ch07_collection.crudboard.MemberDao;

import java.util.List;

public class MemberMain {

    public static void main(String[] args) {

        Member data01 = new Member("kim", "김만수", 10, "남자");
        Member data02 = new Member("park", "박영희", 20, "여자");
        Member data03 = new Member("lee", "이수영", 30, "여자");
        Member data04 = new Member("choi", "최윤식", 40, "남자");
      

        MemberDao dao = new MemberDao();

        dao.insertData(data01);
        dao.insertData(data02);
        dao.insertData(data03);
        dao.insertData(data04);

        System.out.println("요소 개수 : " + dao.getSize());

        System.out.println("\n모든 회원 정보를 출력합니다.");

        List<Member> MemberList = dao.selectAll();

        for(Member member : MemberList) {
            String id = member.getId();
            String name = member.getName();
            int age = member.getAge();
            String sex = member.getSex();

            String message = id + "\t" + name + "\t" + age + "\t" + sex + "\t";
            System.out.println(message);
        }

        System.out.println("\n회원정보 번호를 이용하여 특정 회원정보을 조회합니다.");
        String findId = "kim"; //칮고자 하는 회원정보 번호

        Member member = dao.getOne(findId);

        if(member == null) {
            System.out.println(findId + "회원정보은 존재하지 않습니다.");
        } else {
            System.out.println(member.toString());
        }

        System.out.println("\n회원정보 번호를 이용하여 특정 게사물을 삭제합니다.");
        String deleteId = "kim"; //삭제하고자 하는 회원정보 번호

        int result = dao.removeData(deleteId);

        if (result > 0) {
            System.out.println(deleteId + " 회원정보을 삭제하였습니다.");
        } else {
            System.out.println(deleteId + " 회원정보을 발견하지 못했습니다.");
        }
        System.out.println("\nbefore all delete : " + dao.getSize());
        System.out.println("회원정보 목록을 전부 삭제합니다.");
        dao.removeAllMembers();

        System.out.println("after all deleted : " + dao.getSize());
    }

}
