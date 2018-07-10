package org.mearvk.circuitry.rmi.system.parameterization;

import org.mearvk.circuitry.rmi.system.RMI;

import java.security.Key;
import java.util.HashMap;

public class ParameterImpl
{
    public RMI rmi;

    public String URI;

    public Object reference;

    public byte[] bytecode;

    public byte[] encrypted;

    public HashMap<Class, Object> result;

    public Key key;

    public Integer hashcode;
}
