package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

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
        Call call = new Call(object, Thread.currentThread().getStackTrace());

        this.queued.add(call);

        this.post(call);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Call call)
    {
        this.queued.add(call);

        this.post(call);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object, Object... args)
    {
        Call call = new Call(object, Thread.currentThread().getStackTrace(), args);

        this.queued.add(call);

        this.post(call);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void register(Object object)
    {
        //this.queued.add(new Call(object));
    }

    @Resource(frame = Frame.METHOD_BASED)
    public Call pull(Object object, Method method, Class[] types, Object[] args)
    {
        Object reference = object;

        Call value = null;

        for (int i = 0; i < this.queued.size(); i++)
        {
            value = this.queued.get(i);

            if (value.object.equals(reference))
            {
                return value;
            }
        }

        return null;
    }

    @Resource
    public void post(Call call)
    {
        java.lang.System.out.println("RMI Call Registry receives [JVM " + call.jvm + "]: ");

        java.lang.System.out.println("  > Frame : " + call.toString());

        java.lang.System.out.println("  > Method : " + call.classname + " " + call.methodname);

        java.lang.System.out.println("  > Object : " + call.object);

        java.lang.System.out.println("  > Thread : " + call.threadname + " : " + call.thread);

        java.lang.System.out.println("  > Timestamp : " + call.date);

        java.lang.System.out.println("  > Bytecode : " + call.bytecodestring);

        java.lang.System.out.println("  > Stacktrace : " + call.stacktrace);
    }
}
