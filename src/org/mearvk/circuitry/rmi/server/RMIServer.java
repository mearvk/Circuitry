package org.mearvk.circuitry.rmi.server;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.System;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;

@Resource(requires = "//pre/boards/exceptions")
public class RMIServer implements Remote
{
    public RMIServer()
    {
        this("//server");
    }

    public RMIServer(String name)
    {
        Process process = null;

        try
        {
            process = Runtime.getRuntime().exec("rmiregistry");

            Naming.bind(name, this);
        }
        catch (AlreadyBoundException abe)
        {
            System.rmi.post("//pre/boards/exceptions", abe.getMessage());
        }
        catch (IOException ioe)
        {
            System.rmi.post("//pre/boards/exceptions", ioe.getMessage());
        }
        finally
        {
            if (process != null)
            {
                java.lang.System.out.println("RMI Server [" + name + "] startup completed.");
                java.lang.System.out.println("    >> JVM: ");
                java.lang.System.out.println("    >> Version: TBI");
                java.lang.System.out.println("    >> Date: " + new java.util.Date());
            } else
            {
                java.lang.System.out.println("RMI Server [" + name + "] startup failed.");
                java.lang.System.out.println("    >> JVM: " + Runtime.version());
                java.lang.System.out.println("    >> Version: TBI");
                java.lang.System.out.println("    >> Date: " + new java.util.Date());
            }
        }
    }

    public static void main(String... args)
    {

    }
}
