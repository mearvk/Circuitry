package org.mearvk.ancellaries;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class DefaultListener implements Remote, Serializable
{
    public ArrayList<Event> events = new ArrayList<Event>();

    public ArrayList<DefaultListener> listeners = new ArrayList<DefaultListener>();

    public ArrayList<String> references = new ArrayList<String>();

    //

    public Registry registry;

    //

    public EventResponder responder;

    //

    public DefaultListener()
    {
        try
        {
            this.registry = LocateRegistry.getRegistry();

            this.registry.bind(this.getNextListenerName(), this);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(System.DEFAULT_RMI_EXCEPTION);

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
            this.registry = LocateRegistry.getRegistry();

            this.registry.bind(eventname, event);

            //

            this.events.add(event);

            //

            this.responder.handleEvent(event);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(System.DEFAULT_RMI_EXCEPTION);

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
            this.registry = LocateRegistry.getRegistry();

            this.registry.bind(this.getNextEventName(), event);

            //

            this.events.add(event);

            //

            this.responder.handleEvent(event);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(System.DEFAULT_RMI_EXCEPTION);

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
            this.registry = LocateRegistry.getRegistry();

            this.registry.bind(listenername, listener);

            //

            this.listeners.add(listener);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(System.DEFAULT_RMI_EXCEPTION);

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
            this.registry = LocateRegistry.getRegistry();

            this.registry.bind(this.getNextListenerName(), listener);

            //

            this.listeners.add(listener);
        }
        catch (Exception exception)
        {
            try
            {
                ExceptionQueue queue;

                queue = (ExceptionQueue) this.registry.lookup(System.DEFAULT_RMI_EXCEPTION);

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

    public void setResponseHandler(EventResponder responder)
    {
        this.responder = responder;
    }
}
