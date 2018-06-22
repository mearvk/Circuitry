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

public class ThinClient implements Serializable
{
    public UserInterface userinterface;

    @Resource(frame = Frame.METHOD_BASED)
    public ThinClient()
    {
        System.rmi.frame(this).run(this, null);
    }
}

class ThinClientImpl extends ThinClient implements Serializable
{
    public UserInterfaceImpl userinterfaceimpl;

    @Resource(frame = Frame.METHOD_BASED)
    public ThinClientImpl()
    {
        System.rmi.frame(this).run(this, null);
    }
}

