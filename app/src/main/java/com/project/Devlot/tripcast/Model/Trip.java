package com.project.Devlot.tripcast.Model;

/**
 * Created by faraz on 03-Mar-18.
 */

public class Trip {
    private String tripName;
    private String tripLocation;
    private String tripNote;
    private String tripCoverImage;
    private String tripCreatedBy;
    private String tripTime;

    public Trip(String tripName, String tripLocation, String tripNote, String tripCoverImage, String tripCreatedBy, String tripTime) {
        this.tripName = tripName;
        this.tripLocation = tripLocation;
        this.tripNote = tripNote;
        this.tripCoverImage = tripCoverImage;
        this.tripCreatedBy = tripCreatedBy;
        this.tripTime = tripTime;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getTripLocation() {
        return tripLocation;
    }

    public void setTripLocation(String tripLocation) {
        this.tripLocation = tripLocation;
    }

    public String getTripNote() {
        return tripNote;
    }

    public void setTripNote(String tripNote) {
        this.tripNote = tripNote;
    }

    public String getTripCoverImage() {
        return tripCoverImage;
    }

    public void setTripCoverImage(String tripCoverImage) {
        this.tripCoverImage = tripCoverImage;
    }

    public String getTripCreatedBy() {
        return tripCreatedBy;
    }

    public void setTripCreatedBy(String tripCreatedBy) {
        this.tripCreatedBy = tripCreatedBy;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }
}
