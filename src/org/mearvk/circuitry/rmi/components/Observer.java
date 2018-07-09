package org.mearvk.circuitry.rmi.components;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.interfaces.Runner;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

public class Observer extends SystemComponent implements Runner, RMIModel
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
