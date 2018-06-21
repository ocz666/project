package cebook.example.com.cebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cebook.example.com.cebook.R;
import cebook.example.com.cebook.User;

/**
 * Created by ocz11 on 2018/5/28.
 */

public class UserAdapter extends ArrayAdapter<User>{
    private int resourceId;
    public UserAdapter(Context context, int textviewResourseId,
                       List<User> objects){
        super(context,textviewResourseId,objects);
        resourceId = textviewResourseId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView UserImage = (ImageView)view.findViewById(R.id.User_image);
        TextView UserText = (TextView)view.findViewById(R.id.User_name);
        UserImage.setImageResource(user.getImageID());
        UserText.setText(user.getName());
        return view;
    }
}