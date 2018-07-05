package org.mearvk.circuitry.rmi.system;

import java.lang.module.Configuration;

public class RMIStoreImpl extends RMIStoreAdmin
{
    public RMIStoreImpl()
    {
        super();
    }

    public RMIStoreImpl(RMI rmi)
    {
        super(rmi);
    }

    public RMIStoreImpl(RMI rmi, Configuration configuration)
    {
        super(rmi, configuration);
    }
}
