package org.mearvk.circuitry;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;

public class Visitor extends SystemComponent
{
    public BusLogic bus;

    //

    public Visitor() {

    }

    public Visitor(System system) {
        this.system = system;
    }

    @Override
    public void latch() throws Exception {

    }

    @Override
    public void unlatch() throws Exception {

    }

    @Override
    public void ready() throws Exception {

    }

    @Override
    public void init() throws Exception {

    }
}
