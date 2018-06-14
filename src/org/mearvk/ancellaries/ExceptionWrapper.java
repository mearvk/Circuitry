package org.mearvk.ancellaries;

public class ExceptionWrapper
{
    public Exception exception;

    public String message;

    public ExceptionWrapper(Exception e)
    {
        this.exception = e;

        this.message = e.getMessage();
    }
}
