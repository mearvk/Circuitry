package org.mearvk.circuitry.rmi.system;

import java.lang.module.Configuration;

public class RMIStore extends RMIStoreImpl
{
    public Configuration configuration;

    public RMI rmi;

    public RMIStore()
    {

    }

    public RMIStore(RMI rmi)
    {
        this.rmi = rmi;
    }

    public RMIStore(RMI rmi, Configuration configuration)
    {
        super(rmi, configuration);
    }

    public void store(Object object)
    {

    }

    public void store(Object object, String name)
    {

    }

    public void store(Object object, String name, Thread thread)
    {

    }

    public void store(Object object, String name, Thread thread, StackTraceElement[] elements)
    {

    }

    public void store(Object object, Thread thread)
    {

    }

    public void store(Object object, Thread thread, StackTraceElement[] elements)
    {

    }

    public void store(String message, Object object, Thread thread, StackTraceElement[] elements)
    {

    }

    public void recall()
    {

    }
}
