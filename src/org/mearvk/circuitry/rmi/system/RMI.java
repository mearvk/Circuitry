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

    @Resource(tie = "super")
    public RMI()
    {

    }

    @Resource(tie = "super")
    protected RMI file()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI create(Object object, Class _class, Object ref)
    {
        System.rmi.frame(this).run(this, _class, ref);

        return this;
    }

    @Resource(tie = "super")
    public RMI create(Class _class, Object ref, Object... args)
    {
        System.rmi.frame(this).run(this, _class, ref, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(String type)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(EventFilter filter)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(Event event)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI init(String URI, Object initobject, File initfile)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI compile()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI go()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI rules(String URI)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI rules(RMI endpoint)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI lift(RMIModel object, RMIModel monitor)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI fire()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI desecuritize(RMI rmi, Object reference)
    {
        return this; //we need this - now
    }

    @Resource(tie = "super")
    public RMI securitize(RMI rmi, Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI lock()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI unlock()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI listeners()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI requests()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI fill()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI unhook(Class _class, String type)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI rehook(Class _class, String type)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class, String type)
    {
        System.rmi.frame(this).run(this, null, _class, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, String type)
    {
        System.rmi.frame(this).run(this, null, object, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class, EventFilter filter)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, Class _class)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI hooks()
    {
        System.hooks.lookup(this);  //lookup the calling object off the stack

        return this;
    }

    @Resource(tie = "super")
    public RMI hooks(Object object)
    {
        System.hooks.lookup(object);

        return this;
    }

    @Resource(tie = "super")
    public RMI store()
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(String id)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI as(Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI reference(Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI reference(Object object, Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI reference(String URI, Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI ref()
    {
        return null;
    }

    @Resource(tie = "super")
    public RMI ref(Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI ref(Object object, Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI ref(String URI, Object reference)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(String URI)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, Object object)
    {
        System.rmi.frame(this).run(stream, object);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, String URI)
    {
        System.rmi.frame(this).run(stream, URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object)
    {
        System.frame_registry.push(new Frame(object));

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object, String URI)
    {
        System.rmi.impl._frame(object)._run(object, URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object, Object... args)
    {
        System.rmi.impl._frame(object, args)._run(object, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object, String URI, Object... args)
    {
        System.rmi.impl._frame(object, args)._run(object, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI logic()
    {
        System.rmi.impl._frame(this)._run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI logic(String URI)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object, Object reference)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(String URI, Object reference)
    {
        System.rmi.impl._frame(this)._run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI run(Object object, Object reference)
    {
        Thread currentthread = Thread.currentThread();

        System.call_registry.push(new Call(object, reference, currentthread.getStackTrace()));

        System.frame_registry.push(new Frame(object, reference, currentthread.getStackTrace()));

        //

        super._run(object, reference, currentthread);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI run(String URI, Object reference)
    {
        Object object = null;

        Thread currentthread = Thread.currentThread();

        System.call_registry.push(new Call(object, reference, currentthread.getStackTrace()));

        System.frame_registry.push(new Frame(object, reference, currentthread.getStackTrace()));

        System.rmi.lookup(object, URI);

        //

        super._run(object, reference, currentthread);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI run(Object rmi, Object object, Object reference, Object... args)
    {
        Thread currentthread = Thread.currentThread();

        System.call_registry.push(new Call(object, reference, currentthread.getStackTrace()));

        System.frame_registry.push(new Frame(rmi, object, reference, currentthread.getStackTrace()));

        //

        super._run(object, reference, args);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI run(String URI, Object reference, Class superclass, Object... args)
    {
        Object object = null;

        Thread currentthread = Thread.currentThread();

        System.call_registry.push(new Call(object, reference, currentthread.getStackTrace()));

        System.frame_registry.push(new Frame(object, reference, currentthread.getStackTrace()));

        System.rmi.lookup(object, URI);

        //

        super._run(object, reference, args);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI cast(Object object)
    {
        System.rmi.frame(this).run(this, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI cast(String URI)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI register(Object object, String type)
    {
        System.event_registry.events.add(new SystemEvent(type));

        return this;
    }

    @Resource(tie = "super")
    public RMI register(SystemEvent event)
    {
        System.event_registry.events.add(event);

        return this;
    }

    @Resource(tie = "super")
    public RMI register(Frame frame, Object object, String URI)
    {
        return this;
    }
}
