package org.mearvk.ancellaries;

import java.rmi.registry.LocateRegistry;

public class ExtensibleListener extends DefaultListener
{
    public void addSuperListener(DefaultListener superlistener)
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind(superlistener.getNextListenerName(), superlistener);

            //

            superlistener.listeners.add(this);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(java.lang.System.getProperty("//rmi/exceptions"));

                queue.treat(exception);
            }
            catch (Exception trim)
            {
                java.lang.System.err.println("DefaultListener > " + trim);
            }
        }
    }

    public void addSuperListener(DefaultListener superlistener, String name)
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind(name, superlistener);

            //

            superlistener.listeners.add(this);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(java.lang.System.getProperty("//rmi/exceptions"));

                queue.treat(exception);
            }
            catch (Exception trim)
            {
                java.lang.System.err.println("DefaultListener > " + trim);
            }
        }
    }
}
