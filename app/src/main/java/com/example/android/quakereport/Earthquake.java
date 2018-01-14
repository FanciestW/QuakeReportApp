package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by William Lin on 1/14/2018.
 */

public class Earthquake {
    public String magnitude, location;
    public Date when;

    public Earthquake(){}

    public Earthquake(String mag, String loc, Date date){
        magnitude = mag;
        location = loc;
        when = date;
    }
}
