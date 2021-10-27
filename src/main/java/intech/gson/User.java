package intech.gson;

import lombok.Data;

import java.util.List;

@Data
public class User {

     private long id;
     private String name;
     private List<Book> books;


}
