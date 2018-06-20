package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Frame
{
    public static final String CLASS_BASED = "CLASS";
    public static final String SYSTEM_BASED = "SYSTEM";
    public Date date = null;
    public String jvm = null;

    public Object object = null;

    //

    public StackTraceElement element = null;

    //

    public ArrayList<StackTraceElement> elements = null;
    public String os = null;
    public String system = null;
    public ArrayList<String> classnames = new ArrayList();
    public ArrayList<String> filenames = new ArrayList();
    public ArrayList<String> methodnames = new ArrayList();
    public ArrayList<String> modulenames = new ArrayList();
    public ArrayList<Integer> linenumbers = new ArrayList();

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

    public static final String METHOD_BASED = "METHOD";
    public ArrayList<String> classloadernames = new ArrayList();
    public ArrayList<Integer> hashcodes = new ArrayList();

    //

    public Frame()
    {
        this.elements.addAll(Arrays.asList(Thread.currentThread().getStackTrace()));
    }

    public Frame(Integer index)
    {
        this.elements.addAll(Arrays.asList(Thread.currentThread().getStackTrace()));
    }

    public Frame(ArrayList<StackTraceElement> elements)
    {
        this.elements = elements;

        //

        this.os = java.lang.System.getProperty("OS.NAME");

        this.jvm = java.lang.System.getProperty("JAVA.VERSION");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("SYSTEM.NAME");

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

        this.os = java.lang.System.getProperty("OS.NAME");

        this.jvm = java.lang.System.getProperty("JAVA.VERSION");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("SYSTEM.NAME");

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

        this.os = java.lang.System.getProperty("OS.NAME");

        this.jvm = java.lang.System.getProperty("JAVA.VERSION");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("SYSTEM.NAME");

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

        this.os = java.lang.System.getProperty("OS.NAME");

        this.jvm = java.lang.System.getProperty("JAVA.VERSION");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("SYSTEM.NAME");

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

        this.os = java.lang.System.getProperty("OS.NAME");

        this.jvm = java.lang.System.getProperty("JAVA.VERSION");

        this.date = new Date(java.lang.System.currentTimeMillis());

        this.system = java.lang.System.getProperty("SYSTEM.NAME");
    }
}
