package com.renato.ec02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.renato.ec02.network.ImageRequester;
import com.renato.ec02.network.JourneyEntry;

import java.util.List;

public class JourneyCardRecyclerViewAdapter extends RecyclerView.Adapter<JourneyCardViewHolder> {
    private List<JourneyEntry> journeyList;
    private ImageRequester imageRequester;
    JourneyCardRecyclerViewAdapter(List<JourneyEntry> journeyList){
        this.journeyList =journeyList;
        imageRequester= ImageRequester.getInstance();


    }

    @NonNull
    @Override
    public JourneyCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View layoutView= LayoutInflater.from(parent.getContext()).inflate(R.layout.journey_card,parent, false);
        return new JourneyCardViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull JourneyCardViewHolder holder,int position){
        if(journeyList!=null& position<journeyList.size()){
            JourneyEntry journey= journeyList.get(position);
            holder.journeyTitle.setText(journey.title);
            holder.journeyPrice.setText(journey.price);
            imageRequester.setImageFromUrl(holder.journeyImage, journey.url);
        }


    }
    @Override
    public int getItemCount(){
        return journeyList.size();
    }
}
