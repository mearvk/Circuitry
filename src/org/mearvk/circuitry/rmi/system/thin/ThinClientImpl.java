package org.mearvk.circuitry.rmi.system.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;

import java.net.Socket;

public class ThinClientImpl extends ThinClientSecurity
{
    @Override
    public void setVersion(byte version)
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

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

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

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

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

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void addMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "addMember: ["+_class+"]");

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
