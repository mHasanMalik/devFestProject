package com.project.Devlot.tripcast.Model;

/**
 * Created by faraz on 03-Mar-18.
 */

public class TripNotification {
    private String TripNotificaiton_ID;
    private String TripNotification_description;
    private String TripNotification_date;
    private String TripNotification_time;
    private String TripNotification_userID;
    private String TripNotification_tripID;

    public TripNotification(String tripNotificaiton_ID, String tripNotification_description, String tripNotification_date, String tripNotification_time, String tripNotification_userID, String tripNotification_tripID) {
        TripNotificaiton_ID = tripNotificaiton_ID;
        TripNotification_description = tripNotification_description;
        TripNotification_date = tripNotification_date;
        TripNotification_time = tripNotification_time;
        TripNotification_userID = tripNotification_userID;
        TripNotification_tripID = tripNotification_tripID;
    }

    public String getTripNotificaiton_ID() {
        return TripNotificaiton_ID;
    }

    public void setTripNotificaiton_ID(String tripNotificaiton_ID) {
        TripNotificaiton_ID = tripNotificaiton_ID;
    }

    public String getTripNotification_description() {
        return TripNotification_description;
    }

    public void setTripNotification_description(String tripNotification_description) {
        TripNotification_description = tripNotification_description;
    }

    public String getTripNotification_date() {
        return TripNotification_date;
    }

    public void setTripNotification_date(String tripNotification_date) {
        TripNotification_date = tripNotification_date;
    }

    public String getTripNotification_time() {
        return TripNotification_time;
    }

    public void setTripNotification_time(String tripNotification_time) {
        TripNotification_time = tripNotification_time;
    }

    public String getTripNotification_userID() {
        return TripNotification_userID;
    }

    public void setTripNotification_userID(String tripNotification_userID) {
        TripNotification_userID = tripNotification_userID;
    }

    public String getTripNotification_tripID() {
        return TripNotification_tripID;
    }

    public void setTripNotification_tripID(String tripNotification_tripID) {
        TripNotification_tripID = tripNotification_tripID;
    }
}
