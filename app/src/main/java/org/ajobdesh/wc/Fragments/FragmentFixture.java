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

import org.ajobdesh.wc.R;
import org.ajobdesh.wc.Adapter.RecyclerViewAdapterFixture;
import org.ajobdesh.wc.Pojo.Fixture;

import java.util.ArrayList;
import java.util.List;

public class FragmentFixture extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Fixture> listFixture;


    public FragmentFixture() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fixture_fragment,container,false);

        recyclerView = (RecyclerView) v.findViewById(R.id.fixtureRecyclerViewId);
        RecyclerViewAdapterFixture recyclerViewAdapterFixture = new RecyclerViewAdapterFixture(getContext(),listFixture);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapterFixture);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listFixture = new ArrayList<>();
        listFixture.add(new Fixture("Match 1","30/05/2019", "15:30 (GMT+6)" ,"The Oval, London", R.drawable.england , R.drawable.southafrica, "England", "South Africa"));
        listFixture.add(new Fixture("Match 2","31/05/2019", "15:30 (GMT+6)" ,"Trent Bridge, Nottingham", R.drawable.westindies , R.drawable.pakistan, "West Indies", "Pakistan"));
        listFixture.add(new Fixture("Match 3","1/6/2019", "15:30 (GMT+6)" ,"Cardiff Wales Stadium, Cardiff", R.drawable.newzealand , R.drawable.srilanka, "New Zealand", "Sri Lanka"));
        listFixture.add(new Fixture("Match 4","1/6/2019", "18:30 (GMT+6)" ,"Bristol Country Ground, Bristol", R.drawable.afghanistan , R.drawable.australia, "Afghanistan", "Australia"));
        listFixture.add(new Fixture("Match 5","2/6/2019", "15:30 (GMT+6)" ,"The Oval, London", R.drawable.southafrica , R.drawable.bangladesh, "South Africa", "Bangladesh"));
        listFixture.add(new Fixture("Match 6","3/6/2019", "15:30 (GMT+6)" ,"Trent Bridge, Nottingham", R.drawable.england , R.drawable.pakistan, "England", "Pakistan"));
        listFixture.add(new Fixture("Match 7","4/6/2019", "15:30 (GMT+6)" ,"Cardiff Wales Stadium, Cardiff", R.drawable.afghanistan , R.drawable.srilanka, "Afghanistan", "Sri Lanka"));
        listFixture.add(new Fixture("Match 8","5/6/2019", "15:30 (GMT+6)" ,"Hampshire Bowl, Southampton", R.drawable.southafrica , R.drawable.india, "South Africa", "India"));
        listFixture.add(new Fixture("Match 9","5/6/2019", "18:30 (GMT+6)" ,"The Oval, London", R.drawable.bangladesh , R.drawable.newzealand, "Bangladesh", "New Zealand"));
        listFixture.add(new Fixture("Match 10","6/6/2019", "15:30 (GMT+6)" ,"Trent Bridge, Nottingham", R.drawable.australia , R.drawable.westindies, "Australia", "West Indies"));
        listFixture.add(new Fixture("Match 11","7/6/2019", "15:30 (GMT+6)" ,"Bristol Country Ground", R.drawable.pakistan , R.drawable.srilanka, "Pakistan", "Sri Lanka"));
        listFixture.add(new Fixture("Match 12","8/6/2019", "15:30 (GMT+6)" ,"Cardiff Wales Stadium, Cardiff", R.drawable.england , R.drawable.bangladesh, "England", "Bangladesh"));
        listFixture.add(new Fixture("Match 13","8/6/2019", "18:30 (GMT+6)" ,"County Ground Taunton, Taunton", R.drawable.afghanistan , R.drawable.newzealand, "Afghanistan", "New Zealand"));
        listFixture.add(new Fixture("Match 14","9/6/2019", "15:30 (GMT+6)" ,"The Oval, London", R.drawable.india , R.drawable.australia, "India", "Australia"));
        listFixture.add(new Fixture("Match 15","10/6/2019", "15:30 (GMT+6)" ,"Hampshire Bowl, Southampton", R.drawable.southafrica , R.drawable.westindies, "South Africa", "West Indies"));
        listFixture.add(new Fixture("Match 16","11/6/2019", "15:30 (GMT+6)" ,"Bristol County Ground, Bristol", R.drawable.bangladesh , R.drawable.srilanka, "Bangladesh", "Sri Lanka"));
        listFixture.add(new Fixture("Match 17","12/6/2019", "15:30 (GMT+6)" ,"County Ground Taunton, Taunton", R.drawable.australia, R.drawable.pakistan, "Australia", "Pakistan"));
        listFixture.add(new Fixture("Match 18","13/6/2019", "15:30 (GMT+6)" ,"Trent Bridge, Nottingham", R.drawable.india , R.drawable.newzealand, "India", "New Zealand"));
        listFixture.add(new Fixture("Match 19","14/6/2019", "15:30 (GMT+6)" ,"Hampshire Bowl, Southampton", R.drawable.england , R.drawable.westindies, "England", "West Indies"));
        listFixture.add(new Fixture("Match 20","15/6/2019", "15:30 (GMT+6)" ,"The Oval, London", R.drawable.srilanka , R.drawable.australia, "Sri Lanka", "Australia"));
        listFixture.add(new Fixture("Match 21","15/6/2019", "18:30 (GMT+6)" ,"Cardiff Wales Stadium, Cardiff", R.drawable.southafrica , R.drawable.afghanistan, "South Africa", "Afghanistan"));
        listFixture.add(new Fixture("Match 22","16/6/2019", "15:30 (GMT+6)" ,"Old Trafford, Manchester", R.drawable.india , R.drawable.pakistan, "India", "Pakistan"));
        listFixture.add(new Fixture("Match 23","17/6/2019", "15:30 (GMT+6)" ,"County Ground Taunton, Taunton", R.drawable.westindies , R.drawable.bangladesh, "West Indies", "Bangladesh"));
        listFixture.add(new Fixture("Match 24","18/6/2019", "15:30 (GMT+6)" ,"Old Trafford, Manchester", R.drawable.england , R.drawable.afghanistan, "England", "Afghanistan"));
        listFixture.add(new Fixture("Match 25","19/6/2019", "15:30 (GMT+6)" ,"Edgbaston, Birmingham", R.drawable.newzealand , R.drawable.southafrica, "New Zealand", "South Africa"));
        listFixture.add(new Fixture("Match 26","20/6/2019", "15:30 (GMT+6)" ,"Trent Bridge, Nottingham", R.drawable.australia , R.drawable.bangladesh, "Australia", "Bangladesh"));
        listFixture.add(new Fixture("Match 27","21/6/2019", "15:30 (GMT+6)" ,"Headingley, Leeds", R.drawable.england , R.drawable.srilanka, "England", "Sri Lanka"));
        listFixture.add(new Fixture("Match 28","22/6/2019", "15:30 (GMT+6)" ,"Hampshire Bowl, Southampton", R.drawable.india , R.drawable.afghanistan, "India", "Afghanistan"));
        listFixture.add(new Fixture("Match 29","22/6/2019", "18:30 (GMT+6)" ,"Old Trafford, Manchester", R.drawable.westindies , R.drawable.newzealand, "West Indies", "New Zealand"));
        listFixture.add(new Fixture("Match 30","23/6/2019", "15:30 (GMT+6)" ,"Lord's, London", R.drawable.pakistan , R.drawable.southafrica, "Pakistan", "South Africa"));
        listFixture.add(new Fixture("Match 31","24/6/2019", "15:30 (GMT+6)" ,"Hampshire Bowl, Southampton", R.drawable.bangladesh , R.drawable.afghanistan, "Bangladesh", "Afghanistan"));
        listFixture.add(new Fixture("Match 32","25/6/2019", "15:30 (GMT+6)" ,"Lord's, London", R.drawable.england , R.drawable.australia, "England", "Australia"));
        listFixture.add(new Fixture("Match 33","26/6/2019", "15:30 (GMT+6)" ,"Edgbaston, Birmingham", R.drawable.newzealand , R.drawable.pakistan, "New Zealand", "Pakistan"));
        listFixture.add(new Fixture("Match 34","27/6/2019", "15:30 (GMT+6)" ,"Old Trafford, Manchester", R.drawable.westindies , R.drawable.india, "West Indies", "India"));
        listFixture.add(new Fixture("Match 35","28/6/2019", "15:30 (GMT+6)" ,"Durham, Chester-Ie-Street", R.drawable.srilanka , R.drawable.southafrica, "Sri Lanka", "South Africa"));
        listFixture.add(new Fixture("Match 36","29/6/2019", "15:30 (GMT+6)" ,"Headingley, Leeds", R.drawable.pakistan , R.drawable.afghanistan, "Pakistan", "Afghanistan"));
        listFixture.add(new Fixture("Match 37","29/6/2019", "18:30 (GMT+6)" ,"Lord's, London", R.drawable.newzealand , R.drawable.australia, "New Zealand", "Australia"));
        listFixture.add(new Fixture("Match 38","30/6/2019", "15:30 (GMT+6)" ,"Edgbaston, Birmingham", R.drawable.england , R.drawable.india, "England", "India"));
        listFixture.add(new Fixture("Match 39","1/7/2019", "15:30 (GMT+6)" ,"Durham, Chester-Ie-Street", R.drawable.srilanka , R.drawable.westindies, "Sri Lanka", "West Indies"));
        listFixture.add(new Fixture("Match 40","2/7/2019", "15:30 (GMT+6)" ,"Edgbaston, Birmingham", R.drawable.bangladesh , R.drawable.india, "Bangladesh", "India"));
        listFixture.add(new Fixture("Match 41","3/7/2019", "15:30 (GMT+6)" ,"Durham, Chester-Ie-Street", R.drawable.england , R.drawable.newzealand, "England", "New Zealand"));
        listFixture.add(new Fixture("Match 42","4/7/2019", "15:30 (GMT+6)" ,"Headingley, Leeds", R.drawable.afghanistan , R.drawable.westindies, "Afghanistan", "West Indies"));
        listFixture.add(new Fixture("Match 43","5/7/2019", "15:30 (GMT+6)" ,"Lord's, London", R.drawable.pakistan , R.drawable.bangladesh, "Pakistan", "Bangladesh"));
        listFixture.add(new Fixture("Match 44","6/7/2019", "15:30 (GMT+6)" ,"Headingley, Leeds", R.drawable.srilanka , R.drawable.india, "Sri Lanka", "India"));
        listFixture.add(new Fixture("Match 45","6/7/2019", "18:30 (GMT+6)" ,"Old Trafford, Manchester", R.drawable.australia , R.drawable.southafrica, "Australia", "South Africa"));
        listFixture.add(new Fixture("Match 46 (Semi Final 1)","9/7/2019", "15:30 (GMT+6)" ,"Old Trafford, Manchester", R.drawable.ic_launcher_background , R.drawable.ic_launcher_background, "1st", "4th"));
        listFixture.add(new Fixture("Match 47 (Semi Final 2)","11/7/2019", "15:30 (GMT+6)" ,"Edgbaston, Birmingham", R.drawable.ic_launcher_background , R.drawable.ic_launcher_background, "2nd", "3rd"));
        listFixture.add(new Fixture("Match 48(Final)","14/7/2019", "15:30 (GMT+6)" ,"Lord's, London", R.drawable.ic_launcher_background , R.drawable.ic_launcher_background, "TBC", "TBC"));
          }
}
