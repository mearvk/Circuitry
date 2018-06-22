package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.System;

import java.io.Serializable;

class Main
{
    public static void main(String... args)
    {
        ThinClient client000 = new ThinClient();
    }
}

public class ThinClient extends ThinClientImpl implements Serializable
{
    public UserInterface userinterface;

    @Resource(frame = Frame.METHOD_BASED)
    public ThinClient()
    {
        System.rmi.frame(this).run(this, null);
    }
}

class ThinClientImpl implements Serializable
{
    public UserInterfaceImpl userinterfaceimpl;

    @Resource(frame = Frame.METHOD_BASED)
    public ThinClientImpl()
    {
        assert (System.rmi == null);

        try
        {
            Class.forName("org.mearvk.circuitry.rmi.system.System");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.rmi.frame(this).run(this, null);
    }
}

