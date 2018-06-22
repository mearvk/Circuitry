package org.mearvk.circuitry.rmi.system;

import java.io.Serializable;

public class System implements Serializable
{
    public static RMI init = new RMI();

    public static RMI rmi = new RMI();

    public static RMI local = new RMI();

    public static RMI hooks = new RMI();

    public static RMI events = new RMI();

    public static RMI security = new RMI();

    public static RMI frames = new RMI();

    //

    public static FrameRegistry frame_registry = new FrameRegistry();

    public static FrameRegistry call_registry = new FrameRegistry();

    public static EventRegistry event_registry = new EventRegistry();

    //

    public String getNameAnnotationValue(StackTraceElement element)
    {
        return null;
    }

    public RMI hooks()
    {
        return local.hooks();
    }
}