package com.renato.ec02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.renato.ec02.network.JourneyEntry;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.home_fragment, container, false);
        RecyclerView recyclerView= view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2, GridLayoutManager.VERTICAL, false));
        JourneyCardRecyclerViewAdapter adapter=new JourneyCardRecyclerViewAdapter(
                JourneyEntry.initJourneyEntryList(getResources()));
        recyclerView.setAdapter(adapter);
        int largePadding=getResources().getDimensionPixelSize(R.dimen.journey_grid_spacing);
        int smallPadding=getResources().getDimensionPixelSize(R.dimen.journey_grid_small);
        recyclerView.addItemDecoration(new JourneyGridItemDecoration(largePadding, smallPadding));
        return view;
    }
}
