package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


//Book 객체 → JSON 문자열:
//{"isbn":"978-1234567890","title":"자바의 정석","author":"남궁성","price":"38000","publisher":"도우출판"}
//
//JSON → Map:
//{isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판}
//
//Map → Pretty JSON:
//{
//  "isbn": "978-1234567890",
//  "title": "자바의 정석",
//  "author": "남궁성",
//  "price": "38000",
//  "publisher": "도우출판"
//}
//
//JSON → Book 객체:
//Book(isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판)

public class BookJson {
    public static void main(String[] args) {

    }
}
