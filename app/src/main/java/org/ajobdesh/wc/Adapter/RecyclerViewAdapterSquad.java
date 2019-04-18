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
        //initialize data
        final String serial = mData.get(i).getOne_serialTv();
        final int image = mData.get(i).getTwo_TeamImageIv();
        final String teamName = mData.get(i).getThree_teamNameTv();

        final String player1_serial = mData.get(i).getPlayer1Serial();
        final String player1_fName = mData.get(i).getPlayer1firstName();
        final String player1_lName = mData.get(i).getPlayer1lastName();
        final String player1_position = mData.get(i).getPlayer1Position();

        final String player2_serial = mData.get(i).getPlayer2Serial();
        final String player2_fName = mData.get(i).getPlayer2firstName();
        final String player2_lName = mData.get(i).getPlayer2lastName();
        final String player2_position = mData.get(i).getPlayer2Position();

        final String player3_serial = mData.get(i).getPlayer3Serial();
        final String player3_fName = mData.get(i).getPlayer3firstName();
        final String player3_lName = mData.get(i).getPlayer3lastName();
        final String player3_position = mData.get(i).getPlayer3Position();

        final String player4_serial = mData.get(i).getPlayer4Serial();
        final String player4_fName = mData.get(i).getPlayer4firstName();
        final String player4_lName = mData.get(i).getPlayer4lastName();
        final String player4_position = mData.get(i).getPlayer4Position();

        final String player5_serial = mData.get(i).getPlayer5Serial();
        final String player5_fName = mData.get(i).getPlayer5firstName();
        final String player5_lName = mData.get(i).getPlayer5lastName();
        final String player5_position = mData.get(i).getPlayer5Position();

        final String player6_serial = mData.get(i).getPlayer6Serial();
        final String player6_fName = mData.get(i).getPlayer6firstName();
        final String player6_lName = mData.get(i).getPlayer6lastName();
        final String player6_position = mData.get(i).getPlayer6Position();

        final String player7_serial = mData.get(i).getPlayer7Serial();
        final String player7_fName = mData.get(i).getPlayer7firstName();
        final String player7_lName = mData.get(i).getPlayer7lastName();
        final String player7_position = mData.get(i).getPlayer7Position();

        final String player8_serial = mData.get(i).getPlayer8Serial();
        final String player8_fName = mData.get(i).getPlayer8firstName();
        final String player8_lName = mData.get(i).getPlayer8lastName();
        final String player8_position = mData.get(i).getPlayer8Position();

        final String player9_serial = mData.get(i).getPlayer9Serial();
        final String player9_fName = mData.get(i).getPlayer9firstName();
        final String player9_lName = mData.get(i).getPlayer9lastName();
        final String player9_position = mData.get(i).getPlayer9Position();

        final String player10_serial = mData.get(i).getPlayer10Serial();
        final String player10_fName = mData.get(i).getPlayer10firstName();
        final String player10_lName = mData.get(i).getPlayer10lastName();
        final String player10_position = mData.get(i).getPlayer10Position();

        final String player11_serial = mData.get(i).getPlayer11Serial();
        final String player11_fName = mData.get(i).getPlayer11firstName();
        final String player11_lName = mData.get(i).getPlayer11lastName();
        final String player11_position = mData.get(i).getPlayer11Position();

        final String player12_serial = mData.get(i).getPlayer12Serial();
        final String player12_fName = mData.get(i).getPlayer12firstName();
        final String player12_lName = mData.get(i).getPlayer12lastName();
        final String player12_position = mData.get(i).getPlayer12Position();

        final String player13_serial = mData.get(i).getPlayer13Serial();
        final String player13_fName = mData.get(i).getPlayer13firstName();
        final String player13_lName = mData.get(i).getPlayer13lastName();
        final String player13_position = mData.get(i).getPlayer13Position();

        final String player14_serial = mData.get(i).getPlayer14Serial();
        final String player14_fName = mData.get(i).getPlayer14firstName();
        final String player14_lName = mData.get(i).getPlayer14lastName();
        final String player14_position = mData.get(i).getPlayer14Position();

        final String player15_serial = mData.get(i).getPlayer15Serial();
        final String player15_fName = mData.get(i).getPlayer15firstName();
        final String player15_lName = mData.get(i).getPlayer15lastName();
        final String player15_position = mData.get(i).getPlayer15Position();



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

                openPlayerListToActivity(player1_serial,
                                         player1_fName,
                                         player1_lName,
                                         player1_position,
                        player2_serial,
                        player2_fName,
                        player2_lName,
                        player2_position,

                        player3_serial,
                        player3_fName,
                        player3_lName,
                        player3_position,

                        player4_serial,
                        player4_fName,
                        player4_lName,
                        player4_position,

                        player5_serial,
                        player5_fName,
                        player5_lName,
                        player5_position,

                        player6_serial,
                        player6_fName,
                        player6_lName,
                        player6_position,

                        player7_serial,
                        player7_fName,
                        player7_lName,
                        player7_position,

                        player8_serial,
                        player8_fName,
                        player8_lName,
                        player8_position,

                        player9_serial,
                        player9_fName,
                        player9_lName,
                        player9_position,

                        player10_serial,
                        player10_fName,
                        player10_lName,
                        player10_position,

                        player11_serial,
                        player11_fName,
                        player11_lName,
                        player11_position,

                        player12_serial,
                        player12_fName,
                        player12_lName,
                        player12_position,

                        player13_serial,
                        player13_fName,
                        player13_lName,
                        player13_position,

                        player14_serial,
                        player14_fName,
                        player14_lName,
                        player14_position,

                        player15_serial,
                        player15_fName,
                        player15_lName,
                        player15_position

                        );

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

    private void openPlayerListToActivity(String player1_serial,
                                          String player1_firstName,
                                          String player1_lastName,
                                          String player1_position,

                                          String player2_serial,
                                          String player2_firstName,
                                          String player2_lastName,
                                          String player2_position,

                                          String player3_serial,
                                          String player3_firstName,
                                          String player3_lastName,
                                          String player3_position,

                                          String player4_serial,
                                          String player4_firstName,
                                          String player4_lastName,
                                          String player4_position,

                                          String player5_serial,
                                          String player5_firstName,
                                          String player5_lastName,
                                          String player5_position,

                                          String player6_serial,
                                          String player6_firstName,
                                          String player6_lastName,
                                          String player6_position,

                                          String player7_serial,
                                          String player7_firstName,
                                          String player7_lastName,
                                          String player7_position,

                                          String player8_serial,
                                          String player8_firstName,
                                          String player8_lastName,
                                          String player8_position,

                                          String player9_serial,
                                          String player9_firstName,
                                          String player9_lastName,
                                          String player9_position,

                                          String player10_serial,
                                          String player10_firstName,
                                          String player10_lastName,
                                          String player10_position,

                                          String player11_serial,
                                          String player11_firstName,
                                          String player11_lastName,
                                          String player11_position,

                                          String player12_serial,
                                          String player12_firstName,
                                          String player12_lastName,
                                          String player12_position,

                                          String player13_serial,
                                          String player13_firstName,
                                          String player13_lastName,
                                          String player13_position,

                                          String player14_serial,
                                          String player14_firstName,
                                          String player14_lastName,
                                          String player14_position,

                                          String player15_serial,
                                          String player15_firstName,
                                          String player15_lastName,
                                          String player15_position){

        Intent intent = new Intent(mContext,PlayerActivity.class);

//        pack Data to send
        intent.putExtra("PLAYER1_SERIAL_KEY", player1_serial);
        intent.putExtra("PLAYER1_FIRST_NAME_KEY", player1_firstName);
        intent.putExtra("PLAYER1_LAST_NAME_KEY", player1_lastName);
        intent.putExtra("PLAYER1_POSITION_KEY", player1_position);

        intent.putExtra("PLAYER2_SERIAL_KEY", player2_serial);
        intent.putExtra("PLAYER2_FIRST_NAME_KEY", player2_firstName);
        intent.putExtra("PLAYER2_LAST_NAME_KEY", player2_lastName);
        intent.putExtra("PLAYER2_POSITION_KEY", player2_position);

        intent.putExtra("PLAYER3_SERIAL_KEY", player3_serial);
        intent.putExtra("PLAYER3_FIRST_NAME_KEY", player3_firstName);
        intent.putExtra("PLAYER3_LAST_NAME_KEY", player3_lastName);
        intent.putExtra("PLAYER3_POSITION_KEY", player3_position);

        intent.putExtra("PLAYER4_SERIAL_KEY", player4_serial);
        intent.putExtra("PLAYER4_FIRST_NAME_KEY", player4_firstName);
        intent.putExtra("PLAYER4_LAST_NAME_KEY", player4_lastName);
        intent.putExtra("PLAYER4_POSITION_KEY", player4_position);

        intent.putExtra("PLAYER5_SERIAL_KEY", player5_serial);
        intent.putExtra("PLAYER5_FIRST_NAME_KEY", player5_firstName);
        intent.putExtra("PLAYER5_LAST_NAME_KEY", player5_lastName);
        intent.putExtra("PLAYER5_POSITION_KEY", player5_position);

        intent.putExtra("PLAYER6_SERIAL_KEY", player6_serial);
        intent.putExtra("PLAYER6_FIRST_NAME_KEY", player6_firstName);
        intent.putExtra("PLAYER6_LAST_NAME_KEY", player6_lastName);
        intent.putExtra("PLAYER6_POSITION_KEY", player6_position);

        intent.putExtra("PLAYER7_SERIAL_KEY", player7_serial);
        intent.putExtra("PLAYER7_FIRST_NAME_KEY", player7_firstName);
        intent.putExtra("PLAYER7_LAST_NAME_KEY", player7_lastName);
        intent.putExtra("PLAYER7_POSITION_KEY", player7_position);

        intent.putExtra("PLAYER8_SERIAL_KEY", player8_serial);
        intent.putExtra("PLAYER8_FIRST_NAME_KEY", player8_firstName);
        intent.putExtra("PLAYER8_LAST_NAME_KEY", player8_lastName);
        intent.putExtra("PLAYER8_POSITION_KEY", player8_position);

        intent.putExtra("PLAYER9_SERIAL_KEY", player9_serial);
        intent.putExtra("PLAYER9_FIRST_NAME_KEY", player9_firstName);
        intent.putExtra("PLAYER9_LAST_NAME_KEY", player9_lastName);
        intent.putExtra("PLAYER9_POSITION_KEY", player9_position);

        intent.putExtra("PLAYER10_SERIAL_KEY", player10_serial);
        intent.putExtra("PLAYER10_FIRST_NAME_KEY", player10_firstName);
        intent.putExtra("PLAYER10_LAST_NAME_KEY", player10_lastName);
        intent.putExtra("PLAYER10_POSITION_KEY", player10_position);

        intent.putExtra("PLAYER11_SERIAL_KEY", player11_serial);
        intent.putExtra("PLAYER11_FIRST_NAME_KEY", player11_firstName);
        intent.putExtra("PLAYER11_LAST_NAME_KEY", player11_lastName);
        intent.putExtra("PLAYER11_POSITION_KEY", player11_position);

        intent.putExtra("PLAYER12_SERIAL_KEY", player12_serial);
        intent.putExtra("PLAYER12_FIRST_NAME_KEY", player12_firstName);
        intent.putExtra("PLAYER12_LAST_NAME_KEY", player12_lastName);
        intent.putExtra("PLAYER12_POSITION_KEY", player12_position);

        intent.putExtra("PLAYER13_SERIAL_KEY", player13_serial);
        intent.putExtra("PLAYER13_FIRST_NAME_KEY", player13_firstName);
        intent.putExtra("PLAYER13_LAST_NAME_KEY", player13_lastName);
        intent.putExtra("PLAYER13_POSITION_KEY", player13_position);

        intent.putExtra("PLAYER14_SERIAL_KEY", player14_serial);
        intent.putExtra("PLAYER14_FIRST_NAME_KEY", player14_firstName);
        intent.putExtra("PLAYER14_LAST_NAME_KEY", player14_lastName);
        intent.putExtra("PLAYER14_POSITION_KEY", player14_position);

        intent.putExtra("PLAYER15_SERIAL_KEY", player15_serial);
        intent.putExtra("PLAYER15_FIRST_NAME_KEY", player15_firstName);
        intent.putExtra("PLAYER15_LAST_NAME_KEY", player15_lastName);
        intent.putExtra("PLAYER15_POSITION_KEY", player15_position);

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

        TextView player2_serial;
        TextView player2_fName;
        TextView player2_lName;
        TextView player2_position;

        TextView player3_serial;
        TextView player3_fName;
        TextView player3_lName;
        TextView player3_position;

        TextView player4_serial;
        TextView player4_fName;
        TextView player4_lName;
        TextView player4_position;

        TextView player5_serial;
        TextView player5_fName;
        TextView player5_lName;
        TextView player5_position;

        TextView player6_serial;
        TextView player6_fName;
        TextView player6_lName;
        TextView player6_position;

        TextView player7_serial;
        TextView player7_fName;
        TextView player7_lName;
        TextView player7_position;

        TextView player8_serial;
        TextView player8_fName;
        TextView player8_lName;
        TextView player8_position;

        TextView player9_serial;
        TextView player9_fName;
        TextView player9_lName;
        TextView player9_position;

        TextView player10_serial;
        TextView player10_fName;
        TextView player10_lName;
        TextView player10_position;

        TextView player11_serial;
        TextView player11_fName;
        TextView player11_lName;
        TextView player11_position;

        TextView player12_serial;
        TextView player12_fName;
        TextView player12_lName;
        TextView player12_position;

        TextView player13_serial;
        TextView player13_fName;
        TextView player13_lName;
        TextView player13_position;

        TextView player14_serial;
        TextView player14_fName;
        TextView player14_lName;
        TextView player14_position;

        TextView player15_serial;
        TextView player15_fName;
        TextView player15_lName;
        TextView player15_position;

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

            player2_serial = itemView.findViewById(R.id.player2_serialTv);
            player2_fName = itemView.findViewById(R.id.player2_firstNameTv);
            player2_lName = itemView.findViewById(R.id.player2_lastNameTv);
            player2_position = itemView.findViewById(R.id.player2_position);

            player3_serial = itemView.findViewById(R.id.player3_serialTv);
            player3_fName = itemView.findViewById(R.id.player3_firstNameTv);
            player3_lName = itemView.findViewById(R.id.player3_lastNameTv);
            player3_position = itemView.findViewById(R.id.player3_position);

            player4_serial = itemView.findViewById(R.id.player4_serialTv);
            player4_fName = itemView.findViewById(R.id.player4_firstNameTv);
            player4_lName = itemView.findViewById(R.id.player4_lastNameTv);
            player4_position = itemView.findViewById(R.id.player4_position);

            player5_serial = itemView.findViewById(R.id.player5_serialTv);
            player5_fName = itemView.findViewById(R.id.player5_firstNameTv);
            player5_lName = itemView.findViewById(R.id.player5_lastNameTv);
            player5_position = itemView.findViewById(R.id.player5_position);

            player6_serial = itemView.findViewById(R.id.player6_serialTv);
            player6_fName = itemView.findViewById(R.id.player6_firstNameTv);
            player6_lName = itemView.findViewById(R.id.player6_lastNameTv);
            player6_position = itemView.findViewById(R.id.player6_position);

            player7_serial = itemView.findViewById(R.id.player7_serialTv);
            player7_fName = itemView.findViewById(R.id.player7_firstNameTv);
            player7_lName = itemView.findViewById(R.id.player7_lastNameTv);
            player7_position = itemView.findViewById(R.id.player7_position);

            player8_serial = itemView.findViewById(R.id.player8_serialTv);
            player8_fName = itemView.findViewById(R.id.player8_firstNameTv);
            player8_lName = itemView.findViewById(R.id.player8_lastNameTv);
            player8_position = itemView.findViewById(R.id.player8_position);

            player9_serial = itemView.findViewById(R.id.player9_serialTv);
            player9_fName = itemView.findViewById(R.id.player9_firstNameTv);
            player9_lName = itemView.findViewById(R.id.player9_lastNameTv);
            player9_position = itemView.findViewById(R.id.player9_position);

            player10_serial = itemView.findViewById(R.id.player10_serialTv);
            player10_fName = itemView.findViewById(R.id.player10_firstNameTv);
            player10_lName = itemView.findViewById(R.id.player10_lastNameTv);
            player10_position = itemView.findViewById(R.id.player10_position);

            player11_serial = itemView.findViewById(R.id.player11_serialTv);
            player11_fName = itemView.findViewById(R.id.player11_firstNameTv);
            player11_lName = itemView.findViewById(R.id.player11_lastNameTv);
            player11_position = itemView.findViewById(R.id.player11_position);

            player12_serial = itemView.findViewById(R.id.player12_serialTv);
            player12_fName = itemView.findViewById(R.id.player12_firstNameTv);
            player12_lName = itemView.findViewById(R.id.player12_lastNameTv);
            player12_position = itemView.findViewById(R.id.player12_position);

            player13_serial = itemView.findViewById(R.id.player13_serialTv);
            player13_fName = itemView.findViewById(R.id.player13_firstNameTv);
            player13_lName = itemView.findViewById(R.id.player13_lastNameTv);
            player13_position = itemView.findViewById(R.id.player13_position);

            player14_serial = itemView.findViewById(R.id.player14_serialTv);
            player14_fName = itemView.findViewById(R.id.player14_firstNameTv);
            player14_lName = itemView.findViewById(R.id.player14_lastNameTv);
            player14_position = itemView.findViewById(R.id.player14_position);

            player15_serial = itemView.findViewById(R.id.player15_serialTv);
            player15_fName = itemView.findViewById(R.id.player15_firstNameTv);
            player15_lName = itemView.findViewById(R.id.player15_lastNameTv);
            player15_position = itemView.findViewById(R.id.player15_position);

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
