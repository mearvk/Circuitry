package org.mearvk.examples.example010;

import org.mearvk.ancellaries.annotations.Resource;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class UserInterfaceSystemImpl implements Serializable
{
    public UserInterfaceSystemImpl ref = this;

    public UserInterfaceImpl base = null;

    //

    public JFrame jframe = null;

    public JSplitPane jsplitpane = null;

    public JTextPane top = null;

    public JTextPane bottom = null;

    public JPanel jpanel = null;

    public JButton commit = null;

    //

    public UserInterfaceSystemImpl()
    {
        this.setSetters();
    }

    public UserInterfaceSystemImpl(UserInterfaceImpl userinterfaceimpl)
    {
        this.base = userinterfaceimpl;

        this.setSetters();
    }

    @Resource()
    public void setSetters()
    {

    }

    public void setTitle()
    {
        this.jframe.setTitle("ThinClient");
    }

    public void setSize()
    {
        this.jframe.setSize(800, 600);
    }

    public void setLayout()
    {
        this.jframe.setLayout(new FlowLayout());
    }
}

