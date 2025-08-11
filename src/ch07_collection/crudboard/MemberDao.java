package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

//DAO 클래스 : 데이터 베이스에게 테이터를 추가/수정/삭제 등의 작업을 요청해주는 중간 middle-ware 클래스
public class MemberDao {

    private List<Member> memberList; //게시물을 담는 통(bottle)

    public MemberDao() {
        this.memberList = new ArrayList<Member>(); //게시물들을 담는 통 초기화
    }

    public int insertData(Member member) {
        System.out.println("회원 아이디 " + member.getId() + "인 회원이 회원에 가입합니다.");
        memberList.add(member);
        return 1;
    }

    public int getSize() {
        return this.memberList.size();
    }

    public List<Member> selectAll() {
        return this.memberList;
    }

    public Member getOne(String findId) {
        //findId는 찾고자 하는 회원 아이디
        Member findData = null; // 반환해줄 데이터 정보

        for (Member member : this.memberList) {
            if (member.getId().equals(findId)) { // 해당 게시물 반결됨
                findData = member; // 해당 객체를 반환하는 데이터에 할당
                break; // 이하 다른 게시물은 볼 필요 없음.
            }
        }

        return findData;

    }

    public int removeData(String deleteId) {
        // deleteId는 삭제하고자 하는 회원 아이디
        int cnt = -1; //-1은 '발견' 여부를 나태내는 flag 변수

        for (Member member : this.memberList) {
            if (member.getId().equals(deleteId)) { // 해당 게시물 반결됨
                this.memberList.remove(member);
                cnt = 1;
                break; // 이하 다른 게시물은 볼 필요 없음.
            } else { //발견 못함.

            }
        }

        return cnt;
    }

    public void removeAllMembers() {
        this.memberList.clear();
    }
}
