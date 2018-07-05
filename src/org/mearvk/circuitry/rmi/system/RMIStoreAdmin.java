package org.mearvk.circuitry.rmi.system;

import java.lang.module.Configuration;

public class RMIStoreAdmin
{
    public Configuration configuration;

    public RMI rmi;

    //

    public RMIStoreAdmin()
    {
        super();
    }

    public RMIStoreAdmin(RMI rmi)
    {
        this.rmi = rmi;
    }

    public RMIStoreAdmin(RMI rmi, Configuration configuration)
    {
        this.rmi = rmi;

        this.configuration = configuration;
    }
}
