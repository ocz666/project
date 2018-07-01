package activitytest.example.com.thefatlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class theweight extends AppCompatActivity {
    private Button testweightrecord=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theweight);
        this.testweightrecord=(Button)super.findViewById(R.id.inputweight);
        testweightrecord.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent inputintent = new Intent(theweight.this,testweightrecord.class);
                theweight.this.startActivity(inputintent);
            }
        });
    }
}
