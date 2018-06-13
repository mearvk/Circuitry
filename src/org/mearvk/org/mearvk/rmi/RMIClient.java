package org.mearvk.org.mearvk.rmi;

import org.mearvk.ancellaries.SystemComponent;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient extends SystemComponent
{
    public String host = "";

    public Registry registry;

    //

    public RMIClient()
    {
        try
        {
            registry = LocateRegistry.getRegistry(host);
        }
        catch (Exception e)
        {
            System.err.println("RMIClient is: " + e);
        }
    }

    //

    @Override
    public void latch() throws Exception
    {

    }

    @Override
    public void unlatch() throws Exception
    {

    }

    @Override
    public void ready() throws Exception
    {

    }

    @Override
    public void init() throws Exception
    {

    }
}
