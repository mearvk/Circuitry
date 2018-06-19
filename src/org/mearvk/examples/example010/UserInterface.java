package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.RMIModel;
import org.mearvk.circuitry.rmi.system.System;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;

public class UserInterface extends UserInterfaceImpl implements ActionListener, FocusListener, RMIModel
{
    public File initfile = null;

    //

    @Resource(init = "/ui/init", value = "liftable")
    public UserInterface()
    {
        System.rmi.frame().run(this, null);
    }

    @Resource()
    public void setSetters()
    {
        System.rmi.frame().run(this, null);
    }

    @Resource()
    public void setTitle()
    {
        System.rmi.frame().run(this, null);
    }

    @Resource()
    public void setSize()
    {
        System.rmi.frame().run(this, null);
    }

    @Resource()
    public void setLayout()
    {
        System.rmi.frame().run(this, null);
    }

    @Resource()
    public void connect()
    {
        System.rmi.frame().run(this, null);
    }

    @Resource()
    public void show()
    {
        System.rmi.frame().run(this, null);
    }

    //

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.rmi.frame().run(this, null);
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        System.rmi.frame().run(this, null);
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        System.rmi.frame().run(this, this);
    }
}
