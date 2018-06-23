package org.mearvk.circuitry.rmi.system;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Frame implements Serializable
{
    public static final String METHOD_BASED = "CLASS";

    public static final String CLASS_BASED = "CLASS";

    public static final String SYSTEM_BASED = "SYSTEM";

    public Object object = null;

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

    public String classname;

    public String filename;

    public String methodname;

    public String modulename;

    public String moduleversion;

    public Integer linenumber;

    public String classloadername;

    public Integer hashcode;

    //

    public ArrayList<String> classloadernames = new ArrayList();

    public ArrayList<Integer> hashcodes = new ArrayList();

    //

    public Frame(Object object, Object... args)
    {
        this.elements.addAll(Arrays.asList(Thread.currentThread().getStackTrace()));

        //

        this.object = object;

        this.parameters.addAll(Arrays.asList(args));

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(4).getMethodName();

        this.classname = this.elements.get(4).getClassName();

        this.stacktrace();

        this.bytecode();
    }

    public Frame()
    {
        this.elements.addAll(Arrays.asList(Thread.currentThread().getStackTrace()));

        //

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(4).getMethodName();

        this.classname = this.elements.get(4).getClassName();

        this.stacktrace();

        this.bytecode();
    }

    public Frame(Integer index)
    {
        this.elements.addAll(Arrays.asList(Thread.currentThread().getStackTrace()));
    }

    public Frame(ArrayList<StackTraceElement> elements)
    {
        this.elements = elements;

        //

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(0).getMethodName();

        this.classname = this.elements.get(0).getClassName();

        this.stacktrace();

        this.bytecode();

        //

        for (int i = 0; i < elements.size(); i++)
        {
            this.classnames.add(this.elements.get(i).getClassName());

            this.filenames.add(this.elements.get(i).getFileName());

            this.methodnames.add(this.elements.get(i).getMethodName());

            this.modulenames.add(this.elements.get(i).getModuleName());

            this.linenumbers.add(this.elements.get(i).getLineNumber());

            this.classloadernames.add(this.elements.get(i).getClassLoaderName());

            this.hashcodes.add(this.elements.get(i).hashCode());
        }
    }

    public Frame(StackTraceElement[] elements)
    {
        this.elements.addAll(Arrays.asList(elements));

        //

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(0).getMethodName();

        this.classname = this.elements.get(0).getClassName();

        this.stacktrace();

        this.bytecode();

        //

        for (int i = 0; i < elements.length; i++)
        {
            this.classnames.add(this.elements.get(i).getClassName());

            this.filenames.add(this.elements.get(i).getFileName());

            this.methodnames.add(this.elements.get(i).getMethodName());

            this.modulenames.add(this.elements.get(i).getModuleName());

            this.linenumbers.add(this.elements.get(i).getLineNumber());

            this.classloadernames.add(this.elements.get(i).getClassLoaderName());

            this.hashcodes.add(this.elements.get(i).hashCode());
        }
    }

    public Frame(StackTraceElement element)
    {
        this.element = element;

        //

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(0).getMethodName();

        this.classname = this.elements.get(0).getClassName();

        this.stacktrace();

        this.bytecode();

        //

        this.classname = this.element.getClassName();

        this.filename = this.element.getFileName();

        this.methodname = this.element.getMethodName();

        this.modulename = this.element.getModuleName();

        this.moduleversion = this.element.getModuleVersion();

        this.linenumber = this.element.getLineNumber();

        this.classloadername = this.element.getClassLoaderName();

        this.hashcode = this.element.hashCode();
    }

    public Frame(Object object, StackTraceElement element)
    {
        this.object = object;

        //

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(0).getMethodName();

        this.classname = this.elements.get(0).getClassName();

        this.stacktrace();

        this.bytecode();

        //

        this.element = element;

        this.classname = this.element.getClassName();

        this.filename = this.element.getFileName();

        this.methodname = this.element.getMethodName();

        this.modulename = this.element.getModuleName();

        this.moduleversion = this.element.getModuleVersion();

        this.linenumber = this.element.getLineNumber();

        this.classloadername = this.element.getClassLoaderName();

        this.hashcode = this.element.hashCode();
    }

    public Frame(Object object, StackTraceElement[] elements)
    {
        this.elements.addAll(Arrays.asList(elements));

        //

        this.os = java.lang.System.getProperty("os.name");

        this.jvm = java.lang.System.getProperty("java.version");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("system.name");

        this.methodname = this.elements.get(0).getMethodName();

        this.classname = this.elements.get(0).getClassName();

        this.stacktrace();

        this.bytecode();
    }

    //

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
