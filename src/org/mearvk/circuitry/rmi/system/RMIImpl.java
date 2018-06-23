package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.interfaces.Hooks;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class RMIImpl
{
    public RMIImpl ref = this;

    public RMIImpl()
    {

    }

    //

    protected RMIImpl _file() // neatly that each call should register with System API for calc.
    {
        return null;
    }

    public RMIImpl _init(String URI, Object initobject, File initfile)
    {
        return null;
    }

    public RMIImpl _compile()
    {
        return null;
    }

    public RMIImpl _go()
    {
        return null;
    }

    public RMIImpl _rules(String URI)
    {
        return null;
    }

    public RMIImpl _rules(RMIImpl endpoint)
    {
        return null;
    }

    public RMIImpl _lift(RMIModel object, RMIModel monitor)
    {
        return null;
    }

    public RMIImpl _fire()
    {
        return null;
    }

    public RMIImpl desecuritize(RMIImpl rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMIImpl _securitize(RMIImpl rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMIImpl _lock()
    {
        return null;
    }

    public RMIImpl _unlock()
    {
        return null;
    }

    public RMIImpl _listeners()
    {
        return null;
    }

    public RMIImpl _requests()
    {
        return null;
    }

    public RMIImpl _fill()
    {
        return null;
    }

    public RMIImpl _hook(Object object, String type)
    {
        System.hook_registry.push(new Hook(object, type));

        System.event_registry.push(new Event(object, type));

        System.frame_registry.push(new Frame(object, type));

        return this;
    }

    public RMIImpl _hooks()
    {
        System.hook_registry.push(null, Hooks.REF_REGISTRY);

        System.event_registry.push(null, Hooks.REF_REGISTRY);

        System.frame_registry.push(new Frame());

        return this;
    }

    public RMIImpl _store()
    {
        return null;
    }

    public RMIImpl _store(String id)
    {
        return null;
    }

    public RMIImpl _store(RMIStore store)
    {
        return null;
    }

    public RMIImpl _store(RMIDbms database)
    {
        return null;
    }

    public RMIImpl _store(RMIDbms database, Integer id)
    {
        return null;
    }

    public RMIImpl _store(RMIStore store, String id)
    {
        return null;
    }

    public RMIImpl _store(RMIStore store, Integer id)
    {
        return null;
    }

    public RMIImpl _as(Object reference)
    {
        return null;
    }

    public RMIImpl _reference(Object reference)
    {
        return null;
    }

    public RMIImpl _reference(Object object, Object reference)
    {
        return null;
    }

    public RMIImpl _reference(String URI, Object reference)
    {
        return null;
    }

    public RMIImpl _ref()
    {
        return null;
    }

    public RMIImpl _ref(Object object, Object reference)
    {
        return null;
    }

    public RMIImpl _ref(String URI, Object reference)
    {
        return null;
    }

    public RMIImpl _lookup(Object object)
    {
        return null;
    }

    public RMIImpl _lookup(String URI)
    {
        return null;
    }

    public RMIImpl _post(PrintStream stream, Object object)
    {
        try
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ObjectOutputStream oos = new ObjectOutputStream(baos);

            //

            oos.writeObject(object);

            oos.flush();

            oos.close();

            //

            byte[] bytes = baos.toByteArray();

            //

            stream.println("Class size: " + baos.toByteArray().length);

            for (int i = 0; i < bytes.length; i++)
            {
                stream.write((char) bytes[i]);
            }

            //

            //stream.println("Class data: " + bytes);

            stream.flush();

            stream.close();

            //
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return this;
    }

    public RMIImpl _post(PrintStream stream, String URI)
    {
        return this;
    }

    @Resource()
    public RMIImpl _create(Class _class, Object ref)
    {
        return this;
    }

    @Resource()
    public RMIImpl _create(Class _class, Object ref, Object... args)
    {
        Object object = null;

        try
        {
            object = _class.newInstance();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            ref = object;
        }

        System.registry.register(object, Registrar.CREATE);

        //

        return this;
    }

    /**
     * Same object and same stack function subset should equal the same context
     *
     * @param object
     * @return
     */
    public RMIImpl _frame(Object object, Object... args)
    {
        System.rmi.register(new Frame(object, args));

        //

        return this;
    }

    public RMIImpl _frame(Object object, String URI, Object... args)
    {
        System.rmi.register(new Frame(), object, URI);

        //

        return this;
    }

    public RMIImpl _logic()
    {
        return null;
    }

    public RMIImpl _logic(String URI)
    {
        return null;
    }

    public RMIImpl _lookup(Object object, Object reference)
    {
        return null;
    }

    public RMIImpl _lookup(String URI, Object reference)
    {
        return null;
    }

    public RMIImpl _run(Object object, Object reference)
    {
        Method method = null;

        Class[] types = null;

        Object[] args = null;

        //

        System.call_registry.pull(object, method, types, args);

        //

        try
        {
            method.invoke(object, null);
        }
        catch (Exception e)
        {
            //e.printStackTrace();
        }

        //

        return this;
    }

    public RMIImpl _run(String URI, Object reference)
    {
        return this;
    }

    public RMIImpl _run(Object object, Object reference, Object... args)
    {
        return this;
    }

    public RMIImpl _run(String URI, Object reference, Class superclass, Object... args)
    {
        return this;
    }

    public RMIImpl _cast(Object object)
    {
        return null;
    }

    public RMIImpl _cast(String URI)
    {
        return null;
    }

    public RMIImpl _register(SystemEvent event)
    {
        System.event_registry.events.add(event);

        return this;
    }

    public RMIImpl _register(Frame frame)
    {
        System.frame_registry.frames.add(frame);

        return this;
    }
}
