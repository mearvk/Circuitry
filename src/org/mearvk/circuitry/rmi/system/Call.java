package org.mearvk.circuitry.rmi.system;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Call
{
    public Method method;

    public String methodname;

    public ArrayList<Object> args = new ArrayList<>();

    public ArrayList<StackTraceElement[]> stacks = new ArrayList<>();

    //

    public Call(Object object, StackTraceElement[] elements, Object... args)
    {

    }

    /*
    public Call(Object object, StackTraceElement[] elements, Object...args)
    {

    }
    */
}
