package org.mearvk.circuitry.rmi.system;

public class FrameRegistryImpl extends FrameRegistry
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
