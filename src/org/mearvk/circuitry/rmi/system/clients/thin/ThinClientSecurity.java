package org.mearvk.circuitry.rmi.system.clients.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;
import org.mearvk.circuitry.rmi.system.parameterization.Parameter;

import java.math.BigInteger;
import java.net.Socket;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Random;

public class ThinClientSecurity extends ThinClientAdmin
{
    protected PublicKey pubkey = null;

    protected PrivateKey prvkey = null;

    //

    public ThinClientSecurity()
    {
        System.rmi.securitize(new Parameter(), this.key);

        try
        {
            this.pubkey = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(BigInteger.probablePrime(1024, new Random()), new BigInteger("3")));

            this.prvkey = KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(BigInteger.probablePrime(1024, new Random()), new BigInteger("3")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //

    @Override
    public void setVersion(int version)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setSource(String source)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setRMI(RMI rmi)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setUI(ThinUI thinui)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "setUI: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "connect: ["+null+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(RMI rmi)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Socket socket)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "connect: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "register: ["+null+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(RMI rmi)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Socket socket)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "register: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void addMember(Class _class, String name)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "addMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void removeMember(Class _class, String name)
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }
}
