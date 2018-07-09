package org.mearvk.circuitry.rmi.system.clients.thick;

import org.mearvk.circuitry.rmi.system.RMI;
import org.mearvk.circuitry.rmi.system.clients.thin.ThinClientAbstract;

import java.security.Key;

public abstract class ThickClient
{
    private Key key;

    private RMI rmi;

    private ThinClientAbstract thinclient;
}
