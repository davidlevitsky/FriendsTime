package com.friendstime.apps.calex.model;

import android.widget.ImageButton;

import java.util.ArrayList;

public class CreatedEventDisplay extends SuperCreate {

    //public String date;
    //public String eventDescription;
    public boolean visible;
    public ImageButton button;

    public CreatedEventDisplay(){}

    public CreatedEventDisplay(String eventName, String dateFrom, String dateTo, String startTime, String endTime, String eventDescription, ArrayList<String> notes, ArrayList<Action> actions, ArrayList<Contact> participants)
    {
        this.dateFrom = dateFrom;
        //this.eventDescription = eventDescription;
        this.TYPE = 0;
        this.eventName = eventName;
        this.dateTo = dateTo;
        this.startTime = startTime;
        this.endTime = endTime;
        this.occasion = occasion;
        this.notes = notes;
        this.actions = actions;
        this.participants = participants;
    }



}
