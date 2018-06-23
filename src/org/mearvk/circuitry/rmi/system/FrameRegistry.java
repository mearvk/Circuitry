package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.annotations.Resource;

import java.io.Serializable;
import java.util.ArrayList;

public class FrameRegistry implements Serializable
{
    public Object object;

    public static Integer index = 0;

    public ArrayList<Frame> frames = new ArrayList();

    //

    public FrameRegistry()
    {

    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Object object)
    {
        this.post(new Frame(object));
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void push(Frame frame)
    {
        this.post(frame);
    }

    @Resource(frame = Frame.METHOD_BASED)
    public void pull(Object object)
    {
        //return object
    }

    @Resource
    public void post(Frame frame)
    {
        java.lang.System.out.println("RMI Frame Registry receives [JVM " + frame.jvm + "]: ");

        java.lang.System.out.println("  > Frame : " + frame.toString());

        java.lang.System.out.println("  > Method : " + frame.classname + " " + frame.methodname);

        java.lang.System.out.println("  > Object : " + frame.object);

        java.lang.System.out.println("  > Thread : " + frame.threadname);

        java.lang.System.out.println("  > Timestamp : " + frame.date);

        java.lang.System.out.println("  > Bytecode : " + frame.bytecodestring);

        java.lang.System.out.println("  > Stacktrace : " + frame.stacktrace);
    }
}
