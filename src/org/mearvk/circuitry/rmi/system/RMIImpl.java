package org.mearvk.circuitry.rmi.system;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class RMIImpl extends RMI
{
    public org.mearvk.circuitry.rmi.system.RMIImpl ref = this;

    public RMIImpl()
    {

    }

    //

    protected org.mearvk.circuitry.rmi.system.RMIImpl file() // neatly that each call should register with System API for calc.
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl init(String URI, Object initobject, File initfile)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl compile()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl go()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl rules(String URI)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl rules(org.mearvk.circuitry.rmi.system.RMIImpl endpoint)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl lift(RMIModel object, RMIModel monitor)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl fire()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl desecuritize(org.mearvk.circuitry.rmi.system.RMIImpl rmi, Object reference)
    {
        return null; //we need this - now
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl securitize(org.mearvk.circuitry.rmi.system.RMIImpl rmi, Object reference)
    {
        return null; //we need this - now
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl lock()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl unlock()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl listeners()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl requests()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl fill()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl hooks()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store(String id)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store(RMIStore store)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store(RMIDbms database)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store(RMIDbms database, Integer id)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store(RMIStore store, String id)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl store(RMIStore store, Integer id)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl as(Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl reference(Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl reference(Object object, Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl reference(String URI, Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl ref()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl ref(Object object, Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl ref(String URI, Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl lookup(Object object)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl lookup(String URI)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl _post(PrintStream stream, Object object)
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

    public org.mearvk.circuitry.rmi.system.RMIImpl _post(PrintStream stream, String URI)
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

    public org.mearvk.circuitry.rmi.system.RMIImpl frame(Object object)
    {
        System.frame_registry.push(object);

        //

        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl frame(Object object, String URI)
    {
        System.frame_registry.push(object);

        //

        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl logic()
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl logic(String URI)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl lookup(Object object, Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl lookup(String URI, Object reference)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl run(Object object, Object reference)
    {
        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl run(String URI, Object reference)
    {
        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl run(Object object, Object reference, Object... args)
    {
        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl run(String URI, Object reference, Class superclass, Object... args)
    {
        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl cast(Object object)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl cast(String URI)
    {
        return null;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl register(SystemEvent event)
    {
        System.event_registry.events.add(event);

        return this;
    }

    public org.mearvk.circuitry.rmi.system.RMIImpl register(Frame frame)
    {
        System.frame_registry.frames.add(frame);

        return this;
    }
}
