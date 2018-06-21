package cebook.example.com.cebook;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class searchOut extends AppCompatActivity {
    private List<Book> bookList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchout);
        initBooks();
        BookAdapter adapter = new BookAdapter(
                searchOut.this, R.layout.bookitem,bookList);
        ListView listView = (ListView)findViewById(R.id.book_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Book book = bookList.get(position);
                String user = book.getOwner();
                Intent intent = new Intent(searchOut.this,chatwindow.class);
                startActivity(intent);
            }
        });

    }
    private void initBooks(){
        Context mContext = this;
        CommonDatabase commonDatabase = new CommonDatabase();
        SQLiteDatabase db = commonDatabase.getSqliteObject(mContext);
        Intent intent1 = getIntent();
        String keywords = intent1.getStringExtra("keywords");
        String user = intent1.getStringExtra("User");
        Cursor cursor = db.query("Book",null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
                String name = cursor.getString(cursor.getColumnIndex("name"));
                String owner = cursor.getString(cursor.getColumnIndex("owner"));
                if(name.contains(keywords)&& !owner.equals(user)) {
                    Book book1 = new Book(name, owner);
                    bookList.add(book1);
                }
            }while (cursor.moveToNext());
        }
    }
}
