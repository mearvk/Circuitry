package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.thin.ThinUI;

import java.io.File;
import java.net.Socket;
import java.security.Key;
import java.util.ArrayList;

public abstract class ThinClient
{
    protected ThinClient proto;

    //

    protected Key key;

    protected RMI rmi;

    protected Socket socket;

    protected String source;

    protected ArrayList<Object> registered_objects;

    protected ArrayList<Object> registered_components;

    protected ThinClient working_version;

    protected ThinClient base_version = this;

    private File exceptionsfile;

    private File securityfile;

    private File outputfile;

    //protected Recompiler;     //compile new Source Code into ThinClient impl

    //protected Switch;         //move between working_version & base_version

    //protected ThinUI;

    //protected Encapsulator;

    //protected Securitizer;

    //

    @Resource()
    public ThinClient()
    {
        System.rmi.init("//security", this, this.securityfile);

        System.rmi.init("//exceptions", this, this.exceptionsfile);

        System.rmi.init("//output", this, this.outputfile);

        //

        System.rmi.securitize(rmi, this);
    }

    @Resource()
    public ThinClient(Key key)
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

    //

    @Resource()
    public abstract void setSource(String source);

    @Resource()
    public abstract void setRMI(RMI rmi);

    @Resource()
    public abstract void setUI(ThinUI thinui);

    //

    @Resource()
    public abstract void connect();

    @Resource()
    public abstract void connect(RMI rmi);

    @Resource()
    public abstract void connect(Socket socket);

    //

    @Resource()
    public abstract void addMember(Class _class, String name);

    @Resource()
    public abstract void removeMember(Class _class, String name);
}

