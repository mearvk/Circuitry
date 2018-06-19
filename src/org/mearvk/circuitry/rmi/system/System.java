package org.mearvk.circuitry.rmi.system;

public class System
{
    public static RMI init = new RMI();

    public static RMI rmi = new RMI();

    public static RMI local = new RMI();

    public static RMI hooks = new RMI();

    public static RMI events = new RMI();

    public static RMI security = new RMI();

    public static RMI frames = new RMI();

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