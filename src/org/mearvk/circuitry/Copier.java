package org.mearvk.circuitry;

import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;

public class Copier extends SystemComponent {
    public Object source;

    public Object destination;

    //

    public Copier() {

    }

    public Copier(System system, SystemComponent target) {
        this.system = system;

        this.target = target;
    }

    public void copy() {
        this.destination = this.source;
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
}
