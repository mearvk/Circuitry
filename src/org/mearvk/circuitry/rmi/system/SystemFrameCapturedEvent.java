package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SystemFrameCapturedEvent extends SystemEvent
{
    public String message;

    public StackTraceElement element;

    public ArrayList<StackTraceElement> elements;

    public Date timestamp;

    public SystemFrameCapturedEvent(StackTraceElement element, String message)
    {
        this.element = element;

        this.message = message;

        this.timestamp = new Date(java.lang.System.currentTimeMillis());
    }

    public SystemFrameCapturedEvent(StackTraceElement[] elements, String message)
    {
        this.elements.addAll(Arrays.asList(elements));

        this.message = message;

        this.timestamp = new Date(java.lang.System.currentTimeMillis());
    }
}
