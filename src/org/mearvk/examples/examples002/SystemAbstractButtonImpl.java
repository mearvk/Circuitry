package org.mearvk.examples.examples002;

import jdk.jfr.Name;

import javax.swing.*;

public class SystemAbstractButtonImpl
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
}
