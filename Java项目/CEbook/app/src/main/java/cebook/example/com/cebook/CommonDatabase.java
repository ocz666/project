package cebook.example.com.cebook;

import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

/**
 * Created by ocz11 on 2018/6/9.
 */

public class CommonDatabase {
    private MyDatabaseHelper dbHelper;
    private SQLiteDatabase sqlite;
    public SQLiteDatabase getSqliteObject(Context context){
        dbHelper = new MyDatabaseHelper(context,"DataStore.db",null,13);
        sqlite = dbHelper.getWritableDatabase();
        return sqlite;
    }
}
