package cebook.example.com.cebook;

/**
 * Created by ocz11 on 2018/5/28.
 */

public class Book {
    private String name;
    private String owner;

    public Book(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }
}
