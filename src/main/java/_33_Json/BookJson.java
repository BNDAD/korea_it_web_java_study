package _33_Json;
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


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private String publisher;
}
public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gosnBuilder = new GsonBuilder().setPrettyPrinting().create();
        Book book = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                38000,
                "남궁성"
        );
        //Book 객체 → JSON 문자열:
        String jsonBook = gson.toJson(book);
        System.out.println("Book 객체 → JSON 문자열");
        System.out.println(jsonBook);

        System.out.println();
        // JSON → Map:
        Map<String, String> bookMap = gson.fromJson(jsonBook, Map.class);
        System.out.println("JSON → Map");
        System.out.println(bookMap);

        System.out.println();
//        Map → Pretty JSON:
        String prettyJsonFromMap = gosnBuilder.toJson(bookMap);
        System.out.println(" Map → Pretty JSON:");
        System.out.println(prettyJsonFromMap);

//       JSON → Book 객체:
        Book parsedBook = gson.fromJson(jsonBook, Book.class);
        System.out.println(" JSON → Book 객체");
        System.out.println(parsedBook);

    }
}
