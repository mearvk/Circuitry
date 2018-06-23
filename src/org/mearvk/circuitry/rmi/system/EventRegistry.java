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
        this.post(event);
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

    @Resource
    public void post(Event event)
    {
        java.lang.System.out.println("RMI Event Registry receives [JVM " + event.jvm + "]: ");

        java.lang.System.out.println("  > Frame : " + event.toString());

        java.lang.System.out.println("  > Method : " + event.classname + " " + event.methodname);

        java.lang.System.out.println("  > Object : " + event.object);

        java.lang.System.out.println("  > Thread : " + event.threadname);

        java.lang.System.out.println("  > Timestamp : " + event.date);

        java.lang.System.out.println("  > Bytecode : " + event.bytecodestring);

        java.lang.System.out.println("  > Stacktrace : " + event.stacktrace);
    }
}
