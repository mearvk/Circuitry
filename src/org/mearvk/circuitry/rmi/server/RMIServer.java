package org.mearvk.circuitry.rmi.server;

import org.mearvk.circuitry.rmi.system.System;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;

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
            java.lang.System.out.println("RMI Server [" + name + "] loaded.");
            java.lang.System.out.println("    >> JVM: ");
            java.lang.System.out.println("    >> Version: ");
            java.lang.System.out.println("    >> Date: ");
        }
    }

    public static void main(String... args)
    {

    }
}
