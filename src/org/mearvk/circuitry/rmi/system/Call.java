package org.mearvk.circuitry.rmi.system;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Call
{
    public Method method;

    public String methodname;

    public Object object;

    public ArrayList<Object> args = new ArrayList<>();

    public ArrayList<StackTraceElement> stacks = new ArrayList<>();

    //

    public Call(Object object, StackTraceElement[] elements, Object... args)
    {
        this.object = object;

        this.stacks.addAll(Arrays.asList(elements));

        this.args.addAll(Arrays.asList(args));
    }
}
