package org.mearvk.examples;

import org.mearvk.ancellaries.Event;
import org.mearvk.ancellaries.EventResponder;

public class SimpleOutputEventResponder implements EventResponder
{

    @Override
    public void handleEvent(Event event)
    {
        System.out.println("Event: " + event);
    }
}
