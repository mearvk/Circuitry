package org.mearvk.circuitry.rmi;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.org.mearvk.interfaces.Runner;

public class Driver extends SystemComponent implements Runner
{
    public BusLogic bus;

    //

    public Driver()
    {

    }

    public Driver(System system)
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
