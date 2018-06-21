package cebook.example.com.cebook;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText ID;
    private EditText password;
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                CommonDatabase commonDatabase = new CommonDatabase();
                SQLiteDatabase db = commonDatabase.getSqliteObject(mContext);
                Intent intent = new Intent(Login.this,MainActivity.class);
                Cursor cursor = db.query("User",null,null,null,null,null,null);
                int number = 0;
                ID = (EditText)findViewById(R.id.username);
                String IDS = ID.getText().toString();
                password = (EditText)findViewById(R.id.keyL);
                String passwordS = password.getText().toString();
                if(cursor.moveToFirst()){
                    do{
                        String dbID = cursor.getString(cursor.getColumnIndex("username"));
                        String dbPassword = cursor.getString(cursor.getColumnIndex("password"));
                        if(IDS.equals("")){
                            Toast.makeText(mContext,"please input your username",Toast.LENGTH_SHORT).show();
                        }
                        else if(passwordS.equals("")){
                            Toast.makeText(mContext,"please input your password",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            if (IDS.equals(dbID)) {
                                number = 1;
                                if (passwordS.equals(dbPassword)) {
                                    String dbUser = cursor.getString(cursor.getColumnIndex("name"));
                                    intent.putExtra("User",dbUser);
                                    intent.putExtra("username",dbID);
                                    startActivity(intent);
                                } else
                                    Toast.makeText(mContext, "password error", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }while(cursor.moveToNext());
                    if (number == 0&&!IDS.equals(""))
                        Toast.makeText(mContext, "username error", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Button reg = (Button)findViewById(R.id.register);
        reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,register.class);
                startActivity(intent);
            }
        });
    }
}
