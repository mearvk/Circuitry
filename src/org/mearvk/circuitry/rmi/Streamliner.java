package org.mearvk.circuitry.rmi;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.rmi.system.RMIModel;

public class Streamliner extends SystemComponent implements Runnable, RMIModel
{
    public BusLogic bus;

    //

    public Streamliner()
    {

    }

    public Streamliner(System system)
    {
        this.system = system;
    }

    @Override
    public void run()
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
