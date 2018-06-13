package org.mearvk.org.mearvk.rmi;

import org.mearvk.ancellaries.RMISystemComponent;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer extends RMISystemComponent {
    public RMIServer server;

    public Registry registry;

    //

    public RMIServer() {
        this.server = this;

        try {
            this.registry = LocateRegistry.getRegistry();

            this.registry.bind("/rmi", this);
        } catch (Exception e) {
            System.err.println("Error > " + e);
        }
    }

    //

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
