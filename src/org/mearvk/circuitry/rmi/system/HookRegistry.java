package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

import java.util.ArrayList;

public class HookRegistry extends HookRegistryImpl
{
    public HookRegistry ref = null;

    public static Integer index = 0;

    public Object object;

    public ArrayList<Hook> hooks = new ArrayList();

    //

    public HookRegistry()
    {
        return;
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Hook hook)
    {
        //Hook hook = null;

        //

        System.rmi.passthru(this, super.ref, hook);

        System.events.post(java.lang.System.out, "TODO");
    }

    @Resource()
    public void push(Object object, Class _class)
    {
        Hook hook = null;

        //

        System.rmi.passthru(this, super.ref, hook);

        System.events.post(java.lang.System.out, "TODO");
    }

    @Resource()
    public void push(Class _class)
    {
        Hook hook = null;

        hook = new Hook(_class);

        //

        System.rmi.passthru(this, super.ref, hook);

        System.events.post(java.lang.System.out, "TODO");
    }

    @Resource()
    public void push(Object object, EventFilter filter)
    {
        Hook hook = null;

        hook = new Hook(object, filter);

        //

        System.rmi.passthru(this, super.ref, hook);

        System.events.post(java.lang.System.out, "TODO");
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Class _class, String type)
    {
        Hook hook = null;

        hook = new Hook(_class, type);

        //

        System.rmi.passthru(this, super.ref, hook);

        System.events.post(java.lang.System.out, "TODO");
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object, String type)
    {
        Hook hook = null;

        hook = new Hook(object, type);

        //

        System.rmi.passthru(this, super.ref, hook);

        System.events.post(java.lang.System.out, "TODO");
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void register(Object object)
    {
        Hook hook = null;

        //

        System.hooks.run(this, null, null, null);

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void pull(Object object)
    {
        //return object
    }

    @Resource
    public void post(Hook hook)
    {
        java.lang.System.out.println("RMI Hook Registry receives [JVM " + hook.jvm + "]: ");

        java.lang.System.out.println("  > Frame : " + hook.toString());

        java.lang.System.out.println("  > Method : " + hook.classname + " " + hook.methodname);

        java.lang.System.out.println("  > Object : " + hook.object);

        java.lang.System.out.println("  > Thread : " + hook.threadname);

        java.lang.System.out.println("  > Timestamp : " + hook.date);

        java.lang.System.out.println("  > Bytecode : " + hook.bytecodestring);

        java.lang.System.out.println("  > Stacktrace : " + hook.stacktrace);
    }
}
