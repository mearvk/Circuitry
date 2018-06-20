package org.mearvk.circuitry.rmi.system;

import java.io.Serializable;

public class FrameRegistryImpl extends FrameRegistry implements Serializable
{
    public FrameRegistryImpl _push(Object object)
    {
        this.frames.add(new Frame());

        return this;
    }

    public FrameRegistryImpl _register(Object object)
    {
        this.frames.add(new Frame());

        return this;
    }
}
