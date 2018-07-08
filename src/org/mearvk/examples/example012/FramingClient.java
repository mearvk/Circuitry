package org.mearvk.examples.example012;

import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.framing.ForkProcess;
import org.mearvk.circuitry.rmi.system.framing.ProcessBank;
import org.mearvk.circuitry.rmi.system.framing.ProcessBlock;
import org.mearvk.circuitry.rmi.system.framing.TargetProcess;
import org.mearvk.circuitry.rmi.system.thin.ThinClient;

import java.io.PrintStream;

public class FramingClient extends ThinClient
{
    public void compile(String URI)
    {

    }

    public void getBankProcess(String URI)
    {

    }

    public void getTargetProcess(String URI)
    {

    }

    public void setNamedMonitor(String name, ProcessBlock block, Integer state)
    {

    }

    public void setNamedProcess(String name, ProcessBlock block, TargetProcess target, ProcessBank bank, Integer state)
    {

    }

    public void setNamedFork(String name, ProcessBlock block, TargetProcess target, ProcessBank bank, ForkProcess fork, Integer state)
    {

    }

    public void setProcessBlock(String name, ProcessBlock block)
    {

    }

    @Resource
    public void setStdOut(PrintStream out)
    {

    }
}


class ProcessMonitor
{

}