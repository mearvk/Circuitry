package org.mearvk.rmi;

import java.rmi.Remote;

public class RemoteWrapper implements Remote
{
    public Object object;

    public RemoteWrapper(Object object)
    {
        this.object = object;
    }
}
