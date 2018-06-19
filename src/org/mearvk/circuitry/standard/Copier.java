package org.mearvk.circuitry.standard;

import org.mearvk.ancellaries.System;
import org.mearvk.ancellaries.SystemComponent;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Copier extends SystemComponent
{
    public Object source;

    public Object destination;

    //

    public Copier()
    {

    }

    public Copier(System system)
    {
        this.system = system;
    }

    public void copy()
    {
        try
        {
            ByteArrayOutputStream baos;

            ByteArrayInputStream bais;

            ObjectOutputStream oos;

            ObjectInputStream ois;

            //

            baos = new ByteArrayOutputStream();

            oos = new ObjectOutputStream(baos);

            //

            oos.writeObject(target);

            //

            bais = new ByteArrayInputStream(baos.toByteArray());

            //

            ois = new ObjectInputStream(bais);

            //

            destination = ois.readObject();
        }
        catch (Exception e)
        {

        }
    }

    @Override
    public void latch() throws Exception
    {

    }

    @Override
    public void unlatch() throws Exception
    {

    }

    @Override
    public void ready() throws Exception
    {

    }

    @Override
    public void init() throws Exception
    {

    }
}
