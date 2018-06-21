package cebook.example.com.cebook;


/**
 * Created by ocz11 on 2018/6/11.
 */

public class NewBook {
    private String name;
    private int imageID;
    public NewBook(String name, int imageID){
        this.name = name;
        this.imageID= imageID;
    }
    public String getName(){
        return this.name;
    }
    public int getImageID(){
        return this.imageID;
    }
}
