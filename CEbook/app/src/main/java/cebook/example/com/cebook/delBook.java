package cebook.example.com.cebook;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class delBook extends AppCompatActivity {
    private EditText bookname;
    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del_book);
        Button regeded = (Button)findViewById(R.id.del_book);
        regeded.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                bookname = (EditText) findViewById(R.id.new_delbookname);
                String booknameS = bookname.getText().toString();
                Intent intent1 = getIntent();
                String user = intent1.getStringExtra("User");
                CommonDatabase commonDatabase = new CommonDatabase();
                SQLiteDatabase db = commonDatabase.getSqliteObject(mContext);
                db.delete("Book","name = ?",new String[]{booknameS});
                Toast.makeText(mContext, "del book succeeded", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(delBook.this,Pbl.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
        });
    }
}