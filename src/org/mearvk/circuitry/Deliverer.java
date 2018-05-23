package org.mearvk.circuitry;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.org.mearvk.interfaces.Deliver;
import org.mearvk.circuitry.org.mearvk.interfaces.Runner;

public abstract class Deliverer extends SystemComponent implements Runner, Deliver
{
    public BusLogic bus;

    //

    public Deliverer(System system, SystemComponent target) {
        this.system = system;

        this.target = target;
    }


    @Override
    public void latch() throws Exception
    {
        synchronized(this.latchlock)
        {
            this.latchlock.lock();
        }
    }

    @Override
    public void unlatch() throws Exception
    {
        synchronized(this.latchlock)
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
        synchronized(this.latchlock)
        {
                this.system.latch(this, this.target);

                this.system.put(this, this.deliverable, this.target);

                this.system.pump(this, this.exceptionregister);

                this.system.unlatch(this, this.target);
        }
    }
}

