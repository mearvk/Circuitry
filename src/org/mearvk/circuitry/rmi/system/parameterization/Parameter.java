package org.mearvk.circuitry.rmi.system.parameterization;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;

import java.security.Key;
import java.util.HashMap;

public class Parameter extends ParameterImpl
{
    public Integer getHashCode()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getHashCode();
    }

    public void setBytecode(byte[] bytecode)
    {
        this.bytecode = bytecode;
    }

    public RMI getRMI()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getRMI();
    }

    public void setEncrypted(byte[] encrypted)
    {
        this.encrypted = encrypted;
    }

    public RMI getRmi()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(parameter, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getRmi();
    }

    public String getURI()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getURI();
    }

    public void setHashcode(int hashcode)
    {
        this.hashcode = hashcode;
    }

    public Object getReference()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getReference();
    }

    public void setKey(Key key)
    {
        this.key = key;
    }

    public String getObject()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getURI();
    }

    public byte[] getBytecode()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getBytecode();
    }

    public void setReference(Object reference)
    {
        this.reference = reference;
    }

    public byte[] getEncrypted()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getEncrypted();
    }

    public void setResult(HashMap<Class, Object> result)
    {
        this.result = result;
    }

    public HashMap<Class, Object> getResult()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getResult();
    }

    public void setRmi(RMI rmi)
    {
        this.rmi = rmi;
    }

    public Key getKey()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getKey();
    }

    public Integer getHashcode()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(parameter, null);

        //

        return parameter.getHashcode();
    }

    public void setObject(RMI rmi)
    {
        this.rmi = rmi;
    }

    public void setURI(String URI)
    {
        this.URI = URI;
    }
}
