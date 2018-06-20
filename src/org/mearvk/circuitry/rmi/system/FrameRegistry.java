package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

import java.util.ArrayList;

public class FrameRegistry
{
    public Object object;

    public static Integer index = 0;

    public ArrayList<Frame> frames = new ArrayList();

    public FrameRegistry()
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object)
    {
        System.frames.frame(this).run(this, null);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void register(Object object)
    {
        System.frames.frame(this).run(this, null);
    }
}
