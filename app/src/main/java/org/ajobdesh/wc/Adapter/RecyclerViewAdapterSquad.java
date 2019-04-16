package org.ajobdesh.wc.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.ajobdesh.wc.Activity.PlayerActivity;
import org.ajobdesh.wc.ItemClickListener;
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
    public MyViewHolderSquad onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_squad,null);

        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);

        final MyViewHolderSquad myViewHolderSquad = new MyViewHolderSquad(v);

//        myViewHolderSquad.squadLinearLayoutId.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(mContext,PlayerActivity.class);
//                mContext.startActivity(intent);
//            }
//        });


        return myViewHolderSquad;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderSquad myViewHolderSquad, int i) {

        final String serial = mData.get(i).getOne_serialTv();
        final int image = mData.get(i).getTwo_TeamImageIv();
        final String teamName = mData.get(i).getThree_teamNameTv();
        final String player1_serial = mData.get(i).getPlayer1Serial();
        final String player1_fName = mData.get(i).getPlayer1firstName();
        final String player1_lName = mData.get(i).getPlayer1lastName();
        final String player1_position = mData.get(i).getPlayer1Position();

        //Bind Data

        myViewHolderSquad.serial.setText(serial);
        myViewHolderSquad.teamImage.setImageResource(image);
        myViewHolderSquad.teamName.setText(teamName);

//        Starts Here       This part is hidden in item_squad

//        myViewHolderSquad.player1_serial.setText(player1_position);
//        myViewHolderSquad.player1_fName.setText(player1_fName);
//        myViewHolderSquad.player1_lName.setText(player1_lName);
//        myViewHolderSquad.player1_position.setText(player1_position);

//        Finish Here





        myViewHolderSquad.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {

                openPlayerListToActivity(player1_serial,player1_fName,player1_lName,player1_position);

            }
        });

//        myViewHolderSquad.serial.setText(mData.get(i).getOne_serialTv());
//        myViewHolderSquad.teamImage.setImageResource(mData.get(i).getTwo_TeamImageIv());
//        myViewHolderSquad.teamName.setText(mData.get(i).getThree_teamNameTv());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private void openPlayerListToActivity(String player1_serial, String player1_firstName,
                                          String player1_lastName, String player1_position){

        Intent intent = new Intent(mContext,PlayerActivity.class);

//        pack Data to send
        intent.putExtra("PLAYER1_SERIAL_KEY", player1_serial);
        intent.putExtra("PLAYER1_FIRST_NAME_KEY", player1_firstName);
        intent.putExtra("PLAYER1_LAST_NAME_KEY", player1_lastName);
        intent.putExtra("PLAYER1_POSITION_KEY", player1_position);

//        Start Activity Here

        mContext.startActivity(intent);
    }

    public static class MyViewHolderSquad extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView serial;
        private ImageView teamImage;
        private TextView teamName;


        TextView player1_serial;
        TextView player1_fName;
        TextView player1_lName;
        TextView player1_position;

        ItemClickListener itemClickListener;



//        private LinearLayout squadLinearLayoutId;

        public MyViewHolderSquad(@NonNull View itemView) {
            super(itemView);

            serial = (TextView) itemView.findViewById(R.id.one_serialTv);
            teamImage = (ImageView) itemView.findViewById(R.id.two_TeamImageIv);
            teamName = (TextView) itemView.findViewById(R.id.three_teamNameTv);

            player1_serial = itemView.findViewById(R.id.player1_serialTv);
            player1_fName = itemView.findViewById(R.id.player1_firstNameTv);
            player1_lName = itemView.findViewById(R.id.player1_lastNameTv);
            player1_position = itemView.findViewById(R.id.player1_position);

            itemView.setOnClickListener(this);

//            squadLinearLayoutId = (LinearLayout) itemView.findViewById(R.id.squadLinearLayoutId);
        }
        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClick(this.getLayoutPosition());
        }
    }
}
