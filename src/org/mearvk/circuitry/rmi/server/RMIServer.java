package org.mearvk.circuitry.rmi.server;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.System;

import java.io.IOException;
import java.io.Serializable;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.UnknownHostException;

@Resource(requires = "//pre/boards/exceptions")
public class RMIServer extends RMIServerImpl implements Remote, Serializable
{
    public Exception failure;

    public RMIServer()
    {
        this("rmi://localhost/server");
    }

    public RMIServer(String name)
    {
        Process process = null;

        try
        {
            process = Runtime.getRuntime().exec("rmiregistry");

            Naming.bind(name, this);
        }
        catch (UnknownHostException uhe)
        {
            System.rmi.post("//pre/boards/exceptions", uhe.getMessage());

            process.destroy();

            process = null;

            this.failure = uhe;
        }
        catch (AlreadyBoundException abe)
        {
            System.rmi.post("//pre/boards/exceptions", abe.getMessage());

            process.destroy();

            process = null;

            this.failure = abe;
        }
        catch (IOException ioe)
        {
            System.rmi.post("//pre/boards/exceptions", ioe.getMessage());

            process.destroy();

            process = null;

            this.failure = ioe;
        }
        finally
        {
            if (process != null)
            {
                java.lang.System.out.println("RMI Server [" + name + "] startup completed.");
                java.lang.System.out.println("    >> JVM: " + Runtime.version());
                java.lang.System.out.println("    >> Version: " + System.version);
                java.lang.System.out.println("    >> Date: " + new java.util.Date());
            }
            else
            {
                java.lang.System.out.println("RMI Server [" + name + "] startup failed.");
                java.lang.System.out.println("    >> Cause: " + this.failure.getMessage());
                java.lang.System.out.println("    >> JVM: " + Runtime.version());
                java.lang.System.out.println("    >> Version: " + System.version);
                java.lang.System.out.println("    >> Date: " + new java.util.Date());
            }
        }
    }

    public static void main(String... args)
    {
        new RMIServer();
    }
}
