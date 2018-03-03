package com.project.Devlot.tripcast.Model;

/**
 * Created by hassa on 03-Mar-18.
 */

public class User {
    private int id;
    private int uid;
    private String name;
    private String email;
    private String imagePath;

    public User(int uid, String name, String email, String imagePath) {
        this.id = 1;
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.imagePath = imagePath;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public User(int id, int uid, String name, String email, String imagePath) {
        this.id = id;
        this.uid = uid;

        this.name = name;
        this.email = email;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
