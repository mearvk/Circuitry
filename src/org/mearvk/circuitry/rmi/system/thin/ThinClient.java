package org.mearvk.circuitry.rmi.system.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;

import java.net.Socket;

public class ThinClient extends ThinClientImpl
{
    public ThinClient()
    {
        System.rmi.securitize(rmi, this); //encrypt object in memory, lock object calls, install encapsulators, validate before allowing method calls
    }

    //

    public static void main(String... args)
    {
        //System.rmi.create(null, null);
        CallClient samsungmicrowaveclient = new SamsungMicrowaveClient();

        System.registry
                .lookup("rmi://samsung/microwaves")
                .ref("remote/interface", samsungmicrowaveclient)
                .synchronize(samsungmicrowaveclient)
                .go();

        System.registry
                .lookup("ip://10.24.1.35")
                .ref("local/microwave", samsungmicrowaveclient)
                .synchronize(samsungmicrowaveclient)
                .go();

        samsungmicrowaveclient.probe(samsungmicrowaveclient, "language{Chinese-Mandarin}");

        samsungmicrowaveclient.probe(samsungmicrowaveclient, "firmware{latest}");

        samsungmicrowaveclient.stdout(System.out);

        samsungmicrowaveclient.run();
    }

    //

    @Override
    public void setVersion(int version)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setSource(String source)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setRMI(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setUI(ThinUI thinui)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setUI: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+null+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+null+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: [" + socket + "]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void addMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "addMember: [" + _class + "]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void removeMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }
}
