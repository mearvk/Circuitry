package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.System;

import java.io.Serializable;

class Main
{
    public static void main(String... args)
    {
        ThinClient client000 = new ThinClient();

        ThinClient client001 = new ThinClient();

        ThinClient client002 = new ThinClient();

        ThinClient client003 = new ThinClient();
    }
}

public class ThinClient implements Serializable
{
    public UserInterface userinterface;

    public String string001 = "tame";

    public String string002 = "tame";

    public String string003 = "tame";

    public String string004 = "tame";

    public String string005 = "field";

    public String string006 = "tame";

    public String string007 = "tame";

    public String string008 = "dray";

    public String string009;

    public String string010;

    public String string011;

    public String string012;

    public String string013;

    public String string014;

    public String string015;

    @Resource(frame = Frame.METHOD_BASED)
    public ThinClient()
    {
        System.rmi.frame(this).run(this, null);
    }
}

class ThinClientImpl extends ThinClient implements Serializable
{
    public UserInterfaceImpl userinterfaceimpl;

    @Resource(frame = Frame.METHOD_BASED)
    public ThinClientImpl()
    {
        java.lang.System.out.println("ThinClientImpl");
    }
}

