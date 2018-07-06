package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;
import org.mearvk.circuitry.rmi.system.thin.ThinClient;

import javax.lang.model.type.NullType;
import java.io.File;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;

public class RMI extends RMIImpl implements Serializable
{
    public static final Integer SIMPLE_PASSTHRU = 0b0001;
    public static final Integer OBJECT_TO_ARGS = 0b0010;
    public static final Integer REFERENCE_TO_ARGS = 0b0100;
    public static final Integer ALL_TO_ARGS = 0b1000;

    //
    public RMIStore store = new RMIStore();
    public ThinClient thinclient001 = null;
    public ThinClient tclient002 = null;
    public ThinClient tclient003 = null;
    public RMI ref = this;
    public RMIImpl impl = super.ref;

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
        System.rmi.store(this.store, "public RMI put()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource()
    public RMI put(Object object, String URI, Object... args)
    {
        System.rmi.store(this.store, "public RMI put()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI, args);

        return this;
    }

    @Resource()
    public RMI put(SystemComponent object, String URI)
    {
        System.rmi.store(this.store, "public RMI put()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI);

        return this;
    }

    @Resource()
    public RMI put(SystemComponent object, String URI, Object... args)
    {
        System.rmi.store(this.store, "public RMI put()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI create(Object object, Class _class, Object ref)
    {
        System.rmi.store(this.store, "public RMI create()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, _class, ref);

        return this;
    }

    @Resource(tie = "super", rules = "meh")
    public RMI create(Class _class, Wrapper ref)
    {
        System.rmi.store(this.store, "public RMI create()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class, ref);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(String type)
    {
        System.rmi.store(this.store, "public RMI filter()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), type);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(EventFilter filter)
    {
        System.rmi.store(this.store, "public RMI filter()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), filter);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(Event event)
    {
        System.rmi.store(this.store, "public RMI filter()", event, Thread.currentThread(), Thread.currentThread().getStackTrace(), event);

        return this;
    }

    @Resource(tie = "super")
    public RMI init(String URI, Object initobject, File initfile)
    {
        System.rmi.store(this.store, "public RMI init()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, initobject, initfile);

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
        System.rmi.store(this.store, "public RMI passthru()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, system, reference);

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object reference, Integer constrainer)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference, constrainer);

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object subclass, NullType dummy, Object... args)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, subclass, dummy, args);

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object subclass, NullType dummy)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, subclass, dummy);

        return this;
    }

    @Resource
    public RMI passthru(Object object, Object subclass, Object reference, NullType dummy, Object... args)
    {
        System.rmi.store(this.store, "public RMI passthru()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, subclass, reference, args);

        //

        return this;
    }

    @Resource
    public RMI passthru(Object object, NullType dummy, Object... args)
    {
        System.rmi.store(this.store, "public RMI passthru()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI compile()
    {
        System.rmi.store(this.store, "public RMI compile()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI go()
    {
        System.rmi.store(this.store, "public RMI go()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI rules(String URI)
    {
        System.rmi.store(this.store, "public RMI rules()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI rules(RMI endpoint)
    {
        System.rmi.store(this.store, "public RMI rules()", endpoint, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI lift(RMIModel object, RMIModel monitor)
    {
        System.rmi.store(this.store, "public RMI lift()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, monitor);

        return this;
    }

    @Resource(tie = "super")
    public RMI fire()
    {
        System.rmi.store(this.store, "public RMI fire()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI desecuritize(RMI rmi, Object reference)
    {
        System.rmi.store(this.store, "public RMI desecuritize(RMI " + rmi + ", Object " + reference + ")", reference, Thread.currentThread(), Thread.currentThread().getStackTrace(), rmi, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI securitize(RMI rmi, Object reference)
    {
        System.rmi.store(this.store, "public RMI securitize(RMI " + rmi + ", Object " + reference + ")", reference, Thread.currentThread(), Thread.currentThread().getStackTrace(), rmi, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI securitize(RMI rmi, Object reference, Key key)
    {
        System.rmi.store(this.store, "public RMI securitize(RMI " + rmi + ", Object " + reference + ", Key " + key + ")", reference, Thread.currentThread(), Thread.currentThread().getStackTrace(), rmi, reference, key);

        return this;
    }

    @Resource(tie = "super")
    public RMI lock()
    {
        System.rmi.store(this.store, "public RMI lock()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI unlock()
    {
        System.rmi.store(this.store, "public RMI unlock()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI listeners()
    {
        System.rmi.store(this.store, "public RMI listeners()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI requests()
    {
        System.rmi.store(this.store, "public RMI requests()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI fill()
    {
        System.rmi.store(this.store, "public RMI fill()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI unhook(Class _class, String type)
    {
        System.rmi.store(this.store, "public RMI unhook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI rehook(Class _class, String type)
    {
        System.rmi.store(this.store, "public RMI rehook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class, String type)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, String type)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class, EventFilter filter)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class, filter);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, Class _class)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, _class);

        return this;
    }

    @Resource(tie = "super")
    public RMI hooks()
    {
        System.rmi.store(this.store, "public RMI hooks()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI hooks(Object object)
    {
        System.rmi.store(this.store, "public RMI hooks()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI store()
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(String id)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(String id, Object object)
    {
        System.rmi.store(this.store, "public RMI store()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String message, Object object, Thread thread, StackTraceElement[] elements, Object... args)
    {
        store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String message, Object object, Thread thread, StackTraceElement[] elements)
    {
        store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Object object, Thread thread, StackTraceElement[] elements)
    {
        store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Object object, Thread thread)
    {
        store.store(object, thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Object object, Thread thread, StackTraceElement[] elements)
    {
        this.store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Object object, Thread thread)
    {
        this.store.store(object, thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Object object)
    {
        store.store(object);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Object object, Thread thread)
    {
        database.store(object, "$", thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id, Object object, Thread thread)
    {
        database.store(object, "$", thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id, Object object, Thread thread)
    {
        store.store(object, "$", thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id, Object object, Thread thread)
    {
        store.store(object, "$", thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Object object)
    {
        database.store(object, "$");

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id, Object object)
    {
        database.store(object, "$");

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id, Object object)
    {
        store.store(object, "$");

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id, Object object)
    {
        store.store(object, "$");

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI as(Object reference)
    {
        System.rmi.store(this.store, "public RMI as()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI reference(Object reference)
    {
        System.rmi.store(this.store, "public RMI reference()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI reference(Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI reference()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI reference(String URI, Object reference)
    {
        System.rmi.store(this.store, "public RMI reference()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference, URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI ref()
    {
        System.rmi.store(this.store, "public RMI ref()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return null;
    }

    @Resource(tie = "super")
    public RMI ref(Object object)
    {
        System.rmi.store(this.store, "public RMI ref()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI ref(Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI ref()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI ref(String URI, Object reference)
    {
        System.rmi.store(this.store, "public RMI ref()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object)
    {
        System.rmi.store(this.store, "public RMI lookup()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(String URI)
    {
        System.rmi.store(this.store, "public RMI lookup()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, Object object)
    {
        System.rmi.store(this.store, "public RMI post()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), stream, object);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, String URI)
    {
        System.rmi.store(this.store, "public RMI post()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(RMIImpl system, Object object)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), system, object);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object, String URI)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object, Object... args)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Object object, String URI, Object... args)
    {
        System.rmi.store(this.store, "public RMI frame()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI logic()
    {
        System.rmi.store(this.store, "public RMI as()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI logic(String URI)
    {
        System.rmi.store(this.store, "public RMI as()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI as()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(String URI, Object reference)
    {
        System.rmi.store(this.store, "public RMI as()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, reference);

        return this;
    }

    public RMI run(Object object, Object subclass, Object reference, StackTraceElement[] stackdata, RMI system, Object... args)
    {
        System.rmi.store(this.store, "public RMI as()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference);

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
        System.rmi.store(this.store, "public RMI cast()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI cast(String URI)
    {
        System.rmi.store(this.store, "public RMI cast()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI register(Object object, String type)
    {
        System.rmi.store(this.store, "public RMI register()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, type);

        System.event_registry.events.add(new SystemEvent(type));

        return this;
    }

    @Resource(tie = "super")
    public RMI register(SystemEvent event)
    {
        System.rmi.store(this.store, "public RMI register()", event, Thread.currentThread(), Thread.currentThread().getStackTrace(), event);

        System.event_registry.events.add(event);

        return this;
    }

    @Resource(tie = "super")
    public RMI register(Frame frame, Object object, String URI)
    {
        System.rmi.store(this.store, "public RMI as()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), frame, object, URI);

        return this;
    }
}
