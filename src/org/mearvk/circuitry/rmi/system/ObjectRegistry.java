package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

import java.util.ArrayList;

public class ObjectRegistry
{
    public static Integer index = 0;

    public Object object;

    public ArrayList<Object> objects = new ArrayList();

    //

    public ObjectRegistry()
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Class _class, String type)
    {
        this.objects.add(new Hook(_class, type));

        //

        System.registry.run(this, null, null, null, null);

        //

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object, String type)
    {
        this.objects.add(new Hook(object, type));

        //

        System.registry.run(this, null, null, null, null);

        //

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void register(Object object)
    {
        System.hooks.run(this, null, null, null, null);

        System.events.post(java.lang.System.out, object);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void pull(Object object)
    {
        //return object
    }
}
