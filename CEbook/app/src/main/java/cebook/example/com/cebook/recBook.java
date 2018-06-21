package cebook.example.com.cebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class recBook extends AppCompatActivity {
    private String[] newbooks = {"大茶商","仓央嘉措诗集","白鹿原","失乐园","平凡的世界","失落的秘符","钟鼓楼"};
    private List<NewBook> newbookList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec_book);
        initBooks();
        NewBookAdapter adapter = new NewBookAdapter(
                recBook.this, R.layout.newbookitem,newbookList);
        ListView listView = (ListView)findViewById(R.id.newbook_list);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.add_item:

                break;
            case R.id.remove_item:

                break;

            case R.id.choose_item:

                break;
        }
        return true;
    }
    private void initBooks(){
            NewBook NewBook1 = new NewBook("钟鼓楼",R.drawable.zhonggulou);
            newbookList.add(NewBook1);
            NewBook NewBook2= new NewBook("战争与和平",R.drawable.zhanzhengyuheping);
            newbookList.add(NewBook2);
            NewBook NewBook3 = new NewBook("永别了武器",R.drawable.yongbielewuqi);
            newbookList.add(NewBook3);
            NewBook NewBook4 = new NewBook("三体",R.drawable.santi);
            newbookList.add(NewBook4);
            NewBook NewBook5 = new NewBook("全球通史",R.drawable.quanqiutongshi);
            newbookList.add(NewBook5);
            NewBook NewBook6 = new NewBook("挪威的森林",R.drawable.nuoweidesenlin);
            newbookList.add(NewBook6);
            NewBook NewBook7 = new NewBook("活着",R.drawable.huoze);
            newbookList.add(NewBook7);
            NewBook NewBook8 = new NewBook("哈姆雷特",R.drawable.hamuleite);
            newbookList.add(NewBook8);
            NewBook NewBook9 = new NewBook("窗边的小豆豆",R.drawable.chuangbiandexiaodoudou);
            newbookList.add(NewBook9);
    }
}
