package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.System;

import javax.swing.*;
import java.io.Serializable;

public class UserInterfaceImpl extends UserInterfaceSystemImpl implements Serializable
{
    public UserInterfaceImpl ref = this;
    public UserInterface base = null;

    //

    @Resource()
    public UserInterfaceImpl()
    {
        System.rmi.create(JFrame.class, this.jframe);

        System.rmi.create(JSplitPane.class, this.jsplitpane);

        System.rmi.create(JTextPane.class, this.top);

        System.rmi.create(JTextPane.class, this.bottom);

        System.rmi.create(JPanel.class, this.jpanel);

        System.rmi.create(JButton.class, this.commit);

        //

        this.setSetters();

        this.setArchitecture();
    }

    @Resource()
    public UserInterfaceImpl(UserInterface userinterface)
    {
        this.base = userinterface;

        //

        System.rmi.create(JFrame.class, this.jframe);

        System.rmi.create(JSplitPane.class, this.jsplitpane);

        System.rmi.create(JTextPane.class, this.top);

        System.rmi.create(JTextPane.class, this.bottom);

        System.rmi.create(JPanel.class, this.jpanel);

        System.rmi.create(JButton.class, this.commit);

        //

        this.setSetters();

        this.setArchitecture();
    }

    @Resource()
    public void setArchitecture()
    {
        return;
    }

    @Resource()
    public void connect()
    {
        System.rmi.passthru(null);
    }

    @Resource()
    public void setSetters()
    {
        System.rmi.passthru(null);
    }

    @Resource()
    public void setTitle()
    {
        System.rmi.passthru(null);
    }

    @Resource()
    public void setSize()
    {
        System.rmi.passthru(null);
    }

    @Resource()
    public void setLayout()
    {
        System.rmi.passthru(null);
    }

    @Resource()
    public void show()
    {
        System.rmi.passthru(null);
    }
}

