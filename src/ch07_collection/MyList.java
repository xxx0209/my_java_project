package ch07_collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("아메리카노");
        list.add("카페라떼");
        list.add("에스프레소");
        list.add("마키야또");
        list.add("카페라떼");

        int idx = -1;
        String findData = "카페라떼";
        idx = list.indexOf(findData);
        idx = list.lastIndexOf(findData);

        System.out.println("index : " + idx);

        findData = "카푸치노";
        if (list.indexOf(findData) == -1) {
            list.add(findData);
        }

        System.out.println("------------------------------------");
        for(Object obj: list) {
            System.out.println(obj);
        }

        System.out.println("요소크기 : " + list.size());
    }
}
