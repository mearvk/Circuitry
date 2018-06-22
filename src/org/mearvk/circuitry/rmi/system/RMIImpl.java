package org.mearvk.circuitry.rmi.system;

import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class RMIImpl extends RMI
{
    public RMIImpl ref = this;

    public RMIImpl()
    {

    }

    //

    protected RMIImpl file() // neatly that each call should register with System API for calc.
    {
        return null;
    }

    public RMIImpl init(String URI, Object initobject, File initfile)
    {
        return null;
    }

    public RMIImpl compile()
    {
        return null;
    }

    public RMIImpl go()
    {
        return null;
    }

    public RMIImpl rules(String URI)
    {
        return null;
    }

    public RMIImpl rules(RMIImpl endpoint)
    {
        return null;
    }

    public RMIImpl lift(RMIModel object, RMIModel monitor)
    {
        return null;
    }

    public RMIImpl fire()
    {
        return null;
    }

    public RMIImpl desecuritize(RMIImpl rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMIImpl securitize(RMIImpl rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMIImpl lock()
    {
        return null;
    }

    public RMIImpl unlock()
    {
        return null;
    }

    public RMIImpl listeners()
    {
        return null;
    }

    public RMIImpl requests()
    {
        return null;
    }

    public RMIImpl fill()
    {
        return null;
    }

    public RMIImpl hooks()
    {
        return null;
    }

    public RMIImpl store()
    {
        return null;
    }

    public RMIImpl store(String id)
    {
        return null;
    }

    public RMIImpl store(RMIStore store)
    {
        return null;
    }

    public RMIImpl store(RMIDbms database)
    {
        return null;
    }

    public RMIImpl store(RMIDbms database, Integer id)
    {
        return null;
    }

    public RMIImpl store(RMIStore store, String id)
    {
        return null;
    }

    public RMIImpl store(RMIStore store, Integer id)
    {
        return null;
    }

    public RMIImpl as(Object reference)
    {
        return null;
    }

    public RMIImpl reference(Object reference)
    {
        return null;
    }

    public RMIImpl reference(Object object, Object reference)
    {
        return null;
    }

    public RMIImpl reference(String URI, Object reference)
    {
        return null;
    }

    public RMIImpl ref()
    {
        return null;
    }

    public RMIImpl ref(Object object, Object reference)
    {
        return null;
    }

    public RMIImpl ref(String URI, Object reference)
    {
        return null;
    }

    public RMIImpl lookup(Object object)
    {
        return null;
    }

    public RMIImpl lookup(String URI)
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
        try
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ObjectOutputStream oos = new ObjectOutputStream(baos);

            //

            oos.writeObject(System.rmi.lookup(URI));

            oos.flush();

            oos.close();

            //

            stream.println("Event: " + baos.toByteArray());

            stream.println("Event: " + baos.toByteArray().length);

            stream.flush();

            stream.close();

            //
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //

        return this;
    }

    public RMIImpl frame(Object object)
    {
        System.frame_registry.push(object);

        //

        return this;
    }

    public RMIImpl frame(Object object, String URI)
    {
        System.frame_registry.push(object);

        //

        return this;
    }

    public RMIImpl logic()
    {
        return null;
    }

    public RMIImpl logic(String URI)
    {
        return null;
    }

    public RMIImpl lookup(Object object, Object reference)
    {
        return null;
    }

    public RMIImpl lookup(String URI, Object reference)
    {
        return null;
    }

    public RMIImpl run(Object object, Object reference)
    {
        return this;
    }

    public RMIImpl run(String URI, Object reference)
    {
        return this;
    }

    public RMIImpl run(Object object, Object reference, Object... args)
    {
        return this;
    }

    public RMIImpl run(String URI, Object reference, Class superclass, Object... args)
    {
        return this;
    }

    public RMIImpl cast(Object object)
    {
        return null;
    }

    public RMIImpl cast(String URI)
    {
        return null;
    }

    public RMIImpl register(SystemEvent event)
    {
        System.event_registry.events.add(event);

        return this;
    }

    public RMIImpl register(Frame frame)
    {
        System.frame_registry.frames.add(frame);

        return this;
    }
}
