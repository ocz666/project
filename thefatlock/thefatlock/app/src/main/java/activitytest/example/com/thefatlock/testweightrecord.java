package activitytest.example.com.thefatlock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class testweightrecord extends AppCompatActivity {
    int y,m,d;
    float w;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testweightrecord);
        y=Integer.parseInt(editText3.getText().toString());
        m=Integer.parseInt(editText4.getText().toString());
        d=Integer.parseInt(editText5.getText().toString());
        w=Float.parseFloat(editText6.getText().toString());
        Weight weightinput=new Weight(w,objectCreator.getDateObject(y,m,d));
        Toast.makeText(this, "Weight类型已保存~", Toast.LENGTH_SHORT).show();
    }
}
