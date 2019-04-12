package org.ajobdesh.wc.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.ajobdesh.wc.Pojo.Fixture;
import org.ajobdesh.wc.R;

import java.util.List;

public class RecyclerViewAdapterFixture extends RecyclerView.Adapter<RecyclerViewAdapterFixture.MyViewHolder> {
    Context mContext;
    List<Fixture> mData;

    public RecyclerViewAdapterFixture(Context mContext, List<Fixture> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.item_fixture,null);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        //fixture-start
        myViewHolder.match.setText(mData.get(i).getMatchNoTv());
        myViewHolder.dateTv.setText(mData.get(i).getOne_dateTv());
        myViewHolder.timeTv.setText(mData.get(i).getTwo_timeTv());
        myViewHolder.locationTv.setText(mData.get(i).getThree_locationTv());
        myViewHolder.image1Iv.setImageResource(mData.get(i).getFour_image1Iv());
        myViewHolder.image2Iv.setImageResource(mData.get(i).getFive_image2Iv());
        myViewHolder.team1Tv.setText(mData.get(i).getSix_team1Tv());
        myViewHolder.team2Tv.setText(mData.get(i).getSeven_team2Tv());
        //fixture-end

        //ranking-start

        //ranking-end
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //fixture-start
        private TextView match;
        private TextView dateTv;
        private TextView timeTv;
        private TextView locationTv;
        private ImageView image1Iv;
        private ImageView image2Iv;
        private TextView team1Tv;
        private TextView team2Tv;
        //fixture-end

        //ranking-start

        //ranking-end

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        //fixture-start
        match = (TextView) itemView.findViewById(R.id.matchNoTv);
        dateTv = (TextView) itemView.findViewById(R.id.one_dateTv);
        timeTv = (TextView) itemView.findViewById(R.id.two_timeTv);
        locationTv = (TextView) itemView.findViewById(R.id.three_locationTv);
        image1Iv = (ImageView) itemView.findViewById(R.id.four_image1Iv);
        image2Iv = (ImageView) itemView.findViewById(R.id.five_image2Iv);
        team1Tv = (TextView) itemView.findViewById(R.id.six_team1Tv);
        team2Tv = (TextView) itemView.findViewById(R.id.seven_team2Tv);
        //fixture-end


        //ranking-start

        //ranking-end

        }

    }
}
