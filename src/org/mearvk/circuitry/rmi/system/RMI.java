package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

import javax.xml.stream.EventFilter;
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

    //

    protected RMI file() // neatly that each call should register with System API for calc.
    {
        return null;
    }

    //

    public RMI create(Class _class, Object ref)
    {
        return this;
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
        return this;
    }

    public RMI fill()
    {
        return this;
    }

    public RMI removehook(Class _class, String type)
    {
        return this;
    }

    public RMI addhook(Class _class, String type)
    {
        return this;
    }

    public RMI hook(Class _class, String type)
    {
        return this;
    }

    public RMI hook(Class _class, EventFilter filter)
    {
        return this;
    }

    public RMI hook(Class _class)
    {
        return this;
    }

    public RMI hook(Object object, Class _class)
    {
        return this;
    }

    public RMI hooks()
    {
        return this;
    }

    public RMI store()
    {
        return this;
    }

    public RMI store(String id)
    {
        return this;
    }

    public RMI store(RMIStore store)
    {
        return this;
    }

    public RMI store(RMIDbms database)
    {
        return this;
    }

    public RMI store(RMIDbms database, Integer id)
    {
        return this;
    }

    public RMI store(RMIStore store, String id)
    {
        return this;
    }

    public RMI store(RMIStore store, Integer id)
    {
        return this;
    }

    public RMI as(Object reference)
    {
        return this;
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
    public RMI frame(Object object)
    {
        System.rmi.impl._frame(object)._run(object, null);

        return this;
    }

    @Resource()
    public RMI frame(Object object, String URI)
    {
        System.rmi.impl._frame(object)._run(object, URI);

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
        System.rmi.impl._frame(object, args)._run(object, null);

        return this;
    }

    public RMI logic()
    {
        System.rmi.impl._frame(this)._run(this, null);

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
        System.rmi.impl._run(object, reference);

        return this;
    }

    public RMI run(String URI, Object reference)
    {
        System.rmi.impl._run(URI, reference);

        return this;
    }

    public RMI run(Object object, Object reference, Object... args)
    {
        System.rmi.impl._run(object, reference, args);

        return this;
    }

    public RMI run(String URI, Object reference, Class superclass, Object... args)
    {
        System.rmi.impl._run(URI, reference, args);

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

    public RMI register(Object object, String type)
    {
        System.EREG.events.add(new SystemEvent(type));

        return this;
    }

    public RMI register(SystemEvent event)
    {
        System.EREG.events.add(event);

        return this;
    }

    public RMI register(Frame frame, Object object, String URI)
    {
        return this;
    }

    public RMI register(Frame frame)
    {
        java.lang.System.out.println("RMI Frame Registry receives [JVM " + frame.jvm + "]: ");

        java.lang.System.out.println("  > Frame : " + frame.toString());

        java.lang.System.out.println("  > Method : " + frame.classname + " " + frame.methodname);

        java.lang.System.out.println("  > Object : " + frame.object);

        java.lang.System.out.println("  > Timestamp : " + frame.date);

        java.lang.System.out.println("  > Bytecode : " + frame.bytecodestring);

        java.lang.System.out.println("  > Stacktrace : " + frame.stacktrace);


        return this;
    }
}
