package org.mearvk.ancellaries;

import org.mearvk.circuitry.org.mearvk.interfaces.Bodi;
import org.mearvk.rmi.RMIClient;
import org.mearvk.rmi.RMIServer;

import java.io.Serializable;

public class System extends SystemComponent implements Runnable, Serializable
{
    public Bodi bodi;

    public System system;

    public RMIClient rmi_client = new RMIClient();

    public RMIServer rmi_server = new RMIServer();

    public static final String DEFAULT_RMI_EXCEPTION = "//rmi/exceptions";

    //

    public System(String name)
    {
        this.name = name;
    }

    public System(System system, String name)
    {
        this.system = system;

        this.name = name;
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

    public void put(Object object)
    {

    }

    public void pump()
    {

    }

    @Override
    public void init()
    {

    }

    @Override
    public void run()
    {
        java.lang.System.out.println();
    }
}
