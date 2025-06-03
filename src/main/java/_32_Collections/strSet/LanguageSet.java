package _32_Collections.strSet;

import java.util.*;
//문제
//1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"
//리스트 만들어서 추가
//2. set하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기 => 제거한 후 set출력
//3. 정렬을 위해서 다시 List하나 만들고 set에 있던 요소들을 list에 넣기
//4. 요소들을 넣은 리스트를 정렬하고 정렬된 언어 목록 출력하기
//5. searchLang변수에 "Java" 대입하고 해당 변수를 이용해서 리스트에서 몇개 있는지 출력 (검색)
//6. 중복 제거를 위해 만들었던 set를 이용해서 중복제거된 후의 언어 갯수 출력하기
public class LanguageSet {
    public static void main(String[] args) {
        // 1. 리스트 생성 및 요소 추가
        List<String> langList = new ArrayList<>(Arrays.asList(
                "JAVA", "Python", "C", "Python", "JAVA", "JAVA", "C++", "C", "JAVA"
        ));
        System.out.println("전체 언어 목록");
        System.out.println(langList);
        System.out.println();

        // 2. Set을 만들어 리스트의 요소들을 넣어 중복 제거
        Set<String> langSet = new HashSet<>(langList);
        System.out.println("중복 제거 후(Set): " + langSet);
        System.out.println();

        // 3. 정렬을 위해 Set의 요소들을 다시 List에 넣기
        List<String> sortedList = new ArrayList<>(langSet);

        // 4. 리스트 정렬 및 출력
        Collections.sort(sortedList);
        System.out.println("정렬된 언어 목록: " + sortedList);

        // 5. "Java"가 리스트에 몇 개 있는지 출력 (대소문자 구분 없이)
        String searchLang = "Java";
//        int count = 0;
//        for (String lang : langList) {
//            if (lang.equalsIgnoreCase(searchLang)) {
//                count++;
//            }
//        }
//        System.out.println("\"" + searchLang + "\"의 개수: " + count);

        int frequency = Collections.frequency(langList, searchLang);
        System.out.println("Java는 총" + frequency + "개 있습니다.");

        // 6. Set을 이용해 중복 제거된 언어의 개수 출력
        System.out.println("중복 제거된 언어의 개수: " + langSet.size());
    }
}
