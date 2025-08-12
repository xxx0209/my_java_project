package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();
        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear();

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        System.out.println("요소 크기 : " + set.contains("카푸치노"));
        System.out.println("요소 크기 : " + set.size());

        String findData = "카푸치노";

        if (set.contains(findData)) {
            System.out.println(findData + " 있음");
        } else {
            System.out.println(findData +" 없음");
        }

        // '마키야또'가 존재하는 지 확인하고, 없으면 추가해 보세요.
        String addData = "마키야또";

        if (set.contains(addData)) {
            System.out.println(addData + " 있음");
        } else {
            System.out.println(addData +" 없음 추가");
            set.add(addData);
        }
        System.out.println("요소 크기 : " + set.size());

        // remove() 메소드를 사용 '믹스커피'가 존재하면 삭제하고 '삭제 성공'이라는 문구를 출력해 주세요.
        // 없으면 '존재하지 않음' 이라는 문구를 출력해 주세요.
        findData = "믹스커피";
        if (set.contains(findData)) {
            set.remove(findData);
            System.out.println(findData + " 삭제 성공");
        } else {
            //set.add(findData);
            System.out.println(findData +" 존재하지 않음");
        }
        System.out.println("확장 for 구문을 이용한 요소 출력");
        //for(타입 단수이름:복수이름){...}
        for (Object item:set){
            System.out.println("아이템 : " + item);
        }

        System.out.println("요소 크기 : " + set.size());
    }
}
