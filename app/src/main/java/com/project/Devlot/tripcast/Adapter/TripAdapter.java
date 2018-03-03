package com.project.Devlot.tripcast.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.Devlot.tripcast.Model.Trip;
import com.project.Devlot.tripcast.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by hassa on 03-Mar-18.
 */

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.TripViewHolder> {
    private List<Trip> tripList;

    public TripAdapter(List<Trip> tripList) {
        this.tripList = tripList;
    }

    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View tripView = LayoutInflater.from(parent.getContext()).inflate(R.layout., parent, false);

        //return new TripViewHolder(tripView);
        return null; // Remove this.
    }

    @Override
    public void onBindViewHolder(TripViewHolder holder, int position) {
        Trip trip = tripList.get(position);

        holder.tvTripName.setText(trip.getTripName());
        holder.tvTripLocation.setText(trip.getTripLocation());
        holder.tvTripNote.setText(trip.getTripNote());
        holder.tvTripCreatedBy.setText(trip.getTripCreatedBy());
        holder.tvTripTime.setText(trip.getTripTime());
        // Insert image here
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }

    public class TripViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTripName;
        public TextView tvTripLocation;
        public TextView tvTripNote;
        public TextView tvTripCreatedBy;
        public TextView tvTripTime;
        public ImageView ivTripCoverImage;

        public TripViewHolder(View view){
            super(view);
//            tvTripName = (TextView) view.findViewById(R.id.);
//            tvTripLocation = (TextView) view.findViewById(R.id.);
//            tvTripNote = (TextView) view.findViewById(R.id.);
//            tvTripCreatedBy = (TextView) view.findViewById(R.id.);
//            tvTripTime = (TextView) view.findViewById(R.id.);
//            ivTripCoverImage = (ImageView) view.findViewById(R.id.);
        }
    }
}
