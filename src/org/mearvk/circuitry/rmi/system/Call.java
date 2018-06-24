package org.mearvk.circuitry.rmi.system;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Call
{
    public Method method;

    public Object object;

    public ArrayList<Object> args = new ArrayList<>();

    public ArrayList<StackTraceElement> stacks = new ArrayList<>();

    public static final String METHOD_BASED = "METHOD";

    public static final String CLASS_BASED = "CLASS";

    public static final String SYSTEM_BASED = "SYSTEM";

    //

    public Date date = null;

    public String jvm = null;

    public String os = null;

    public String system = "";

    public String stacktrace = "";

    public String bytecodestring = "";

    public byte[] bytecode = null;

    //

    public StackTraceElement element = null;

    //

    public ArrayList<StackTraceElement> elements = new ArrayList<StackTraceElement>();

    public ArrayList<String> classnames = new ArrayList();

    public ArrayList<String> filenames = new ArrayList();

    public ArrayList<String> methodnames = new ArrayList();

    public ArrayList<String> modulenames = new ArrayList();

    public ArrayList<Integer> linenumbers = new ArrayList();

    public ArrayList<Object> parameters = new ArrayList();

    //

    public String threadname;

    public String classname;

    public String filename;

    public String methodname;

    public String modulename;

    public String moduleversion;

    public Integer linenumber;

    public String classloadername;

    public Integer hashcode;

    public Thread thread;

    //

    public Call(Object object, Object reference, StackTraceElement[] elements, Object... args)
    {
        Thread currentthread = this.thread = Thread.currentThread();

        //

        this.elements.addAll(Arrays.asList(currentthread.getStackTrace()));

        //

        this.object = object;

        this.parameters.addAll(Arrays.asList(args));

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(4).getMethodName();

        this.classname = this.elements.get(4).getClassName();

        this.threadname = currentthread.getName();

        this.stacktrace();

        this.bytecode();
    }

    public Call(Object object, Object reference, Object... args)
    {
        Thread currentthread = this.thread = Thread.currentThread();

        //

        this.elements.addAll(Arrays.asList(currentthread.getStackTrace()));

        //

        this.object = object;

        this.parameters.addAll(Arrays.asList(args));

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(4).getMethodName();

        this.classname = this.elements.get(4).getClassName();

        this.threadname = currentthread.getName();

        this.stacktrace();

        this.bytecode();
    }

    public Call(Object object, StackTraceElement[] elements, Object... args)
    {
        this.object = object;

        this.stacks.addAll(Arrays.asList(elements));

        this.args.addAll(Arrays.asList(args));
    }

    private void stacktrace()
    {
        String[] temp = null;

        temp = this.elements.toString().split(",");

        for (int i = 0; i < temp.length; i++)
        {
            if (temp[i] == null) continue;

            this.stacktrace += "\t" + temp[i] + "\n";
        }
    }

    private void bytecode()
    {
        try
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ObjectOutputStream oos = new ObjectOutputStream(baos);

            //

            oos.writeObject(this.object);

            oos.flush();

            oos.close();

            //

            this.bytecodestring = Arrays.toString(baos.toByteArray());

            this.bytecode = baos.toByteArray();

            //

            //baos.flush();

            //baos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
