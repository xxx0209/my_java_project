package ch07_collection;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<String, Integer>();

        teamMap.put("LG", 1);
        teamMap.put("SSG", 2);
        teamMap.put("두산", 3);
        teamMap.put("KT", 4);

        String findItem = "NC";
        teamMap.containsKey(findItem);

        // 'NC' 팀이 존재하는지 체크하고, 없으면 순위 5위로 추가해 주세요.
        if (!teamMap.containsKey(findItem)){
            teamMap.put(findItem, 5);
        }

        // 순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 'KIA'를 추가해 주세요.
        // 그리고, 존재 여부를 적절한 문구로 출력해 주세요.
        final int pos = 6; //순위
        if (!teamMap.containsValue(pos)) {
            System.out.println("KIA가 존재하지 않아 "+ pos+ "위로추가합니다.");
            teamMap.put("KIA", pos);
        } else {
            System.out.println("KIA가 존재합니다.");
        }

        System.out.println("요소 크기 : " + teamMap);

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i], i +7);
        }
        System.out.println("===========================================================");
        findItem = "한화";
        Integer rank = teamMap.get(findItem);
        if (rank == null) {
            System.out.println(findItem + "팀은 존재하지 않습니다.");
        } else {
            String message = "팀명 : " + findItem + ", 순위 : " + rank;
            System.out.println(message);
        }

        System.out.println("다음 팀들의 순위 정보를 출력해 주세요.");
        String[] findTeams = {"두산", "KT", "빙그레"};
        for(String str:findTeams) {
            System.out.println(teamMap.get(str)); ;
        }


        System.out.println("===========================================================");
        System.out.println("요소 크기 : " + teamMap.size());
        System.out.println(teamMap);

        Set<String> items = teamMap.keySet();

        for (String key:items) {
            String message = key + "팀은 순위가 " + teamMap.get(key) + "위 입니다.";
            System.out.println(message);
        }

        teamMap.clear();

        if(teamMap.isEmpty()) {
            System.out.println("teamMap is empty");
        } else {
            System.out.println("teamMap is not empty");
        }

        //teamMap = Collections.synchronizedMap(teamMap);
        
    }
}
