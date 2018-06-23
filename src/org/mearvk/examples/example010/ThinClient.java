package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.System;
import org.mearvk.circuitry.rmi.system.interfaces.Hooks;

import java.io.Serializable;

class Main
{
    public static void main(String... args)
    {
        ThinClient client000 = null;

        ThinClient client001 = null;

        ThinClient client002 = null;

        //

        System.rmi.hook(ThinClient.class, Hooks.ALL);

        System.rmi.unhook(ThinClient.class, Hooks.ON_DATA);

        System.rmi.rehook(ThinClient.class, Hooks.ON_DATA);

        //

        System.rmi.create(ThinClient.class, client000);

        System.rmi.create(ThinClient.class, client001);

        System.rmi.create(ThinClient.class, client002);
    }
}

@Resource(frame = Frame.CLASS_BASED)
public class ThinClient extends ThinClientImpl implements Serializable
{
    public UserInterface userinterface = new UserInterface();

    public ThinClient()
    {
        System.rmi.frame(this).run(this, null);
    }

    public void connect()
    {
        System.rmi.frame(this).run(this, null);
    }
}

@Resource(frame = Frame.CLASS_BASED)
class ThinClientImpl implements Serializable
{
    public UserInterfaceImpl userinterfaceimpl = new UserInterfaceImpl();

    public ThinClientImpl()
    {
        System.rmi.frame(this).run(this, null);
    }
}

