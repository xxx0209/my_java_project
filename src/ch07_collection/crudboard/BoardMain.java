package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {

    public static void main(String[] args) {

        Board data01 = new Board(10, "여름 폭염", "김철수", "2025/08/10",5);

        Board data02 = new Board(9, "폭염 폭염", "홍길동", "2025/07/10",3);

        Board data03 = new Board(8, "홈플러스", "이수영", "2025/08/10",8);

        BoardDao dao = new BoardDao();

        dao.insertData(data01);
        dao.insertData(data02);
        dao.insertData(data03);
        dao.insertData(new Board(7, "서이초등학교", "금잔디", "2025/11/11",4));
        dao.insertData(new Board(6, "남극탐험", "이강우", "2025/11/11",11));

        System.out.println("요소 개수 : " + dao.getSize());

        System.out.println("\n전체 개시물 목록을 조회합니다.");

        List<Board> boardList = dao.selectAll();

        for(Board board : boardList) {
            int no = board.getNo();
            String title = board.getTitle();
            String writer = board.getWriter();
            String regData = board.getRegDate();
            int readCount = board.getReadCount();

            String message = no + "\t" + title + "\t" + writer + "\t" + regData +  "\t" + readCount + "\t";
            System.out.println(message);
        }

        System.out.println("\n게시물 번호를 이용하여 특정 게시물을 조회합니다.");
        int findId = 7; //칮고자 하는 게시물 번호

        Board board = dao.getOne(findId);

        if(board == null) {
            System.out.println(findId + "게시물은 존재하지 않습니다.");
        } else {
            String message = board.getNo() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t" + board.getRegDate() +  "\t" + board.getReadCount() + "\t";
            System.out.println(message);
        }

        System.out.println("\n게시물 번호를 이용하여 특정 게사물을 삭제합니다.");
        int deleteId = 8; //삭제하고자 하는 게시물 번호

        int result = dao.removeData(deleteId);

        if (result > 0) {
            System.out.println(deleteId + " 게시물을 삭제하였습니다.");
        } else {
            System.out.println(deleteId + " 게시물을 발견하지 못했습니다.");
        }
        System.out.println("\nbefore all delete : " + dao.getSize());
        System.out.println("게시물 목록을 전부 삭제합니다.");
        dao.removeAllBoards();

        System.out.println("after all deleted : " + dao.getSize());
    }

}
