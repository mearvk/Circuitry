package org.mearvk.org.mearvk.rmi;

import org.mearvk.ancellaries.ExceptionQueue;
import org.mearvk.ancellaries.SystemComponent;

import java.rmi.Remote;
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
            System.err.println("RMIClient > " + e);
        }
    }

    //

    public void put(String name, Remote object, String handler)
    {
        try
        {
            this.registry.bind(name, object);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(handler);

                queue.treat(exception);
            }
            catch (Exception trim)
            {
                System.err.println("RMIClient > " + trim);
            }
        }
    }

    public void put(String name, Remote object)
    {
        try
        {
            this.registry.bind(name, object);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(System.getProperty("rmi://defaults/exceptions"));

                queue.treat(exception);
            }
            catch (Exception trim)
            {
                System.err.println("RMIClient > " + trim);
            }
        }
    }

    public void pull()
    {

    }

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
