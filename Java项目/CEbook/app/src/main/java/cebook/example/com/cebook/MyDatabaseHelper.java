package cebook.example.com.cebook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by ocz11 on 2018/6/7.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_BOOK = "create table Book ("
            + "id integer primary key autoincrement, "
            + "owner text, "
            + "name text)";

    public static final String CREATE_USER = "create table User ("
            + "id integer primary key autoincrement, "
            + "name text, "
            + "username integer, "
            + "password text)";

    public static final String CREATE_PBL = "create table Pbl ("
            + "id integer primary key autoincrement, "
            + "name text)";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name,
                            SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_BOOK);
        db.execSQL(CREATE_USER);
        db.execSQL(CREATE_PBL);
        Toast.makeText(mContext,"create succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("drop table if exists Book");
        db.execSQL("drop table if exists User");
        db.execSQL("drop table if exists Pbl");
        onCreate(db);
    }
}