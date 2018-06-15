package org.mearvk.ancellaries;

import org.mearvk.circuitry.org.mearvk.interfaces.Bodi;
import org.mearvk.org.mearvk.rmi.RMIClient;
import org.mearvk.org.mearvk.rmi.RMIServer;

public class System extends SystemComponent implements Runnable
{
    public Bodi bodi;

    public System system;

    public RMIClient rmi_client = new RMIClient();

    public RMIServer rmi_server = new RMIServer();

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

    public static void main(String... args)
    {
        System system = new System("system");

        //system.add(type1);

        //system.add(type2);

        //system.add(type3);

        system.run();
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
