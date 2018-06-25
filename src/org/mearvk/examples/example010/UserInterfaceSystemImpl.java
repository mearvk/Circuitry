package org.mearvk.examples.example010;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class UserInterfaceSystemImpl implements Serializable
{
    public JFrame jframe = null;

    public JSplitPane jsplitpane = null;

    public JTextPane top = null;

    public JTextPane bottom = null;

    public JPanel panel = null;

    public JButton commit = null;

    //

    public UserInterfaceSystemImpl()
    {
        this.jframe = new JFrame();

        this.jsplitpane = new JSplitPane();

        this.top = new JTextPane();

        this.bottom = new JTextPane();

        this.panel = new JPanel();

        this.commit = new JButton("Commit");

        //

        this.top.setPreferredSize(new Dimension(800, 400));

        this.top.requestFocus();

        this.bottom.setPreferredSize(new Dimension(800, 200));

        this.bottom.setEditable(false);

        //

        this.jsplitpane.setOrientation(JSplitPane.VERTICAL_SPLIT);

        this.jsplitpane.add(top, JSplitPane.TOP);

        this.jsplitpane.add(bottom, JSplitPane.BOTTOM);

        this.jsplitpane.setSize(800, 600);

        //

        this.jframe.add(this.jsplitpane);

        this.jframe.add(this.panel);

        this.panel.add(commit);

        //

        this._setSetters();
    }

    public void _setSetters()
    {
        this._setTitle();

        this._setSize();

        this._setLayout();
    }

    public void _setTitle()
    {
        this.jframe.setTitle("ThinClient");
    }

    public void _setSize()
    {
        this.jframe.setSize(800, 600);
    }

    public void _setLayout()
    {
        this.jframe.setLayout(new FlowLayout());
    }
}

