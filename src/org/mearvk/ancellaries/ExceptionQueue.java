package org.mearvk.ancellaries;

import java.util.ArrayList;

public class ExceptionQueue
{
    public ArrayList<ExceptionWrapper> exceptions;

    //

    public ExceptionQueue()
    {
        this.exceptions = new ArrayList<>();
    }

    public void treat(Exception exception)
    {
        this.exceptions.add(new ExceptionWrapper(exception));
    }
}
