package org.mearvk.circuitry.rmi.system;

import java.io.File;

public class RMI
{
    //

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
        return null;
    }

    public RMI frame()
    {
        return null;
    }

    public RMI frame(String URI)
    {
        return null;
    }

    public RMI logic()
    {
        return null;
    }

    public RMI logic(String URI)
    {
        return null;
    }

    public RMI lookup(Object object, Object reference)
    {
        return null;
    }

    public RMI lookup(String URI, Object reference)
    {
        return null;
    }

    public RMI run(Object object, Object reference)
    {
        return this;
    }

    public RMI run(String URI, Object reference)
    {
        return this;
    }

    public RMI run(Object object, Object reference, Object... args)
    {
        return this;
    }

    public RMI run(String URI, Object reference, Class superclass, Object... args)
    {
        return this;
    }

    public RMI cast(Object object)
    {
        return null;
    }

    public RMI cast(String URI)
    {
        return null;
    }

    public RMI register(SystemEvent event)
    {
        System.eventregistry.events.add(event);

        return this;
    }

    public RMI register(Frame frame)
    {
        System.frameregistry.frames.add(frame);

        return this;
    }
}
