package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

import java.util.ArrayList;

public class HookRegistry
{
    public static Integer index = 0;

    public Object object;

    public ArrayList<Hook> hooks = new ArrayList();

    //

    public HookRegistry()
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(String type)
    {
        System.events.post(java.lang.System.out, type);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Class _class, String type)
    {
        this.hooks.add(new Hook(_class, type));

        //

        System.hooks.run(this, null);

        //

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object, String type)
    {
        this.hooks.add(new Hook(object, type));

        //

        System.hooks.run(this, null);

        //

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void register(Object object)
    {
        System.hooks.run(this, null);

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void pull(Object object)
    {
        //return object
    }
}
