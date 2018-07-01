package activitytest.example.com.thefatlock;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private ImageButton thelocker=null ;
    private ImageButton thediet=null;
    private ImageButton theexercise=null;
    private ImageButton theweight=null;
    private ImageButton records=null;
    private ImageButton me=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.thelocker=(ImageButton)super.findViewById(R.id.thelocker);
        thelocker.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent lockerintent = new Intent(MainActivity.this,thelocker.class);
                MainActivity.this.startActivity(lockerintent);
                //MainActivity.this.finish();
            }
        });
        this.thediet=(ImageButton)super.findViewById(R.id.thediet);
        thediet.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent dietintent = new Intent(MainActivity.this,thediet.class);
                MainActivity.this.startActivity(dietintent);
                //MainActivity.this.finish();
            }
        });
        this.theexercise=(ImageButton)super.findViewById(R.id.theexercise);
        theexercise.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent exerciseintent = new Intent(MainActivity.this,thediet.class);
                MainActivity.this.startActivity(exerciseintent);
                //MainActivity.this.finish();
            }
        });
        this.theweight=(ImageButton)super.findViewById(R.id.theweight);
        theweight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent weightintent = new Intent(MainActivity.this, theweight.class);
                MainActivity.this.startActivity(weightintent);
                //MainActivity.this.finish();
            }
        });
        this.records=(ImageButton)super.findViewById(R.id.records);
        records.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent recordsintent = new Intent(MainActivity.this, records.class);
                MainActivity.this.startActivity(recordsintent);
                //MainActivity.this.finish();
            }
        });
        this.me=(ImageButton)super.findViewById(R.id.me);
        me.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent meintent = new Intent(MainActivity.this, me.class);
                MainActivity.this.startActivity(meintent);
                //MainActivity.this.finish();
            }
        });
        //MainActivity.this.finish();
    }

    /*private class ShowListener implements OnClickListener{
        public void onClick(View v){
            Intent lockerintent = new Intent(MainActivity.this,thelocker.class);
            MainActivity.this.startActivity(lockerintent);
            MainActivity.this.finish();
        }
            Intent dietintent = new Intent(MainActivity.this,thediet.class);
            MainActivity.this.startActivity(dietintent);
            Intent exerciseintent = new Intent(MainActivity.this,theexercise.class);
            MainActivity.this.startActivity(exerciseintent);
            Intent weightintent = new Intent(MainActivity.this,theweight.class);
            MainActivity.this.startActivity(weightintent);
    }*/

}
