package cebook.example.com.cebook;

/**
 * Created by ocz11 on 2018/5/28.
 */

public class Message {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;
    public Message(String content, int type){
        this.content = content;
        this.type = type;
    }
    public String getContent(){
        return this.content;
    }
    public int getType(){
        return this.type;
    }
}
