package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class EventRegistry
{
    public Object object;

    public ArrayList<SystemEvent> events = new ArrayList();

    public EventRegistry()
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Event event)
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object)
    {

    }

    @Resource
    public void push(Object object, String type)
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object, Object... args)
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void register(Object object)
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public Call pull(Object object, Method method, Class[] types, Object[] args)
    {
        return null;
    }
}
