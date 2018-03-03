package com.project.Devlot.tripcast.Model;


/**
 * Created by faraz on 03-Mar-18.
 */

public class TripPost {
    private String tripPost_ID;
    private String tripPost_userID;
    private String tripPost_tripID;
    private String tripPost_imagePath;
    private String tripPost_note;

    public TripPost(String tripPost_ID, String tripPost_userID, String tripPost_tripID, String tripPost_imagePath, String tripPost_note) {
        this.tripPost_ID = tripPost_ID;
        this.tripPost_userID = tripPost_userID;
        this.tripPost_tripID = tripPost_tripID;
        this.tripPost_imagePath = tripPost_imagePath;
        this.tripPost_note = tripPost_note;
    }

    public String getTripPost_ID() {
        return tripPost_ID;
    }

    public void setTripPost_ID(String tripPost_ID) {
        this.tripPost_ID = tripPost_ID;
    }

    public String getTripPost_userID() {
        return tripPost_userID;
    }

    public void setTripPost_userID(String tripPost_userID) {
        this.tripPost_userID = tripPost_userID;
    }

    public String getTripPost_tripID() {
        return tripPost_tripID;
    }

    public void setTripPost_tripID(String tripPost_tripID) {
        this.tripPost_tripID = tripPost_tripID;
    }

    public String getTripPost_imagePath() {
        return tripPost_imagePath;
    }

    public void setTripPost_imagePath(String tripPost_imagePath) {
        this.tripPost_imagePath = tripPost_imagePath;
    }

    public String getTripPost_note() {
        return tripPost_note;
    }

    public void setTripPost_note(String tripPost_note) {
        this.tripPost_note = tripPost_note;
    }
}
