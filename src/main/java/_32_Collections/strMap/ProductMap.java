package _32_Collections.strMap;


//문제
//1. 스캐너 객체 하나 생성,
// 변수명이 productMap인 hashMap생성(키: String, 값: Integer)
//2. 상품 등록하기 라고 출력하고 for문 이용, 5번 반복, 상품명(키)입력받고 가격(값)입력받고 추가
// **상품명을 입력받고 공백을 꼭 제거 할 것**
//3. 전체 상품을 출력하기 => for each 사용
//4. 상품 가격 수정 => 수정할 상품명 입력받고(공백제거)
//=>입력한 상품이 존재하면 가격을 입력받고
//만약에 존재하지 않으면 존재하지 않는다고 출력
//5. 특정 상품 검색 => 검색할 상품명 입력받고(공백제거)
//=>입력한 상품이 productMap에 있는지부터 확인하고 있으면 해당상품명과 가격 출력
//=>없으면 없다고 출력
//6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬하기 => 정렬하고 for each출력
//7. 정렬하기 역순 => 역순 정렬하고 for each출력

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {
        // 1. 스캐너 객체 생성, productMap HashMap 생성
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> productMap = new HashMap<>();

        // 2. 상품 등록하기
        System.out.println("상품 등록하기");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 상품명 입력: ");
            String name = sc.nextLine().trim(); // 공백 제거
            System.out.print("가격 입력: ");
            int price = Integer.parseInt(sc.nextLine().trim());
            productMap.put(name, price);
        }

        // 3. 전체 상품 출력하기 (for-each)
        System.out.println("\n전체 상품 목록:");
        for (String key : productMap.keySet()) {
            System.out.println("상품명: " + key + ", 가격: " + productMap.get(key) + "원");
        }

        // 4. 상품 가격 수정
        System.out.print("\n가격을 수정할 상품명 입력: ");
        String modifyName = sc.nextLine().trim();
        if (productMap.containsKey(modifyName)) {
            System.out.print("새로운 가격 입력: ");
            int newPrice = Integer.parseInt(sc.nextLine().trim());
            productMap.put(modifyName, newPrice);
            System.out.println("가격이 수정되었습니다.");
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }

        // 5. 특정 상품 검색
        System.out.print("\n검색할 상품명 입력: ");
        String searchName = sc.nextLine().trim();
        if (productMap.containsKey(searchName)) {
            System.out.println("상품명: " + searchName + ", 가격: " + productMap.get(searchName) + "원");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

        // 6. 정렬하기 (키 기준 오름차순)
        List<String> keyList = new ArrayList<>(productMap.keySet());
        Collections.sort(keyList);
        System.out.println("\n상품명 오름차순 정렬:");
        for (String key : keyList) {
            System.out.println("상품명: " + key + ", 가격: " + productMap.get(key) + "원");
        }

        // 7. 정렬하기 (키 기준 역순)
        Collections.sort(keyList, Collections.reverseOrder());
        System.out.println("\n상품명 내림차순 정렬:");
        for (String key : keyList) {
            System.out.println("상품명: " + key + ", 가격: " + productMap.get(key) + "원");
        }

        sc.close();
    }
}
