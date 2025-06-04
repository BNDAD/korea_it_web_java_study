package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject orderjson = new JsonObject();
        orderjson.addProperty("orderId", "ORD123456" );
        orderjson.addProperty("customer", "곽두팔");
        orderjson.addProperty("product", "에어팟 프로 2세대" );
        orderjson.addProperty("quantity", 1 );
        orderjson.addProperty("price", 349000 );

        JsonObject address = new JsonObject();
        address.addProperty("receiver", "곽두팔");
        address.addProperty("phone", "010-5678-1234");
        address.addProperty("city", "서울");
        address.addProperty("district", "마포구");
        address.addProperty("zipCode", 04123);

        orderjson.add("address", address);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(orderjson);
        System.out.println(json2);
    }

}
