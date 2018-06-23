package org.mearvk.circuitry.rmi.system;

public class Hook
{
    public Object object = null;

    public Class _class = null;

    public String type = null;

    //

    public Hook(Class _class, String type)
    {
        this._class = _class;

        this.type = type;
    }

    public Hook(Object object, String type)
    {
        this.object = object;

        this.type = type;
    }
}
