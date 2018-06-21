package cebook.example.com.cebook;

/**
 * Created by ocz11 on 2018/6/2.
 */

public class User {
    private String name;
    private String password;
    private String ID;
    private int imageID;
    public User(String name,String password,String ID,int imageID){
        this.name = name;
        this.password = password;
        this.ID = ID;
        this.imageID = imageID;
    }
    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }
    public String getID(){
        return this.ID;
    }
    public int getImageID(){
        return this.imageID;
    }
}
