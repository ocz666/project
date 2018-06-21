package cebook.example.com.cebook;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        ImageButton pbl = (ImageButton)findViewById(R.id.pbl);
        pbl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                CommonDatabase commonDatabase = new CommonDatabase();
                /*SQLiteDatabase db = commonDatabase.getSqliteObject(mContext);
                ContentValues values = new ContentValues();
                db.delete("User",null,null);
                db.delete("Book",null,null);
                db.delete("Pbl",null,null);
                values.put("name","User1");
                values.put("username","123456");
                values.put("password","123456");
                db.insert("User",null,values);
                values.clear();
                values.put("name","User2");
                values.put("username","234567");
                values.put("password","123456");
                db.insert("User",null,values);
                values.clear();
                values.put("name","钟鼓楼");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","战争与和平");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","永别了武器");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","三体");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","全球通史");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","挪威的森林");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","活着");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","哈姆雷特");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","窗边的小豆豆");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();
                values.put("name","全球通史");
                db.insert("Pbl",null,values);
                values.put("owner","User1");
                db.insert("Book",null,values);
                values.clear();*/
                Intent intent = new Intent(MainActivity.this,Pbl.class);
                Intent intent1 = getIntent();
                String User = intent1.getStringExtra("User");
                intent.putExtra("User",User);
                startActivity(intent);
            }
        });
        Button search = (Button)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,searchOut.class);
                editText = (EditText)findViewById(R.id.keywords);
                String inputText = editText.getText().toString();
                if("".equals(inputText)) {
                    Toast.makeText(mContext, "please input keywords", Toast.LENGTH_SHORT).show();
                }
                else{
                    intent.putExtra("keywords", inputText);
                    Intent intent1 = getIntent();
                    String User = intent1.getStringExtra("User");
                    intent.putExtra("User", User);
                    startActivity(intent);
                }

            }
        });
        ImageButton personalinfomation = (ImageButton)findViewById(R.id.gerenzhuye);
        personalinfomation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,personalInfo.class);
                Intent intent1 = getIntent();
                String User = intent1.getStringExtra("User");
                String username = intent1.getStringExtra("username");
                intent.putExtra("User",User);
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });
        ImageButton image1 = (ImageButton)findViewById(R.id.image_view1);
        image1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,One.class);
                startActivity(intent);
            }
        });
        ImageButton image2 = (ImageButton)findViewById(R.id.image_view2);
        image2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,recBook.class);
                startActivity(intent);
            }
        });
    }
}
