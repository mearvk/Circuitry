package org.mearvk.circuitry.standard;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;

public class Persistor extends SystemComponent
{
    public BusLogic bus;

    //

    public Persistor()
    {

    }

    public Persistor(System system)
    {
        this.system = system;
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
