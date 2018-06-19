package org.mearvk.circuitry.rmi.system;

public class System
{
    public static RMI init;

    public static RMI rmi;

    public static RMI local;

    public static RMI hooks;

    public static RMI events;

    public static RMI security;

    public static RMI frames;

    //

    public static FrameRegistry frameregistry = new FrameRegistry();

    public static EventRegistry eventregistry = new EventRegistry();

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