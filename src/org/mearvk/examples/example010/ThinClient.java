package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.RMIStore;
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

        //

        System.rmi.create(ThinClient.class, client000);

        System.rmi.create(ThinClient.class, client001);

        System.rmi.create(ThinClient.class, client002);
    }
}

@Resource(frame = Frame.CLASS_BASED)
public class ThinClient extends ThinClientImpl implements Serializable
{
    public ThinClient ref = this;

    public UserInterface userinterface = new UserInterface();

    public ThinClient()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void connect()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void disconnect()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void show()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void hide()
    {
        System.rmi.passthru(this, super.ref);
    }
}

@Resource(frame = Frame.CLASS_BASED)
class ThinClientImpl extends ThinClientSystemImpl implements Serializable
{
    public ThinClientImpl ref = this;

    public UserInterfaceImpl userinterfaceimpl = new UserInterfaceImpl();

    public ThinClientImpl()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void connect()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void disconnect()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void show()
    {
        System.rmi.passthru(this, super.ref);
    }

    public void hide()
    {
        System.rmi.passthru(this, super.ref);
    }
}

class ThinClientSystemImpl implements Serializable
{
    public ThinClientSystemImpl ref = this;

    public UserInterfaceSystemImpl userinterfaceimpl = new UserInterfaceSystemImpl();

    public ThinClientSystemImpl()
    {
        System.rmi.store(new RMIStore(), this);
    }

    public void connect()
    {
        System.rmi.store(new RMIStore(), this);
    }

    public void disconnect()
    {
        System.rmi.store(new RMIStore(), this);
    }

    public void show()
    {
        System.rmi.store(new RMIStore(), this);
    }

    public void hide()
    {
        System.rmi.store(new RMIStore(), this);
    }
}

