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

    public static RMI factory = new RMI();

    public static RMI registry = new RMI();

    //

    public static FrameRegistry FREG = new FrameRegistry();

    public static CallRegistry CREG = new CallRegistry();

    public static HookRegistry HREG = new HookRegistry();

    public static EventRegistry EREG = new EventRegistry();

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