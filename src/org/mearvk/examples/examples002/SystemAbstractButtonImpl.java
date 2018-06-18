package org.mearvk.examples.examples002;

import jdk.jfr.Name;

import javax.swing.*;

public class SystemAbstractButtonImpl extends SystemAbstractButton
{
    @Name("//ui/systemabstractbuttonimpl/getmodel")
    public ButtonModel getModel()
    {
        SystemAbstractButton rmi = null;

        //

        System.rmi
                .lookup(this, ref);

        //

        return rmi.buttonmodel;
    }

    public final void putClientProperty(Object key, Object value)
    {
        /*
        Hashtable t = getClientProperties();

        Object old = t.get(key);
        if (value != null)
            t.put(key, value);
         else
           t.remove(key);


         if (old != null || value != null)
               firePropertyChange(key.toString(), old, value);

        */
    }
}
