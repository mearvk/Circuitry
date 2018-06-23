package org.mearvk.circuitry.rmi.system.interfaces;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Call;
import org.mearvk.circuitry.rmi.system.Frame;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class CallRegistry
{
    public static Integer index = 0;

    public Object object;

    public ArrayList<Call> queued = new ArrayList();

    public ArrayList<Call> completed = new ArrayList();

    //

    public CallRegistry()
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object)
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
