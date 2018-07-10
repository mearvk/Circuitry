package org.mearvk.circuitry.rmi.system.parameterization;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;

import java.security.Key;
import java.util.HashMap;

public class Parameter extends ParameterImpl
{
    public byte[] getBytecode()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getBytecode();
    }

    public void setBytecode(byte[] bytecode)
    {
        this.bytecode = bytecode;
    }

    public byte[] getEncrypted()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getEncrypted();
    }

    public void setEncrypted(byte[] encrypted)
    {
        this.encrypted = encrypted;
    }

    public Integer getHashCode()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getHashCode();
    }

    public Integer getHashcode()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getHashcode();
    }

    public void setHashcode(int hashcode)
    {
        this.hashcode = hashcode;
    }

    public Key getKey()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getKey();
    }

    public void setKey(Key key)
    {
        this.key = key;
    }

    public RMI getRMI()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getRMI();
    }

    public Object getReference()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getReference();
    }

    public void setReference(Object reference)
    {
        this.reference = reference;
    }

    public HashMap<Class, Object> getResult()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getResult();
    }

    public void setResult(HashMap<Class, Object> result)
    {
        this.result = result;
    }

    public RMI getRmi()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getRmi();
    }

    public void setRmi(RMI rmi)
    {
        this.rmi = rmi;
    }

    public String getURI()
    {
        Parameter parameter = new Parameter();

        //

        System.rmi.securitize(null, null);

        System.rmi.passthru(parameter);

        System.rmi.desecuritize(null, null);

        //

        return parameter.getURI();
    }

    public void setURI(String URI)
    {
        this.URI = URI;
    }
}
