package org.mearvk.ancellaries;

import jdk.jfr.EventType;

import java.rmi.Remote;
import java.util.ArrayList;

public class Event implements Remote
{
    public String message = "";

    public ArrayList<EventType> type = new ArrayList<>();

    public Event()
    {

    }

    public Event(String message)
    {
        this.message = message;
    }

    public Event(String message, EventType event)
    {
        this.message = message;
    }
}
