package org.mearvk.circuitry.rmi.system;

import java.io.Serializable;

public class System implements Serializable
{
    public static RMI init = new RMI();

    public static RMI rmi = new RMI();

    public static RMI debug = new RMI();

    public static RMI local = new RMI();

    public static RMI hooks = new RMI();

    public static RMI events = new RMI();

    public static RMI security = new RMI();

    public static RMI frames = new RMI();

    public static RMI general = new RMI();

    public static RMI factory = new RMI();

    public static RMI registry = new RMI();

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