package org.mearvk.circuitry.rmi.system.parameterization;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.RMIStore;
import org.mearvk.circuitry.rmi.system.call.CallClient;
import org.mearvk.circuitry.rmi.system.clients.thin.ThinClient;

import java.security.Key;
import java.util.HashMap;

public class ParameterImpl
{
    protected RMI rmi;

    protected RMIStore store;

    protected String URI;
    protected String type;
    protected String sid;
    protected Object reference;
    protected Object object;
    protected byte[] bytecode;
    protected byte[] encrypted;
    protected HashMap<Class, Object> result;
    protected Key key;
    protected Integer hashcode;
    protected Integer id;
    protected Class _class;
    protected CallClient callclient;
    protected ThinClient thinclient;

    public byte[] getBytecode()
    {
        return bytecode;
    }

    public void setBytecode(byte[] bytecode)
    {
        this.bytecode = bytecode;
    }

    public CallClient getCallclient()
    {
        return callclient;
    }

    public void setCallclient(CallClient callclient)
    {
        this.callclient = callclient;
    }

    public byte[] getEncrypted()
    {
        return encrypted;
    }

    public void setEncrypted(byte[] encrypted)
    {
        this.encrypted = encrypted;
    }

    public Integer getHashcode()
    {
        return hashcode;
    }

    public void setHashcode(Integer hashcode)
    {
        this.hashcode = hashcode;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Key getKey()
    {
        return key;
    }

    public void setKey(Key key)
    {
        this.key = key;
    }

    public Object getObject()
    {
        return object;
    }

    public void setObject(Object object)
    {
        this.object = object;
    }

    public Object getReference()
    {
        return reference;
    }

    public void setReference(Object reference)
    {
        this.reference = reference;
    }

    public HashMap<Class, Object> getResult()
    {
        return result;
    }

    public void setResult(HashMap<Class, Object> result)
    {
        this.result = result;
    }

    public RMI getRmi()
    {
        return rmi;
    }

    public void setRmi(RMI rmi)
    {
        this.rmi = rmi;
    }

    public String getSid()
    {
        return sid;
    }

    public void setSid(String sid)
    {
        this.sid = sid;
    }

    public RMIStore getStore()
    {
        return store;
    }

    public void setStore(RMIStore store)
    {
        this.store = store;
    }

    public ThinClient getThinclient()
    {
        return thinclient;
    }

    public void setThinclient(ThinClient thinclient)
    {
        this.thinclient = thinclient;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getURI()
    {
        return URI;
    }

    public void setURI(String URI)
    {
        this.URI = URI;
    }

    public Class get_class()
    {
        return _class;
    }

    public void set_class(Class _class)
    {
        this._class = _class;
    }
}
