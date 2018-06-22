package org.mearvk.circuitry.rmi;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

public class Analyzer extends SystemComponent implements RMIModel
{
    public BusLogic bus;

    //

    public Analyzer()
    {

    }

    public Analyzer(org.mearvk.ancellaries.System system)
    {
        this.system = system;
    }

    public Analyzer(org.mearvk.ancellaries.System system, SystemComponent target)
    {
        this.system = system;

        this.target = target;
    }

    public void analyze()
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
