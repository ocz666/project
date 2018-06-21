package cebook.example.com.cebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ocz11 on 2018/6/11.
 */

public class NewBookAdapter extends ArrayAdapter<NewBook> {
    private int resourceId;
    public NewBookAdapter(Context context, int textviewResourseId,
                       List<NewBook> objects){
        super(context,textviewResourseId,objects);
        resourceId = textviewResourseId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NewBook newbook = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView bookImage = (ImageView)view.findViewById(R.id.newbook_image);
        TextView bookText = (TextView)view.findViewById(R.id.newbook_name);
        bookImage.setImageResource(newbook.getImageID());
        bookText.setText(newbook.getName());
        return view;
    }
}
