package cebook.example.com.cebook;

import android.content.Context;
import android.view.*;
import android.widget.*;

import java.util.List;

/**
 * Created by ocz11 on 2018/5/28.
 */

public class BookAdapter extends ArrayAdapter<Book>{
    private int resourceId;
    public BookAdapter(Context context, int textviewResourseId,
                       List<Book> objects){
        super(context,textviewResourseId,objects);
        resourceId = textviewResourseId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book book = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView bookText = (TextView)view.findViewById(R.id.book_name);
        TextView ownerText = (TextView)view.findViewById(R.id.book_owner);
        bookText.setText(book.getName());
        ownerText.setText(book.getOwner());
        return view;
    }
}
