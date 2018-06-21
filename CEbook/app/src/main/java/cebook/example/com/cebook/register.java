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
import android.content.Context;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class register extends AppCompatActivity {
    private EditText name;
    private EditText ID;
    private EditText password;
    private EditText passwordc;
    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button reged = (Button)findViewById(R.id.login_registered);
        reged.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this,Login.class);
                startActivity(intent);
            }
        });
        Button regeded = (Button)findViewById(R.id.registered);
        regeded.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(register.this,Login.class);
                name = (EditText)findViewById(R.id.Rusername);
                String nameS = name.getText().toString();
                ID = (EditText)findViewById(R.id.ID);
                String IDS = ID.getText().toString();
                password = (EditText)findViewById(R.id.key);
                String passwordS = password.getText().toString();
                passwordc = (EditText)findViewById(R.id.keyc);
                String passwordcS = passwordc.getText().toString();
                if(nameS.equals("")||IDS.equals("")||passwordcS.equals("") || passwordS.equals("")){
                    Toast.makeText(mContext,"input error",Toast.LENGTH_SHORT).show();
                }
                else if(passwordS.equals(passwordcS)){
                    CommonDatabase commonDatabase = new CommonDatabase();
                    SQLiteDatabase db = commonDatabase.getSqliteObject(mContext);
                    ContentValues values = new ContentValues();
                    values.put("name",nameS);
                    values.put("username",IDS);
                    values.put("password",passwordS);
                    db.insert("User",null,values);
                    Toast.makeText(mContext,"registe succeeded",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}