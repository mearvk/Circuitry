package org.mearvk.circuitry.rmi.components;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

public class Orderer extends SystemComponent implements RMIModel
{
    public BusLogic bus;

    //

    public Orderer()
    {

    }

    public Orderer(System system)
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
