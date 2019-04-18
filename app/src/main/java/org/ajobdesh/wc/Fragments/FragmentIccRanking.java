package org.ajobdesh.wc.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ajobdesh.wc.R;
import org.ajobdesh.wc.Adapter.RecyclerViewAdapterRanking;
import org.ajobdesh.wc.Pojo.Ranking;

import java.util.ArrayList;
import java.util.List;

public class FragmentIccRanking extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<Ranking> listRanking;
    private TextView headlineTv;
    private TextView lastUpdateTv;

    public FragmentIccRanking() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.iccranking_fragment,container,false);

        headlineTv = v.findViewById(R.id.headlineTv);
        lastUpdateTv= v.findViewById(R.id.lastUpdateTv);

        recyclerView = (RecyclerView) v.findViewById(R.id.rankingRecyclerViewId);

        RecyclerViewAdapterRanking recyclerViewAdapterRanking = new RecyclerViewAdapterRanking(getContext(),listRanking);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapterRanking);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listRanking = new ArrayList<>();

        listRanking.add(new Ranking("1", R.drawable.england, "England", "59", "7259", "123"));
        listRanking.add(new Ranking("2", R.drawable.india, "India", "71", "8508", "120"));
        listRanking.add(new Ranking("3", R.drawable.newzealand, "New Zealand", "54", "6071", "112"));
        listRanking.add(new Ranking("4", R.drawable.southafrica, "South Africa", "55", "6181", "112"));
        listRanking.add(new Ranking("5", R.drawable.australia, "Australia", "53", "5701", "108"));
        listRanking.add(new Ranking("6", R.drawable.pakistan, "Pakistan", "53", "5147", "97"));
        listRanking.add(new Ranking("7", R.drawable.bangladesh, "Bangladesh", "42", "3792", "90"));
        listRanking.add(new Ranking("8", R.drawable.srilanka, "Sri Lanka", "62", "4734", "76"));
        listRanking.add(new Ranking("9", R.drawable.westindies, "West Indies", "44", "3351", "76"));
        listRanking.add(new Ranking("10", R.drawable.afghanistan, "Afghanistan", "40", "2554", "64"));
        listRanking.add(new Ranking("11", R.drawable.zimbabwe, "Zimbabwe", "50", "2627", "53"));
        listRanking.add(new Ranking("12", R.drawable.ireland, "Ireland", "27", "1169", "43"));
        listRanking.add(new Ranking("13", R.drawable.scotland, "Scotland", "16", "535", "33"));
        listRanking.add(new Ranking("14", R.drawable.nepalpng, "Nepal", "10", "152", "15"));
        listRanking.add(new Ranking("15", R.drawable.uae, "UAE", "19", "267", "14"));
        listRanking.add(new Ranking("16", R.drawable.netherlands, "Netherlands", "6", "50", "8"));

    }
}
