package org.mearvk.circuitry.rmi.system.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;

import java.net.Socket;
import java.security.Key;

public class ThinClientAdmin extends ThinClientAbstract
{
    //

    public ThinClientAdmin()
    {
        System.rmi.securitize(rmi, this);
    }

    //

    @Override
    public void setVersion(int version)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setVersion(Key key, int version)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setSource(String source)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setSource(Key key, String source)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setRMI(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setRMI(Key key, RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setUI(ThinUI thinui)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setUI(Key key, ThinUI thinui)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Key key)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Key key, RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Key key, Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Key key)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Key key, RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Key key, Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void addMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "addMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void addMember(Key key, Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "addMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void removeMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void removeMember(Key key, Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.store(this.rmi.store, this);

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }
}
