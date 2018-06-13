package org.mearvk.circuitry;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.org.mearvk.interfaces.Runner;

public class Observer extends SystemComponent implements Runner
{
    public BusLogic bus;

    //

    public Observer()
    {

    }

    public Observer(System system, SystemComponent target)
    {
        this.system = system;

        this.target = target;
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
