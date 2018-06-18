package org.mearvk.examples.example003;

import org.mearvk.ancellaries.BaseListener;
import org.mearvk.ancellaries.annotations.Resource;

import java.io.File;

interface RMIModel
{

}

/**
 * Add a senior graphing system above an already existing system
 */
public class Example003
{
    public Example003()
    {
        SystemObject tester = new SystemObject();

        SeniorSystem monitor = new SeniorSystem();

        //

        tester.getModel().frame("0x01").store();

        tester.getAttributes().frame("0x01").store();

        tester.getFeed().frame("0x01").store();

        tester.rmi.go();

        //

        System.rmi.lift(tester, monitor).rules("/lifter/rules").store();

        //

        tester.getModel().frame("0x02").store();

        tester.getAttributes().frame("0x02").store();

        tester.getFeed().frame("0x02").store();

        tester.rmi.go();
    }
}

@Resource(name = "/monitor001")
class SeniorSystem implements RMIModel
{
    BaseListener listener;
}

class SystemObject extends SystemObjectImpl
{
    public SystemObjectImpl impl = null;

    public RMI rmi;

    public RMI getModel()
    {
        return null;
    }

    public RMI getAttributes()
    {
        return null;
    }

    public RMI getFeed()
    {
        return null;
    }
}

class SystemObjectImpl implements RMIModel
{
    public Object _getModel()
    {
        return null;
    }

    public Object _getAttributes()
    {
        return null;
    }

    public Object _getFeed()
    {
        return null;
    }
}

class System
{
    public static RMI rmi;

    public static RMI local;

    public static RMI hooks;

    public static RMI events;

    public static RMI security;

    public String getNameAnnotationValue(StackTraceElement element)
    {
        return null;
    }

    public RMI hooks()
    {
        return local.hooks();
    }
}

class RMI
{
    public RMI init(String URI, Object initobject, File initfile)
    {
        //return value RMI list: add lookups for RMI to drop value in a list

        //implementation files must be loaded next to their cousins the stub files

        //methods need to list the annotation

        //global listener for system calls - store objects on startup etc

        //

        return null;
    }

    public RMI compile()
    {
        return null;
    }

    public RMI go()
    {
        return null;
    }

    public RMI rules(String URI)
    {
        return null;
    }

    public RMI rules(RMI endpoint)
    {
        return null;
    }

    public RMI lift(RMIModel object, RMIModel monitor)
    {
        return null;
    }

    public RMI fire()
    {
        return null;
    }

    public RMI desecuritize(RMI rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMI securitize(RMI rmi, Object reference)
    {
        return null; //we need this - now
    }

    public RMI lock()
    {
        return null;
    }

    public RMI unlock()
    {
        return null;
    }

    public RMI listeners()
    {
        return null;
    }

    public RMI requests()
    {
        return null;
    }

    public RMI fill()
    {
        return null;
    }

    public RMI hooks()
    {
        return null;
    }

    public RMI store()
    {
        return null;
    }

    public RMI store(String id)
    {
        return null;
    }

    public RMI store(RMIStore store)
    {
        return null;
    }

    public RMI store(RMIStore store, String id)
    {
        return null;
    }

    public RMI as(Object reference)
    {
        return null;
    }

    public RMI reference(Object reference)
    {
        return null;
    }

    public RMI reference(Object object, Object reference)
    {
        return null;
    }

    public RMI reference(String URI, Object reference)
    {
        return null;
    }

    public RMI ref()
    {
        return null;
    }

    public RMI ref(Object object, Object reference)
    {
        return null;
    }

    public RMI ref(String URI, Object reference)
    {
        return null;
    }

    public RMI lookup(Object object)
    {
        return null;
    }

    public RMI lookup(String URI)
    {
        return null;
    }

    /**
     * Regard stackelement in due course (system state, prior function calle, etc)
     *
     * @return
     */
    public RMI frame()
    {
        return null;
    }//lookup stackelement and find name annotation for actual call to stub class

    public RMI frame(String URI)
    {
        return null;
    }

    public RMI logic()
    {
        return null;
    }

    public RMI logic(String URI)
    {
        return null;
    }

    public RMI lookup(Object object, Object reference)
    {
        return null;
    }

    public RMI lookup(String URI, Object reference)
    {
        return null;
    }

    public RMI run(Object object, Object reference)
    {
        return null;
    }

    public RMI run(String URI, Object reference)
    {
        return null;
    }

    public RMI cast(Object object)
    {
        return null;
    }

    public RMI cast(String URI)
    {
        return null;
    }
}

class RMIStore
{

}

class RMIInstance
{

}