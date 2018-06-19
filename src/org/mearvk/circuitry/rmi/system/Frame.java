package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;
import java.util.Arrays;

public class Frame
{
    public Object object = null;

    public StackTraceElement element = null;

    public ArrayList<StackTraceElement> elements = null;

    public String classname;

    public String filename;

    public String methodname;

    public String modulename;

    public String moduleversion;

    public Integer linenumber;

    public String classloadername;

    public Integer hashcode;

    //

    public Frame(Object object, StackTraceElement element)
    {
        this.object = object;

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
    }
}
