package org.mearvk.circuitry.rmi.system;

public class Event
{
    public Class _class;

    public String type;

    public Object object;

    public Event(Class _class, String type)
    {
        this._class = _class;

        this.type = type;
    }

    public Event(Object object, String type)
    {
        this.object = object;

        this.type = type;
    }
}
