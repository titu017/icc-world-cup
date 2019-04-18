package org.ajobdesh.wc.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.ajobdesh.wc.Adapter.RecyclerViewAdapterSquad;
import org.ajobdesh.wc.Pojo.Squad;
import org.ajobdesh.wc.Pojo.SquadCollection;
import org.ajobdesh.wc.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentSquad extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Squad> listSquad;

    public FragmentSquad() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.squad_fragment,container,false);

        recyclerView = (RecyclerView) v.findViewById(R.id.squadRecyclerViewId);

        RecyclerViewAdapterSquad recyclerViewAdapterSquad = new RecyclerViewAdapterSquad(getContext(),SquadCollection.getSquadPlayers());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapterSquad);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        listSquad = new ArrayList<>();
//        listSquad.add(new Squad("1", R.drawable.bangladesh,"Bangladesh",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder",
//                "1", "Moinul", "Islam", "All Rounder"));




        }
}
