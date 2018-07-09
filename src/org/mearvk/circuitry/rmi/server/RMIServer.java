package org.mearvk.circuitry.rmi.server;

public class RMIServer
{
    public RMIServer()
    {

    }

    public RMIServer(String name)
    {

    }

    public static void main(String... args)
    {
        try
        {
            Runtime.getRuntime().exec("rmiregistry");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
