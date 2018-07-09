package org.mearvk.circuitry.rmi.system;

import java.io.Serializable;

public class System implements Serializable
{
    public static RMI init = new RMI("init");

    public static RMI rmi = new RMI("rmi");

    public static RMI debug = new RMI("debug");

    public static RMI local = new RMI("local");

    public static RMI hooks = new RMI("hooks");

    public static RMI events = new RMI("events");

    public static RMI security = new RMI("security");

    public static RMI frames = new RMI("frames");

    public static RMI general = new RMI("general");

    public static RMI factory = new RMI("factory");

    public static RMI registry = new RMI("registry");

    public static RMI exceptions = new RMI("exceptions");

    //

    public static FrameRegistry frame_registry = new FrameRegistry();

    public static CallRegistry call_registry = new CallRegistry();

    public static HookRegistry hook_registry = new HookRegistry();

    public static EventRegistry event_registry = new EventRegistry();

    //

    public RMI hooks()
    {
        return local.hooks();
    }
}