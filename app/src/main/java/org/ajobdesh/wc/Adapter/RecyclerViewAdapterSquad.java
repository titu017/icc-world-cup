package org.ajobdesh.wc.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.ajobdesh.wc.Pojo.Squad;
import org.ajobdesh.wc.R;

import java.util.List;

public class RecyclerViewAdapterSquad extends RecyclerView.Adapter<RecyclerViewAdapterSquad.MyViewHolderSquad> {
    Context mContext;
    List<Squad> mData;

    Dialog myDialog;

    public RecyclerViewAdapterSquad(Context mContext, List<Squad> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    public RecyclerViewAdapterSquad() {
    }

    @NonNull
    @Override
    public MyViewHolderSquad onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_squad,null);

        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);

        final MyViewHolderSquad myViewHolderSquad = new MyViewHolderSquad(v);


        return myViewHolderSquad;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderSquad myViewHolderSquad, int i) {

        myViewHolderSquad.serial.setText(mData.get(i).getOne_serialTv());
        myViewHolderSquad.teamImage.setImageResource(mData.get(i).getTwo_TeamImageIv());
        myViewHolderSquad.teamName.setText(mData.get(i).getThree_teamNameTv());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolderSquad extends RecyclerView.ViewHolder{

        private TextView serial;
        private ImageView teamImage;
        private TextView teamName;

        private LinearLayout squadLinearLayoutId;

        public MyViewHolderSquad(@NonNull View itemView) {
            super(itemView);

            serial = (TextView) itemView.findViewById(R.id.one_serialTv);
            teamImage = (ImageView) itemView.findViewById(R.id.two_TeamImageIv);
            teamName = (TextView) itemView.findViewById(R.id.three_teamNameTv);

            squadLinearLayoutId = (LinearLayout) itemView.findViewById(R.id.squadLinearLayoutId);
        }
    }
}
