package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;

public class FrameRegistry
{
    public Object object;

    public ArrayList<Frame> frames = new ArrayList();

    public FrameRegistry()
    {

    }

    public FrameRegistry push()
    {
        this.frames.add(new Frame());

        //

        return this;
    }

    public FrameRegistry register()
    {
        this.frames.add(new Frame());

        //

        return this;
    }
}
