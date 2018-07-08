package org.mearvk.circuitry.rmi.system.thin;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;
import org.mearvk.circuitry.rmi.system.framing.ProcessBank;
import org.mearvk.circuitry.rmi.system.framing.ProcessBlock;
import org.mearvk.circuitry.rmi.system.framing.TargetProcess;
import org.mearvk.examples.example012.FramingClient;

import java.net.Socket;

public class ThinClient extends ThinClientImpl
{
    public ThinClient()
    {
        System.rmi.securitize(rmi, this); //encrypt object in memory, lock object calls, install encapsulators, validate before allowing method calls

        //System.rmi.filter(new ObjectIntegrityEvent()).passthru();
    }

    //

    public static void main(String... args)
    {
        FramingClient framingclient = new FramingClient();

        //

        System.rmi
                .lookup("//systems/logos/001")
                .synchronize(framingclient)
                .go();

        //

        framingclient.setStdOut(java.lang.System.out);

        //

        framingclient.setNamedProcess("$", new ProcessBlock("$"), new TargetProcess("//framing/lists{process}/a"), new ProcessBank("//banks/001"), ProcessBlock.PRECALL);

        framingclient.setNamedProcess("$", new ProcessBlock("$"), new TargetProcess("//framing/lists{process}/b"), new ProcessBank("//banks/001"), ProcessBlock.POSTCALL);

        //

        framingclient.setNamedMonitor("$", new ProcessBlock("$"), ProcessBlock.ONCALL | ProcessBlock.PRECALL);

        //

        framingclient.compile("//output/framing/outputs");
    }

    //

    @Override
    public void setVersion(int version)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setVersion: ["+version+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setSource(String source)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setSource: ["+source+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setRMI(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setRMI: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void setUI(ThinUI thinui)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "setUI: ["+thinui+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+null+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void connect(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "connect: ["+socket+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register()
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+null+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(RMI rmi)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: ["+rmi+"]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void register(Socket socket)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "register: [" + socket + "]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void addMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "addMember: [" + _class + "]");

        System.rmi.desecuritize(rmi, this);
    }

    @Override
    public void removeMember(Class _class, String name)
    {
        System.rmi.securitize(rmi, this);

        System.rmi.passthru();

        System.debug.post(java.lang.System.out, "removeMember: ["+_class+"]");

        System.rmi.desecuritize(rmi, this);
    }
}
