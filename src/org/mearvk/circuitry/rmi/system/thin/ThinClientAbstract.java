package org.mearvk.circuitry.rmi.system.thin;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.RMIStore;
import org.mearvk.circuitry.rmi.system.System;

import java.io.File;
import java.net.Socket;
import java.security.Key;
import java.util.ArrayList;

public abstract class ThinClientAbstract
{
    public RMIStore store = new RMIStore();

    //

    protected ThinClientAbstract proto;

    //

    protected Key key;

    protected RMI rmi;

    protected Socket socket;

    protected String source;

    protected ArrayList<Object> registered_objects;

    protected ArrayList<Object> registered_components;

    protected ThinClientAbstract working_version;

    protected ThinClientAbstract base_version = this;

    private File exceptionsfile;

    private File securityfile;

    private File outputfile;

    //protected Recompiler;     //compile new Source Code into ThinClientAbstract impl

    //protected Switch;         //move between working_version & base_version

    //protected ThinUI;

    //protected Encapsulator;

    //protected Securitizer;

    //

    @Resource()
    public ThinClientAbstract()
    {
        System.rmi.init("//security", this, this.securityfile);

        System.rmi.init("//exceptions", this, this.exceptionsfile);

        System.rmi.init("//output", this, this.outputfile);

        //

        System.rmi.securitize(rmi, this);
    }

    @Resource()
    public ThinClientAbstract(Key key)
    {
        System.rmi.init("//security", this, this.securityfile);

        System.rmi.init("//exceptions", this, this.exceptionsfile);

        System.rmi.init("//output", this, this.outputfile);

        //

        System.rmi.securitize(rmi, this, key);
    }

    //

    @Resource()
    public abstract void setVersion(byte version);

    @Resource()
    public abstract void setVersion(Key key, byte version);

    //

    @Resource()
    public abstract void setSource(String source);

    @Resource()
    public abstract void setSource(Key key, String source);

    @Resource()
    public abstract void setRMI(RMI rmi);

    @Resource()
    public abstract void setRMI(Key key, RMI rmi);

    @Resource()
    public abstract void setUI(ThinUI thinui);

    @Resource()
    public abstract void setUI(Key key, ThinUI thinui);

    //

    @Resource()
    public abstract void connect();

    @Resource()
    public abstract void connect(Key key);

    @Resource()
    public abstract void connect(RMI rmi);

    @Resource()
    public abstract void connect(Key key, RMI rmi);

    @Resource()
    public abstract void connect(Socket socket);

    @Resource()
    public abstract void connect(Key key, Socket socket);

    @Resource()
    public abstract void register();

    @Resource()
    public abstract void register(Key key);

    @Resource()
    public abstract void register(RMI rmi);

    @Resource()
    public abstract void register(Key key, RMI rmi);

    @Resource()
    public abstract void register(Socket socket);

    @Resource()
    public abstract void register(Key key, Socket socket);

    //

    @Resource()
    public abstract void addMember(Class _class, String name);

    @Resource()
    public abstract void addMember(Key key, Class _class, String name);

    @Resource()
    public abstract void removeMember(Class _class, String name);

    @Resource()
    public abstract void removeMember(Key key, Class _class, String name);
}

