package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.RMIImpl;
import org.mearvk.circuitry.rmi.system.RMIStore;
import org.mearvk.circuitry.rmi.system.System;
import org.mearvk.circuitry.rmi.system.interfaces.Eric;
import org.mearvk.circuitry.rmi.system.parameterization.Parameter;

import java.io.Serializable;


class Main
{
    public static void main(String... args)
    {
        //

        ThinClient client000 = new ThinClient();

        ThinClient client001 = new ThinClient();

        ThinClient client002 = new ThinClient();

        //

        //System.rmi.hook(ThinClient.class, Hooks.ALL);

        //

        System.rmi.create(ThinClient.class, client000);

        System.rmi.create(ThinClient.class, client001);

        System.rmi.create(ThinClient.class, client002);

        //

        //System.rmi.create(KEY, ThinClient.class, client000);    //tie the client000 to my KEY

        //System.rmi.create(KEY, ThinClient.class, client001);    // ..

        //System.rmi.create(KEY, ThinClient.class, client002);    // ..

        //

        //client000
    }
}

@Resource(frame = Frame.CLASS_BASED)
public class ThinClient extends ThinClientImpl implements Serializable, Eric
{
    public ThinClient ref = this;

    public static ThinClient proto = new ThinClient(new RMIImpl());

    public UserInterface userinterface = new UserInterface();

    private ThinClient(RMIImpl rmi)
    {
        if (ThinClient.proto == null)
        {
            ThinClient.proto = new ThinClient();
        }
    }

    public static ThinClient prototype()
    {
        return proto = new ThinClient(new RMIImpl());
    }

    public ThinClient()
    {
        //System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    public void connect()
    {
        java.lang.System.out.println("Connected...");

        org.mearvk.circuitry.rmi.system.System.rmi.passthru(null);
    }

    public void disconnect()
    {
        System.rmi.passthru(null);
    }

    public void show()
    {
        System.rmi.passthru(null);
    }

    public void hide()
    {
        System.rmi.passthru(null);
    }

    public UserInterface getUserinterface()
    {
        return this.userinterface;
    }
}

@Resource(frame = Frame.CLASS_BASED)
class ThinClientImpl extends ThinClientSystemImpl implements Serializable
{
    public ThinClientImpl ref = this;

    public UserInterfaceImpl userinterfaceimpl = new UserInterfaceImpl();

    public ThinClientImpl()
    {
        //System.rmi.passthru(this, super.ref, null, userinterfaceimpl);
    }

    public void connect()
    {
        System.rmi.passthru(null);
    }

    public void disconnect()
    {
        System.rmi.passthru(null);
    }

    public void show()
    {
        System.rmi.passthru(null);
    }

    public void hide()
    {
        System.rmi.passthru(null);
    }

    public UserInterfaceImpl getUserinterfaceImpl()
    {
        return this.userinterfaceimpl;
    }
}

@Resource(frame = Frame.CLASS_BASED)
class ThinClientSystemImpl implements Serializable
{
    public ThinClientSystemImpl ref = this;

    public UserInterfaceSystemImpl userinterfacesystemimpl = new UserInterfaceSystemImpl();

    public ThinClientSystemImpl()
    {
        System.rmi.store(new Parameter(), new RMIStore());
    }

    public void connect()
    {
        System.rmi.store(new Parameter(), new RMIStore());
    }

    public void disconnect()
    {
        System.rmi.store(new Parameter(), new RMIStore());
    }

    public void hide()
    {
        System.rmi.store(new Parameter(), new RMIStore());
    }

    public void show()
    {
        System.rmi.store(new Parameter(), new RMIStore());
    }

    public UserInterfaceSystemImpl getUserinterfaceSystemImpl()
    {
        return this.userinterfacesystemimpl;
    }
}
