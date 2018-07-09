package org.mearvk.circuitry.rmi.components;

import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

/**
 * The Guarantor class will reference a XML document to guarantee a condition against a state or state change.  The purpose is to avoid race-condition in changing system components.
 */

public class Guarantor extends SystemComponent implements RMIModel
{


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
