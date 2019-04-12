package org.ajobdesh.wc.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.ajobdesh.wc.Pojo.Ranking;
import org.ajobdesh.wc.R;

import java.util.List;

public class RecyclerViewAdapterRanking extends RecyclerView.Adapter<RecyclerViewAdapterRanking.MyViewHolder2> {
    Context mContext;
    List<Ranking> mData;

    public RecyclerViewAdapterRanking(Context mContext, List<Ranking> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.item_rankings,null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);

        MyViewHolder2 myViewHolder2 = new MyViewHolder2(v);
        return myViewHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 myViewHolder2, int i) {

        myViewHolder2.position_ranking.setText(mData.get(i).getOne_positionTv());
        myViewHolder2.flag_ranking.setImageResource(mData.get(i).getTwo_flagTv());
        myViewHolder2.team_ranking.setText(mData.get(i).getThree_TeamTv());
        myViewHolder2.weightedMatches_ranking.setText(mData.get(i).getFour_WeightedMatchesTv());
        myViewHolder2.points_ranking.setText(mData.get(i).getFive_PointsTv());
        myViewHolder2.rating_raning.setText(mData.get(i).getSix_Rating());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder{
        private TextView position_ranking;
        private ImageView flag_ranking;
        private TextView team_ranking;
        private TextView weightedMatches_ranking;
        private TextView points_ranking;
        private TextView rating_raning;
        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);

            position_ranking = (TextView) itemView.findViewById(R.id.one_positionTv);
            flag_ranking = (ImageView) itemView.findViewById(R.id.two_flagTv);
            team_ranking = (TextView) itemView.findViewById(R.id.three_TeamTv);
            weightedMatches_ranking = (TextView) itemView.findViewById(R.id.four_WeightedMatchesTv);
            points_ranking = (TextView) itemView.findViewById(R.id.five_PointsTv);
            rating_raning = (TextView) itemView.findViewById(R.id.six_Rating);
        }
    }
}
