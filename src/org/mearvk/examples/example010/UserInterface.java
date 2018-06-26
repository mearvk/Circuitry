package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.Frame;
import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.System;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.Serializable;

public class UserInterface extends UserInterfaceImpl implements ActionListener, FocusListener, RMIModel, Serializable
{
    public UserInterface ref = this;

    public File initfile = null;

    //

    @Resource(init = "/ui/init", frame = Frame.METHOD_BASED)
    public UserInterface()
    {
        //System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    @Resource()
    public void setSetters()
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    @Resource()
    public void setTitle()
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    @Resource()
    public void setSize()
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    @Resource()
    public void setLayout()
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    @Resource()
    public void connect()
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    @Resource()
    public void show()
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        System.rmi.passthru(this, super.ref, RMI.SIMPLE_PASSTHRU);
    }
}
