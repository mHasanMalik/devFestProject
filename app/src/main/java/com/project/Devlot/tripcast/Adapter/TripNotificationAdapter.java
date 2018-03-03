package com.project.Devlot.tripcast.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.Devlot.tripcast.Model.Trip;
import com.project.Devlot.tripcast.Model.TripNotification;
import com.project.Devlot.tripcast.R;

import java.util.List;

/**
 * Created by hassa on 03-Mar-18.
 */

public class TripNotificationAdapter extends  RecyclerView.Adapter<TripNotificationAdapter.TripNotificationViewHolder>{
    private List<TripNotification> TripNotificaitonList;

    public TripNotificationAdapter(List<TripNotification> tripNotificaitonList) {
        this.TripNotificaitonList = tripNotificaitonList;
    }

    @Override
    public TripNotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View TripNotificationView = LayoutInflater.from(parent.getContext()).inflate(R.layout., parent, false);
//
//        return TripNotificationViewHolder(TripNotificationView);

        return null; // Remove this.
    }

    @Override
    public void onBindViewHolder(TripNotificationViewHolder holder, int position) {
        TripNotification tripNotification = TripNotificaitonList.get(position);

        holder.tvTripNotification_ID.setText(tripNotification.getTripNotificaiton_ID());
        holder.tvTripNotification_userID.setText(tripNotification.getTripNotification_userID());
        holder.tvTripNotification_tripID.setText(tripNotification.getTripNotification_tripID());
        holder.tvTripNotification_date.setText(tripNotification.getTripNotification_date());
        holder.tvTripNotification_time.setText(tripNotification.getTripNotification_time());
        holder.tvTripNotification_description.setText(tripNotification.getTripNotification_description());
    }

    @Override
    public int getItemCount() {
        return TripNotificaitonList.size();
    }

    public class TripNotificationViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTripNotification_ID;
        public TextView tvTripNotification_userID;
        public TextView tvTripNotification_tripID;
        public TextView tvTripNotification_date;
        public TextView tvTripNotification_time;
        public TextView tvTripNotification_description;

        public TripNotificationViewHolder(View itemView) {
            super(itemView);

//            tvTripNotification_ID = (TextView) itemView.findViewById(R.id.);
//            tvTripNotification_userID = (TextView) itemView.findViewById(R.id.);
//            tvTripNotification_tripID = (TextView) itemView.findViewById(R.id.);
//            tvTripNotification_date = (TextView) itemView.findViewById(R.id.);
//            tvTripNotification_time = (TextView itemView.findViewById(R.id.);
//            tvTripNotification_description = (TextView) itemView.findViewById(R.id.);
        }
    }
}
