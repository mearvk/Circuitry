package org.mearvk.circuitry.rmi;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

public class Extender extends SystemComponent implements RMIModel
{
    public BusLogic bus;

    //

    public Extender()
    {

    }

    public Extender(System system)
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
}
