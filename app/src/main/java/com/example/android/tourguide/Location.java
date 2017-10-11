package com.example.android.tourguide;

/**
 * Created by Noura on 9/6/17.
 */

public class Location {

    private int lName;
    private int lInfo;
    private int lImageId;


    public Location(int lName, int lInfo, int lImageId) {
        this.lName = lName;
        this.lInfo = lInfo;
        this.lImageId = lImageId;
    }


    public int getlInfo() {
        return lInfo;
    }

    public int getlName() {
        return lName;
    }

    public int getlImageId() {
        return lImageId;
    }
}
