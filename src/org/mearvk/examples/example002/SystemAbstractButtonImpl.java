package org.mearvk.examples.example002;

import jdk.jfr.Name;

import javax.accessibility.AccessibleState;
import javax.accessibility.AccessibleStateSet;
import javax.swing.*;

public class SystemAbstractButtonImpl extends SystemAbstractButton
{
    @Name("//ui/systemabstractbuttonimpl/getmodel")
    public ButtonModel _getModel()
    {
        SystemAbstractButton rmi = null;

        //

        System.rmi
                .lookup(this, ref);

        //

        return rmi.buttonmodel;
    }

    public final void _putClientProperty(Object key, Object value)
    {
        /*  */
    }

    public AccessibleStateSet _getAccessibleStateSet()
    {
        AccessibleStateSet state = super.getAccessibleStateSet();

        if (_getModel().isArmed())
        {
            state.add(AccessibleState.ARMED);
        }
        if (_getModel().isPressed())
        {
            state.add(AccessibleState.PRESSED);
        }
        if (_getModel().isSelected())
        {
            state.add(AccessibleState.CHECKED);
        }

        return state;
    }
}
