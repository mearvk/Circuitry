package org.mearvk.circuitry.standard;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.interfaces.Runner;

public class Encapsulator extends SystemComponent implements Runner
{
    public BusLogic bus;

    //
    public Encapsulator()
    {

    }

    public Encapsulator(System system)
    {
        this.system = system;
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

    @Override
    public void run()
    {

    }
}
