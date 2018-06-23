package org.mearvk.circuitry.rmi.system;

import java.util.ArrayList;
import java.util.Date;

public class Event
{
    public Class _class;

    public String type;

    public Object object;

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
