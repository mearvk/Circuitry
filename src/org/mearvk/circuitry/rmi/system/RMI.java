package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

import java.io.File;
import java.io.PrintStream;
import java.io.Serializable;

public class RMI extends RMIImpl implements Serializable
{
    public RMI ref = this;

    public RMIImpl impl = super.ref;

    public RMI()
    {

    }

    protected RMI file() // neatly that each call should register with System API for calc.
    {
        return null;
    }

    public RMI init(String URI, Object initobject, File initfile)
    {
        return null;
    }

    public RMI compile()
    {
        return null;
    }

    public RMI go()
    {
        return null;
    }

    public RMI rules(String URI)
    {
        return null;
    }

    public RMI rules(RMI endpoint)
    {
        return null;
    }

    public RMI lift(RMIModel object, RMIModel monitor)
    {
        return null;
    }

    public RMI fire()
    {
        return null;
    }

    public RMI desecuritize(RMI rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMI securitize(RMI rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMI lock()
    {
        return null;
    }

    public RMI unlock()
    {
        return null;
    }

    public RMI listeners()
    {
        return null;
    }

    public RMI requests()
    {
        return null;
    }

    public RMI fill()
    {
        return null;
    }

    public RMI hooks()
    {
        return null;
    }

    public RMI store()
    {
        return null;
    }

    public RMI store(String id)
    {
        return null;
    }

    public RMI store(RMIStore store)
    {
        return null;
    }

    public RMI store(RMIDbms database)
    {
        return null;
    }

    public RMI store(RMIDbms database, Integer id)
    {
        return null;
    }

    public RMI store(RMIStore store, String id)
    {
        return null;
    }

    public RMI store(RMIStore store, Integer id)
    {
        return null;
    }

    public RMI as(Object reference)
    {
        return null;
    }

    public RMI reference(Object reference)
    {
        return null;
    }

    public RMI reference(Object object, Object reference)
    {
        return null;
    }

    public RMI reference(String URI, Object reference)
    {
        return null;
    }

    public RMI ref()
    {
        return null;
    }

    public RMI ref(Object object, Object reference)
    {
        return null;
    }

    public RMI ref(String URI, Object reference)
    {
        return null;
    }

    public RMI lookup(Object object)
    {
        return null;
    }

    public RMI lookup(String URI)
    {
        return this;
    }

    public RMI post(PrintStream stream, Object object)
    {
        System.rmi.frame(this).run(stream, object);

        return this;
    }

    public RMI post(PrintStream stream, String URI)
    {
        System.rmi.frame(this).run(stream, URI);

        return this;
    }

    @Resource()
    public RMI frame(Object object, Object... args)
    {
        System.rmi.impl._frame(object, args)._run(object, null);

        return this;
    }

    @Resource()
    public RMI frame(Object object, String URI, Object... args)
    {
        System.rmi.run(object, URI);

        return this;
    }

    public RMI logic()
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    public RMI logic(String URI)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    public RMI lookup(Object object, Object reference)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    public RMI lookup(String URI, Object reference)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    public RMI run(Object object, Object reference)
    {
        System.rmi.run(object, reference);

        return this;
    }

    public RMI run(String URI, Object reference)
    {
        System.rmi.run(URI, reference);

        return this;
    }

    public RMI run(Object object, Object reference, Object... args)
    {
        System.rmi.run(object, reference, args);

        return this;
    }

    public RMI run(String URI, Object reference, Class superclass, Object... args)
    {
        System.rmi.run(URI, reference);

        return this;
    }

    public RMI cast(Object object)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    public RMI cast(String URI)
    {
        return this;
    }

    public RMI register(SystemEvent event)
    {
        System.event_registry.events.add(event);

        return this;
    }

    public RMI register(Frame frame, Object object, String URI)
    {


        return this;
    }

    public RMI register(Frame frame, Object object)
    {


        return this;
    }
}
