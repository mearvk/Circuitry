package org.mearvk.circuitry.rmi.system.clients.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;

import java.net.Socket;
import java.security.Key;

public class ThinClientImpl extends ThinClientSecurity
{
    protected Key key = null;



    //

    public ThinClientImpl()
    {
        System.rmi.securitize(rmi, this);
    }

    //

    @Override
    public synchronized void setVersion(int version)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void setSource(String source)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void setRMI(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void setUI(ThinUI thinui)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setUI: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void connect()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void connect(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void connect(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void register()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void register(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void register(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void addMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "addMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void removeMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }
}
