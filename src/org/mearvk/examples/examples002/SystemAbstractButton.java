package org.mearvk.examples.examples002;

import org.mearvk.ancellaries.annotations.Resource;

import javax.accessibility.AccessibleStateSet;
import javax.swing.*;
import java.io.File;

@Resource(rmi = {"/rmi/framelogic"}, rules = "/rules/framebased")
public class SystemAbstractButton
{
    @Resource()
    public SystemAbstractButton ref = this;

    @Resource()
    public SystemAbstractButtonImpl impl = null;

    @Resource()
    public ButtonModel buttonmodel;

    @Resource()
    public File initfile = null;

    //

    @Resource(rmi = {"/rmi/framelogic"}, rules = "/rules/context")
    public SystemAbstractButton()
    {
        System.rmi
                .init("//ui/init/", this, this.initfile);
    }

    @Resource(rmi = {"/rmi/framelogic"}, rules = "/rules/framebased")
    public RMI getModel()
    {
        ButtonModel ref = null;

        System.rmi
                .run(this, ref)
                .frame()
                .store();

        return System.rmi;
    }

    @Resource(rmi = {"/rmi/framelogic"}, rules = "/rules/framebased")
    public final void putClientProperty(Object key, Object value)
    {
        //secure frame
        System.hooks
                .frame()
                .securitize(System.rmi, this)
                .lock();

        //load provisional requests
        System.hooks
                .frame()
                .requests()
                .fill();

        //load provisional listeners
        System.hooks
                .frame()
                .listeners()
                .fill();

        //request for backing object
        System.rmi
                .run(this, ref)
                .frame()
                .store();

        //notify listeners
        System.events
                .listeners()
                .fire();

        //notify listeners : security
        System.security
                .listeners()
                .fire();

        //release security locks
        System.hooks
                .frame()
                .securitize(System.rmi, this)
                .unlock();


        return;
    }

    @Resource(rmi = {"/rmi/framelogic"}, rules = "/rules/framebased")
    public AccessibleStateSet getAccessibleStateSet()
    {
        AccessibleStateSet stateSet = null;

        System.rmi
                .run(this, ref)
                .frame()
                .store();

        return stateSet;
    }
}

class Main
{
    public static void main(String... args)
    {
        SystemAbstractButton button = new SystemAbstractButton();

        //

        ButtonModel buttonmodel = null;

        //

        buttonmodel = button.impl._getModel();

        //

        buttonmodel = (ButtonModel) button.getModel().frame("0x0001").ref();    //get buttonmodel, frame the call with an explicit context, equate the result locally

        button.getModel().frame("0x0001").as(buttonmodel);                      //get buttonmodel, frame the call with an explicit context, store the result locally

        button.getModel().frame("0x0001").store();                              //get buttonmodel, frame the call with an explicit context, store the result implicity

        button.getModel().frame("0x0001").store("0x0001");                      //get buttonmodel, frame the call with an explicit context, store the result explicitly

        //

        button.impl._putClientProperty(null, null);

        //4 basic items:

        //do a transactional set

        //do a procedural or functional set

        //do a setter/getter

        //do a return value


        //button.setModel();
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

/**
 * Keep the procedural code superclean and the extensibility of the system protected (also add JNDI later)
 */
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

