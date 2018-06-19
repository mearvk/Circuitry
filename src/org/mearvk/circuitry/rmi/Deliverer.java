package org.mearvk.circuitry.rmi;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.interfaces.Deliver;
import org.mearvk.circuitry.interfaces.Runner;
import org.mearvk.circuitry.rmi.system.RMIModel;

public abstract class Deliverer extends SystemComponent implements Runner, Deliver, RMIModel
{
    public BusLogic bus;

    //

    public Deliverer(System system, SystemComponent target)
    {
        this.system = system;

        this.target = target;
    }


    @Override
    public void latch() throws Exception
    {
        synchronized (this.latchlock)
        {
            this.latchlock.lock();
        }
    }

    @Override
    public void unlatch() throws Exception
    {
        synchronized (this.latchlock)
        {
            this.latchlock.unlock();
        }
    }

    //

    @Override
    public void ready()
    {

    }

    @Override
    public void deliver()
    {

    }
}

