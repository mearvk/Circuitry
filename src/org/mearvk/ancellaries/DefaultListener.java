package org.mearvk.ancellaries;

import java.rmi.Remote;
import java.util.ArrayList;

public class DefaultListener implements Remote
{
    public ArrayList<Event> events = new ArrayList<Event>();

    public DefaultListener()
    {

    }
}
