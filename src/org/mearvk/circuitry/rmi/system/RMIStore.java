package org.mearvk.circuitry.rmi.system;

import org.mearvk.circuitry.rmi.system.thin.ThinClient;

import java.lang.module.Configuration;
import java.util.HashMap;

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

    public HashMap<Class, Object> recallLast()
    {
        return null;
    }

    public HashMap<Class, Object> recall(String rmiURI, Object object, String name, Thread thread, StackTraceElement[] elements)
    {
        HashMap<Class, Object> map = new HashMap<>();

        ThinClient client = new ThinClient();

        Object rv = null;

        try
        {
            rv = this.rmi.lookup(client, "");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        map.put(Object.class, rv);

        return map;
    }
}
