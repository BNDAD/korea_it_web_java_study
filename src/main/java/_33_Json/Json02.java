package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}
public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        //java 객체 -> json
        String userJson = null;

        User user = new User(
                "백년",
                "9876",
                "bn@bn.com",
                "김백년",
                "4"
        );

        System.out.println("user객체: " + user);
        System.out.println();
        userJson = gson.toJson(user);
        System.out.println("gson만 사용: " + userJson);
        System.out.println();

        userJson = gsonBuilder.toJson(user);// => user객체를 json형태로 예쁘게 변환
        System.out.println("gsonBuilder사용: " + userJson);
        System.out.println();

        //JsonObject -> json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", 2025001);
        jsonObject1.addProperty("studentName", "김백년");
        jsonObject1.addProperty("studentYear", 4);
        jsonObject1.addProperty("score", 100);

        String studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 사용: " + studentJson);
        System.out.println();
        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println();
        System.out.println("gsonBuilder사용: " + studentJson);
        System.out.println();


        //Map -> Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960");
        map1.put("productName", "삼성 갤럭시북 프로 5");
        System.out.println("gson 사용: " + gson.toJson(map1));
        System.out.println();
        System.out.println("gsonBuilder 사용: " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);
        System.out.println();

        //json -> Map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);
        System.out.println();

        //json -> User
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);
        System.out.println();

        //json -> jsonObject => json과 jsonObject는 같은 형태가 아니다
        //studentJson의 자료형은 String -> jsonObject의 자료형 JsonObject
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
