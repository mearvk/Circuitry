package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SystemFrameCallCompletedEvent extends SystemEvent
{
    public String message;

    public StackTraceElement element;

    public ArrayList<StackTraceElement> elements;

    public Date timestamp;

    public SystemFrameCallCompletedEvent(StackTraceElement element, String message)
    {
        this.element = element;

        this.message = message;

        this.timestamp = new Date(java.lang.System.currentTimeMillis());
    }

    public SystemFrameCallCompletedEvent(StackTraceElement[] elements, String message)
    {
        this.elements.addAll(Arrays.asList(elements));

        this.message = message;

        this.timestamp = new Date(java.lang.System.currentTimeMillis());
    }
}
