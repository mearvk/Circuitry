package org.mearvk.ancellaries;

import org.mearvk.ancellaries.ExceptionRegister;
import org.mearvk.ancellaries.SignalRegister;

import java.util.concurrent.locks.Lock;

public abstract class SystemComponent
{
    public BusLogic in;

    public BusLogic out;

    public SignalRegister signalregister;

    public ExceptionRegister exceptionregister;

    public System system;

    public SystemComponent target;

    public SystemComponent deliverable;

    public Lock latchlock;

    public Lock threadlock;

    public abstract void latch() throws Exception;

    public abstract void unlatch() throws Exception;

    public abstract void ready() throws Exception;
}
