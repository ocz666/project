package cebook.example.com.cebook;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.*;

public class Pbl extends AppCompatActivity {
    private List<Book> bookList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbl);
        initBooks();
        BookAdapter adapter = new BookAdapter(
                Pbl.this, R.layout.bookitem,bookList);
        ListView listView = (ListView)findViewById(R.id.book_list);
        listView.setAdapter(adapter);
        ImageButton add = (ImageButton)findViewById(R.id.tianjiashuji);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pbl.this,addBook.class);
                Intent intent1 = getIntent();
                String User = intent1.getStringExtra("User");
                intent.putExtra("User",User);
                startActivity(intent);
                finish();
            }
        });
        ImageButton del = (ImageButton)findViewById(R.id.shanchushuji);
        del.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pbl.this,delBook.class);
                Intent intent1 = getIntent();
                String User = intent1.getStringExtra("User");
                intent.putExtra("User",User);
                startActivity(intent);
                finish();
            }
        });
    }
    private void initBooks(){
        Context mContext = this;
        CommonDatabase commonDatabase = new CommonDatabase();
        SQLiteDatabase db = commonDatabase.getSqliteObject(mContext);
        Intent intent1 = getIntent();
        String User = intent1.getStringExtra("User");
        Cursor cursor = db.query("Book",null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
                String name = cursor.getString(cursor.getColumnIndex("name"));
                String owner = cursor.getString(cursor.getColumnIndex("owner"));
                if(owner ==null||name == null){

                }
                else if(owner.equals(User)) {
                    Book book1 = new Book(name, owner);
                    bookList.add(book1);
                }
            }while (cursor.moveToNext());
        }
    }
}
