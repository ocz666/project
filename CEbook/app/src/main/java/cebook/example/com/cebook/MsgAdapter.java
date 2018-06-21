package cebook.example.com.cebook;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ocz11 on 2018/5/29.
 */

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {
    private List<Message> mMsgList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout leftlayout;
        LinearLayout rightlayout;
         TextView leftMsg;
        TextView rightMsg;
         public ViewHolder(View view) {
             super(view);
             leftlayout = (LinearLayout) view.findViewById(R.id.left_layout);
             rightlayout = (LinearLayout) view.findViewById(R.id.right_layout);
             leftMsg = (TextView)view.findViewById(R.id.lefg_msg);
             rightMsg = (TextView)view.findViewById(R.id.right_msg);
         }
    }
    public MsgAdapter(List<Message> msgList){
        mMsgList = msgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.msgitem,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Message message = mMsgList.get(position);
        if(message.getType() == Message.TYPE_RECEIVED){
            holder.leftlayout.setVisibility(View.VISIBLE);
            holder.rightlayout.setVisibility(View.GONE);
            holder.leftMsg.setText(message.getContent());
        }
        else if(message.getType()==Message.TYPE_SENT){
            holder.rightlayout.setVisibility(View.VISIBLE);
            holder.leftlayout.setVisibility(View.GONE);
            holder.rightMsg.setText(message.getContent());
        }
    }
    @Override
    public int getItemCount(){
        return mMsgList.size();
    }
}
