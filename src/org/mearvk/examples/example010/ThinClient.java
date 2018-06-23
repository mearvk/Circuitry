package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.Hook;
import org.mearvk.circuitry.rmi.system.System;

import java.io.Serializable;

class Main
{
    public static void main(String... args)
    {
        ThinClient client000 = null;

        ThinClient client001 = null;

        ThinClient client002 = null;

        //

        System.rmi.hook(ThinClient.class, Hook.ON_ALL);                                           //care about all hooks for this class of object

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

