package com.project.Devlot.tripcast.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.Devlot.tripcast.Model.TripPost;
import com.project.Devlot.tripcast.R;

import java.util.List;

/**
 * Created by hassa on 03-Mar-18.
 */

public class TripPostAdapter extends RecyclerView.Adapter<TripPostAdapter.TripPostViewHolder>{
    private List<TripPost> tripPostList;

    public TripPostAdapter(List<TripPost> tripPostList) {
        this.tripPostList = tripPostList;
    }

    @Override
    public TripPostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View tripPostView = LayoutInflater.from(parent.getContext()).inflate(R.layout., parent, false);
//
//        return new TripPostViewHolder(tripPostView);

        return null;
    }

    @Override
    public void onBindViewHolder(TripPostViewHolder holder, int position) {
        TripPost tripPost = tripPostList.get(position);

        holder.tvTripPost_ID.setText(tripPost.getTripPost_ID());
        holder.tvTripPost_userID.setText(tripPost.getTripPost_userID());
        holder.tvTripPost_tripID.setText(tripPost.getTripPost_tripID());
        holder.tvTripPost_note.setText(tripPost.getTripPost_note());
        // Insert image here.
    }

    @Override
    public int getItemCount() {
        return tripPostList.size();
    }

    public class TripPostViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTripPost_ID;
        public TextView tvTripPost_userID;
        public TextView tvTripPost_tripID;
        public TextView tvTripPost_note;
        public ImageView ivTripPost_imagePath;

        public TripPostViewHolder(View itemView) {
            super(itemView);

//            tvTripPost_ID = (TextView) itemView.findViewById(R.id.);
//            tvTripPost_userID = (TextView) itemView.findViewById(R.id.);
//            tvTripPost_tripID = (TextView) itemView.findViewById(R.id.);
//            tvTripPost_note = (TextView) itemView.findViewById(R.id.);
//            ivTripPost_imagePath = (ImageView) itemView.findViewById(R.id.);
        }
    }
}
