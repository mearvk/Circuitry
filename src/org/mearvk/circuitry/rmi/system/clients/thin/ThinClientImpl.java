package org.mearvk.circuitry.rmi.system.clients.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;
import org.mearvk.circuitry.rmi.system.parameterization.Parameter;

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
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void setSource(String source)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void setRMI(RMI rmi)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void setUI(ThinUI thinui)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setUI: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void connect()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void connect(RMI rmi)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void connect(Socket socket)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "connect: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void register()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void register(RMI rmi)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void register(Socket socket)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void addMember(Class _class, String name)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "addMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public synchronized void removeMember(Class _class, String name)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(rmi, this);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }
}
