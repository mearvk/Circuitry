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

    protected RMIImpl _file()
    {
        return this;
    }

    public RMIImpl _init(String URI, Object initobject, File initfile)
    {
        return this;
    }

    public RMIImpl _compile()
    {
        return this;
    }

    public RMIImpl _go()
    {
        return this;
    }

    public RMIImpl _rules(String URI)
    {
        return this;
    }

    public RMIImpl _rules(RMIImpl endpoint)
    {
        return this;
    }

    public RMIImpl _lift(RMIModel object, RMIModel monitor)
    {
        return this;
    }

    public RMIImpl _fire()
    {
        return this;
    }

    public RMIImpl desecuritize(RMIImpl rmi, Object reference)
    {
        return this; //we need this - now
    }

    public RMIImpl _securitize(RMIImpl rmi, Object reference)
    {
        return this; //we need this - now
    }

    public RMIImpl _lock()
    {
        return this;
    }

    public RMIImpl _unlock()
    {
        return this;
    }

    public RMIImpl _listeners()
    {
        return this;
    }

    public RMIImpl _requests()
    {
        return this;
    }

    public RMIImpl _fill()
    {
        return this;
    }

    public RMIImpl _hook(Object object, String type)
    {
        System.hook_registry.push(new Hook(object, type));

        System.event_registry.push(new Event(object, type));

        System.frame_registry.push(new Frame(object));

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
        return this;
    }

    public RMIImpl _store(String id)
    {
        return this;
    }

    public RMIImpl _store(RMIStore store)
    {
        return this;
    }

    public RMIImpl _store(RMIDbms database)
    {
        return this;
    }

    public RMIImpl _store(RMIDbms database, Integer id)
    {
        return this;
    }

    public RMIImpl _store(RMIStore store, String id)
    {
        return this;
    }

    public RMIImpl _store(RMIStore store, Integer id)
    {
        return this;
    }

    public RMIImpl _as(Object reference)
    {
        return this;
    }

    public RMIImpl _reference(Object reference)
    {
        return this;
    }

    public RMIImpl _reference(Object object, Object reference)
    {
        return this;
    }

    public RMIImpl _reference(String URI, Object reference)
    {
        return this;
    }

    public RMIImpl _ref()
    {
        return this;
    }

    public RMIImpl _ref(Object object, Object reference)
    {
        return this;
    }

    public RMIImpl _ref(String URI, Object reference)
    {
        return this;
    }

    public RMIImpl _lookup(Object object)
    {
        return this;
    }

    public RMIImpl _lookup(String URI)
    {
        return this;
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

    public RMIImpl post(PrintStream stream, String URI)
    {
        return this;
    }

    @Resource()
    public RMIImpl create(Class _class, Object ref)
    {
        System.rmi.post(java.lang.System.out, "RMIImpl create() called...\n");

        //

        return this;
    }

    @Resource()
    public RMIImpl create(Class _class, Object ref, Object... args)
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

    public RMIImpl _frame(Object object, Object... args)
    {
        java.lang.System.out.println("RMIImpl _frame called...\n");

        System.frame_registry.push(new Frame(object));

        //

        return this;
    }

    public RMIImpl _frame(Object object, String URI, Object... args)
    {
        java.lang.System.out.println("RMIImpl _frame called...\n");

        System.frame_registry.push(new Frame(object));

        //

        return this;
    }

    public RMIImpl _logic()
    {
        return null;
    }

    public RMIImpl _logic(String URI)
    {
        return this;
    }

    public RMIImpl _lookup(Object object, Object reference)
    {
        return this;
    }

    public RMIImpl _lookup(String URI, Object reference)
    {
        return this;
    }

    @Resource()
    public RMIImpl _run(Object object, Object reference, Thread thread)
    {
        java.lang.System.out.println("RMIImpl _run called...\n");

        Method method = null;

        Class[] types = null;

        Object[] args = null;

        //

        System.call_registry.pull(object, method, types, args);

        //

        try
        {
            if (reference == null)
            {
                java.lang.System.out.println("RMIImpl _run called [null reference]\n");

                return this;
            }

            if (object == null)
            {
                java.lang.System.out.println("RMIImpl _run called [null object]\n");

                return this;
            }

            reference = method.invoke(object);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //

        return this;
    }

    @Resource()
    public RMIImpl _run(String URI, Object reference)
    {
        java.lang.System.out.println("RMIImpl _run called...\n");

        Method method = null;

        Class[] types = null;

        Object[] args = null;

        Object object = System.rmi.lookup(URI);

        //

        System.call_registry.pull(object, method, types, args);

        //

        try
        {
            if (reference == null)
            {
                java.lang.System.out.println("RMIImpl _run called [null reference]\n");

                return this;
            }

            if (object == null)
            {
                java.lang.System.out.println("RMIImpl _run called [null object]\n");

                return this;
            }

            reference = method.invoke(object, null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return this;
    }

    @Resource()
    public RMIImpl _run(Object object, Object reference, Object... args)
    {
        java.lang.System.out.println("RMIImpl _run called...\n");

        Method method = null;

        Class[] types = null;

        //

        try
        {
            System.call_registry.pull(object, method, types, args);
        }
        catch (Exception e)
        {
            //
        }

        //

        try
        {
            if (reference == null)
            {
                java.lang.System.out.println("RMIImpl _run called [null reference]\n");

                return this;
            }

            if (object == null)
            {
                java.lang.System.out.println("RMIImpl _run called [null object]\n");

                return this;
            }

            reference = method.invoke(object, null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return this;
    }

    @Resource()
    public RMIImpl _run(String URI, Object reference, Class superclass, Object... args)
    {
        java.lang.System.out.println("RMIImpl _run called...\n");

        return this;
    }

    public RMIImpl _cast(Object object)
    {
        return this;
    }

    public RMIImpl _cast(String URI)
    {
        return this;
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
