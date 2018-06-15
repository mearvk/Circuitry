package org.mearvk.rmi;

import org.mearvk.ancellaries.RMISystemComponent;

import java.io.Serializable;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class RMIServer extends RMISystemComponent implements Serializable
{
    public RMIServer server;

    public Registry registry;

    //


    public RMIServer()
    {
        this.server = this;

        try
        {
            System.setSecurityManager(new RMISecurityManager());

            System.setProperty("sun.rmi.registry.registryFilter", "java.**;org.mearvk.**");

            //

            this.registry = LocateRegistry.getRegistry();

            this.registry.bind("rmi", this);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //

    public static void main(String... args)
    {
        try
        {
            new RMIServer();
        }
        catch (Exception e)
        {
            e.printStackTrace();
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
