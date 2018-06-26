package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

import javax.lang.model.type.NullType;
import java.io.File;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class RMI extends RMIImpl implements Serializable
{
    public RMI ref = this;

    public RMIImpl impl = super.ref;

    public static final Integer SIMPLE_PASSTHRU = 0b0001;

    public static final Integer OBJECT_TO_ARGS = 0b0010;

    public static final Integer REFERENCE_TO_ARGS = 0b0100;

    public static final Integer ALL_TO_ARGS = 0b1000;

    //

    @Resource(tie = "super")
    public RMI()
    {

    }

    @Resource(tie = "super")
    protected RMI file()
    {
        return this;
    }

    @Resource()
    public RMI put(Object object, String URI)
    {
        return this;
    }

    @Resource()
    public RMI put(Object object, String URI, Object... args)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI create(Object object, Class _class, Object ref)
    {
        //System.rmi.passthru(object , _class, ref);

        //

        return this;
    }

    @Resource(tie = "super", rules = "meh")
    public RMI create(Class _class, Wrapper ref)
    {
        System.rmi.frame(_class, ref);

        //

        super.create(_class, ref.subject);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(String type)
    {
        System.rmi.frame(this).run(this, null, null, null, null);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(EventFilter filter)
    {
        System.rmi.frame(this).run(this, null, null, null, null);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(Event event)
    {
        System.rmi.frame(this).run(this, null, null, null, null);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI init(String URI, Object initobject, File initfile)
    {
        System.rmi.frame(this).run(this, null, null, null, null);

        //

        return this;
    }

    @Resource
    public RMI passthru()
    {
        return this;
    }

    @Resource
    public RMI passthru(RMI system, Object object, Object reference)
    {
        java.lang.System.out.println("Event Stack looks like: ");

        java.lang.System.out.println("  > " + Thread.currentThread().getStackTrace()[2] + "\n");

        // here

        System.rmi.frame(system, object);

        System.rmi.run(object, null, reference, Thread.currentThread().getStackTrace(), system, object, reference);

        //

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object reference, Integer constrainer)
    {
        java.lang.System.out.println("Event Stack looks like: ");

        java.lang.System.out.println("  > " + Thread.currentThread().getStackTrace()[2] + "\n");

        // here

        System.rmi.frame(object);

        if (constrainer == RMI.OBJECT_TO_ARGS)
        {
            System.rmi.run(object, null, reference, Thread.currentThread().getStackTrace(), this, object);
        } else if (constrainer == RMI.REFERENCE_TO_ARGS)
        {
            System.rmi.run(object, null, reference, Thread.currentThread().getStackTrace(), this, reference);
        } else if (constrainer == RMI.ALL_TO_ARGS)
        {
            System.rmi.run(object, null, reference, Thread.currentThread().getStackTrace(), this, object, reference);
        }

        //

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object subclass, NullType dummy, Object... args)
    {
        java.lang.System.out.println("Event Stack looks like: ");

        java.lang.System.out.println("  > " + Thread.currentThread().getStackTrace()[2] + "\n");

        //

        System.rmi.frame(object, subclass);

        System.rmi.run(object, subclass, null, null, null, args);

        //

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object subclass, NullType dummy)
    {
        System.rmi.frame(object, subclass);

        System.rmi.run(object, subclass, null, null, null);

        //

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object subclass, Object reference, NullType dummy, Object... args)
    {
        System.rmi.frame(object, subclass, reference, args);

        System.rmi.run(object, args, null, null, null);

        //

        return this;
    }

    @Resource
    public RMI passthru(Object object, NullType dummy, Object... args)
    {
        System.rmi.frame(object, args);

        System.rmi.run(object, args, null, null, null);

        //

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
        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class, String type)
    {
        System.hook_registry.push(_class, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, String type)
    {
        System.hook_registry.push(object, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class, EventFilter filter)
    {
        System.hook_registry.push(_class, filter);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class)
    {
        System.hook_registry.push(_class);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, Class _class)
    {
        System.hook_registry.push(object, _class);

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
    public RMI store(String id, Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Object object, Thread thread)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id, Object object, Thread thread)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id, Object object, Thread thread)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id, Object object, Thread thread)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id, Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id, Object object)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id, Object object)
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
        System.rmi.frame(this).run(stream, object, null, null, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, String URI)
    {
        //System.rmi.frame(this).run(stream, URI, null, null);

        java.lang.System.out.println(URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(RMIImpl system, Object object)
    {
        System.frame_registry.push(new Frame(system, object));

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
        System.rmi.frame(this).run(this, null, null, null, null);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object, Object reference)
    {
        //

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(String URI, Object reference)
    {
        System.rmi.impl._frame(this)._run(this, null);

        //

        return this;
    }

    public RMI run(Object object, Object subclass, Object reference, StackTraceElement[] stackdata, RMI system, Object... args)
    {
        Method method = null;

        String methodname = stackdata[2].getMethodName();

        String classname = stackdata[2].getClassName();

        ArrayList<Class> argtypes = new ArrayList();

        //

        try
        {
            for (int i = 0; i < args.length; i++)
            {
                if (args[i] == null)
                {
                    continue;   //return value
                }

                argtypes.add(args[i].getClass());
            }

            if (args.length == 0)
            {
                method = this.getClass().asSubclass(system.impl.ref.getClass()).getMethod(methodname);
            }

            if (args.length == 1)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0));
            }

            if (args.length == 2)
            {
                Class _class = this.getClass().getSuperclass();

                Method _method = _class.getMethod(methodname, argtypes.get(0), argtypes.get(1));

                //

                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1));
            }

            if (args.length == 3)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1), argtypes.get(2));
            }

            if (args.length == 4)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1), argtypes.get(2), argtypes.get(3));
            }

            if (args.length == 5)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1), argtypes.get(2), argtypes.get(3), argtypes.get(4));
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        //

        return this;
    }

    /*

    @Resource(tie = "super")
    public RMI run(Object object, Object reference)
    {
        Thread currentthread = Thread.currentThread();

        System.call_registry.push(new Call(object, reference, currentthread.getStackTrace()));

        System.frame_registry.push(new Frame(this, object, null));

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

        System.frame_registry.push(new Frame(this, object, null));

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

        System.frame_registry.push(new Frame(this, object, args));

        //

        super._run(object, reference, args);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI run(String URI, Object reference, Class subclass, Object... args)
    {
        Object object = null;

        Thread currentthread = Thread.currentThread();

        System.call_registry.push(new Call(object, reference, currentthread.getStackTrace()));

        System.frame_registry.push(new Frame(this, object, args));

        System.rmi.lookup(object, URI);

        //

        super._run(object, reference, args);

        //

        return this;
    }

    */

    @Resource(tie = "super")
    public RMI cast(Object object)
    {
        //

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
