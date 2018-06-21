package cebook.example.com.cebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class personalInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalinfo);
        TextView lblTitle1=(TextView)findViewById(R.id.pi_name);
        TextView lblTitle2=(TextView)findViewById(R.id.piID);
        Intent intent1 = getIntent();
        String User = intent1.getStringExtra("User");
        String username = intent1.getStringExtra("username");
        lblTitle1.setText(User);
        lblTitle2.setText(username);

    }

}
