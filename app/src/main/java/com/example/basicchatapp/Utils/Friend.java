package com.example.basicchatapp.Utils;

public class Friend { private String photoPath;;
    private String name;
    private String text;

    private String bio;
    private String userKey;

    private int count;

    public Friend(String photoPath, String name, String bio, String userKey) {
        this.photoPath = photoPath;
        this.name = name;
        this.bio = bio;
        this.userKey = userKey;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

