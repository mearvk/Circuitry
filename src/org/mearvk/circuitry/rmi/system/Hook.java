package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;
import java.util.Date;

public class Hook
{
    public Object object = null;

    public Class _class = null;

    public String type = null;

    public EventFilter filter = null;

    //

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

    public ArrayList<String> classloadernames = new ArrayList();

    public ArrayList<Integer> hashcodes = new ArrayList();

    //

    public Hook(Object object, EventFilter filter)
    {
        this._class = _class;

        this.filter = filter;
    }

    public Hook(Class _class, EventFilter filter)
    {
        this._class = _class;

        this.filter = filter;
    }

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

    public Hook(Class _class)
    {
        this.object = object;

        this.type = type;
    }
}
