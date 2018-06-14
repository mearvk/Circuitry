package org.mearvk.ancellaries;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class DefaultListener implements Remote
{
    public ArrayList<Event> events = new ArrayList<Event>();

    public ArrayList<DefaultListener> listeners = new ArrayList<DefaultListener>();

    public ArrayList<String> references = new ArrayList<String>();

    public Registry registry;

    //

    public DefaultListener()
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind("LINK", this);
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

    public void addEvent(Event event, String eventname)
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind(eventname, event);

            //

            //this.events.trimToSize();

            this.events.add(event);
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

    public void addEvent(Event event)
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind(this.getNextEventName(), event);

            //

            //this.events.trimToSize();

            this.events.add(event);
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

    public void addListener(DefaultListener listener, String listenername)
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind(listenername, listener);

            //

            //this.listeners.trimToSize();

            this.listeners.add(listener);
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

    public void addListener(DefaultListener listener)
    {
        try
        {
            this.registry = LocateRegistry.getRegistry("rmi");

            this.registry.bind(this.getNextListenerName(), listener);

            //

            //this.listeners.trimToSize();

            this.listeners.add(listener);
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

    protected String getNextListenerName()
    {
        return "Listener_" + String.format("%03d", this.listeners.size());
    }

    protected String getNextEventName()
    {
        return "Event_" + String.format("%03d", this.events.size());
    }
}
