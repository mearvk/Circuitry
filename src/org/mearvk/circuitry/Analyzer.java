package org.mearvk.circuitry;

import org.mearvk.ancellaries.BusLogic;
import org.mearvk.ancellaries.SystemComponent;

public class Analyzer extends SystemComponent
{
    public BusLogic bus;

    //

    public Analyzer() {

    }

    public Analyzer(org.mearvk.ancellaries.System system) {
        this.system = system;
    }

    public Analyzer(org.mearvk.ancellaries.System system, SystemComponent target) {
        this.system = system;

        this.target = target;
    }

    public void analyze() {

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
