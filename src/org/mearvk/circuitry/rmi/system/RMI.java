package org.mearvk.circuitry.rmi.system;

import org.mearvk.ancellaries.SystemComponent;
import org.mearvk.ancellaries.annotations.Resource;
import org.mearvk.circuitry.rmi.system.boards.SystemBoard;
import org.mearvk.circuitry.rmi.system.call.CallClient;
import org.mearvk.circuitry.rmi.system.clients.thin.ThinClient;
import org.mearvk.circuitry.rmi.system.interfaces.RMIModel;
import org.mearvk.circuitry.rmi.system.parameterization.Parameter;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.lang.model.type.NullType;
import java.io.*;
import java.lang.reflect.Method;
import java.rmi.Naming;
import java.rmi.Remote;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

public class RMI extends RMIImpl implements Serializable, Remote
{
    public RMIStore store = new RMIStore();

    //

    public RMI ref = this;

    public RMIImpl impl = super.ref;

    //

    @Resource(tie = "super")
    public RMI(String name)
    {
        try
        {
            Naming.bind("rmi/" + name, this);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //

    @Resource(tie = "super")
    public RMI compile(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI compile()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String message, Object object, Thread thread, StackTraceElement[] elements)
    {
        System.rmi.post(java.lang.System.out, message);

        store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, String message)
    {
        System.rmi.store(this.store, "public RMI post()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), message);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String message, Object object, Thread thread, StackTraceElement[] elements, Object... args)
    {
        store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI compile(Parameter parameter, StackTraceElement[] elements)
    {
        System.rmi.store(this.store, "public RMI compile()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI create(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI create()", parameter.getObject(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getObject(), parameter.getClass(), ref);

        return this;
    }

    @Resource(tie = "super")
    public RMI create(Parameter parameter, ThinClient thinclient)
    {
        System.rmi.store(this.store, "public RMI create()", parameter.getObject(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getObject(), parameter.getClass(), ref);

        return this;
    }

    @Resource(tie = "super")
    public RMI create(Parameter parameter, CallClient callclient)
    {
        System.rmi.store(this.store, "public RMI create()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getClass(), ref);

        return this;
    }

    @Resource(tie = "super")
    public RMI decrypt(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI decrypt(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ", Key " + parameter.getKey() + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference(), parameter.getKey());


        return this;
    }

    @Resource()
    public RMI deencapsulate(Parameter parameter)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI desecuritize(Parameter parameter, Key key)
    {
        System.rmi.store(this.store, "public RMI desecuritize(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ", Key " + key + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference(), key);

        //

        System.rmi.decrypt(parameter, key);

        System.rmi.deencapsulate(parameter, key);

        System.rmi.desynchronize(parameter, key);

        System.rmi.devalidate(parameter, key);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI decrypt(Parameter parameter, Key key)
    {
        System.rmi.store(this.store, "public RMI decrypt(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ", Key " + parameter.getKey() + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference(), parameter.getKey());


        return this;
    }

    @Resource()
    public RMI deencapsulate(Parameter parameter, Key key)
    {
        return this;
    }

    @Resource()
    public RMI desynchronize(Parameter parameter, Key key)
    {
        return this;
    }

    @Resource()
    public RMI devalidate(Parameter parameter, Key key)
    {
        return this;
    }

    //

    @Resource(tie = "super")
    public RMI desecuritize(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI desecuritize(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference());

        //

        System.rmi.encrypt(parameter, null);

        System.rmi.encapsulate(parameter, null);

        System.rmi.synchronize(parameter, null);

        System.rmi.validate(parameter, null);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI encrypt(Parameter parameter, Key key)
    {
        System.rmi.store(this.store, "public RMI encrypt(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ", Key " + key + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference(), key);

        //

        Remote object = null;

        object = (Remote) this.store.recall(null, null, null, null, null);

        //

        if (object == null)
        {
            //not actually in memory yet
        }
        else
        {
            //in memory go ahead and ecnrypt it and put it up
        }

        return this;
    }

    //

    @Resource()
    public RMI encapsulate(Parameter parameter, Key key)
    {
        return this;
    }

    //

    @Resource()
    public RMI synchronize(Parameter parameter, Key key)
    {
        return this;
    }

    @Resource()
    public RMI validate(Parameter parameter, Key key)
    {
        return this;
    }

    @Resource()
    public RMI desynchronize(Parameter parameter)
    {
        return this;
    }

    //

    @Resource()
    public RMI devalidate(Parameter parameter)
    {
        return this;
    }

    //

    @Resource(tie = "super")
    public RMI filter(EventFilter filter)
    {
        System.rmi.store(this.store, "public RMI filter()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), filter);

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(Event event)
    {
        System.rmi.store(this.store, "public RMI filter()", event, Thread.currentThread(), Thread.currentThread().getStackTrace(), event);

        return this;
    }

    @Resource(tie = "super")
    protected RMI file(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI file()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI fill(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI fill()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI filter(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI filter()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getType());

        return this;
    }

    @Resource(tie = "super")
    public RMI fire(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI fire()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI fort(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI as()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI frame(RMIImpl system, Object object)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), system, object);

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI frame(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getObject());

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI frame(Parameter parameter, String URI)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getObject(), URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Parameter parameter, Object... args)
    {
        System.rmi.store(this.store, "public RMI frame()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getObject(), args);

        return this;
    }

    @Resource(tie = "super")
    public RMI frame(Parameter parameter, String URI, Object... args)
    {
        System.rmi.store(this.store, "public RMI frame()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getObject(), URI, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI go(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI go()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getClass(), parameter.getType());

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Parameter parameter, EventFilter filter)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getClass(), filter);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Class _class)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class);

        return this;
    }

    @Resource(tie = "super")
    public RMI hook(Object object, Class _class)
    {
        System.rmi.store(this.store, "public RMI hook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, _class);

        return this;
    }

    @Resource(tie = "super")
    public RMI hooks()
    {
        System.rmi.store(this.store, "public RMI hooks()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI hooks(Object object)
    {
        System.rmi.store(this.store, "public RMI hooks()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI init(String URI, Object initobject, File initfile)
    {
        System.rmi.store(this.store, "public RMI init()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, initobject, initfile);

        return this;
    }

    @Resource(tie = "super")
    public RMI lift(RMIModel object, RMIModel monitor)
    {
        System.rmi.store(this.store, "public RMI lift()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, monitor);

        return this;
    }

    @Resource(tie = "super")
    public RMI listeners()
    {
        System.rmi.store(this.store, "public RMI listeners()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI lock()
    {
        System.rmi.store(this.store, "public RMI lock()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI logic()
    {
        System.rmi.store(this.store, "public RMI logic()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI logic(String URI)
    {
        System.rmi.store(this.store, "public RMI logic()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object)
    {
        System.rmi.store(this.store, "public RMI lookup()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(ThinClient client, String URI) throws Exception
    {
        System.rmi.store(this.store, "public RMI lookup()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        Naming.lookup(URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI lookup()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookup(String URI, Object reference)
    {
        System.rmi.store(this.store, "public RMI lookup()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI lookupClass(ThinClient client, String URI) throws Exception
    {
        System.rmi.store(this.store, "public RMI lookupClass()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI);

        Naming.lookup(URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(RMI system, Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI passthru()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, system, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(Object object, Object reference, Integer constrainer)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference, constrainer);

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(Object object, Object subclass, NullType dummy, Object... args)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, subclass, dummy, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(Object object, Object subclass, NullType dummy)
    {
        System.rmi.store(this.store, "public RMI passthru()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, subclass, dummy);

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(Object object, Object subclass, Object reference, NullType dummy, Object... args)
    {
        System.rmi.store(this.store, "public RMI passthru()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, subclass, reference, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI passthru(Object object, NullType dummy, Object... args)
    {
        System.rmi.store(this.store, "public RMI passthru()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(SystemBoard board, String message)
    {
        System.rmi.store(this.store, "public RMI post()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), message);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(String URI, String message)
    {
        System.rmi.store(this.store, "public RMI post()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, message);

        return this;
    }

    @Resource(tie = "super")
    public RMI post(PrintStream stream, Object object)
    {
        System.rmi.store(this.store, "public RMI post()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), stream, object);

        return this;
    }

    @Resource(tie = "super")
    public RMI put(Object object, String URI)
    {
        System.rmi.store(this.store, "public RMI put()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI put(Object object, String URI, Object... args)
    {
        System.rmi.store(this.store, "public RMI put()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI put(SystemComponent object, String URI)
    {
        System.rmi.store(this.store, "public RMI put()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI);

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI put(SystemComponent object, String URI, Object... args)
    {
        System.rmi.store(this.store, "public RMI put()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, URI, args);

        return this;
    }

    @Resource(tie = "super")
    public RMI ref()
    {
        System.rmi.store(this.store, "public RMI ref()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return null;
    }

    @Resource(tie = "super")
    public RMI ref(Object object)
    {
        System.rmi.store(this.store, "public RMI ref()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object);

        return this;
    }

    @Resource(tie = "super")
    public RMI ref(Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI ref()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI ref(String URI, Object reference)
    {
        System.rmi.store(this.store, "public RMI ref()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), URI, reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI reference(Object reference)
    {
        System.rmi.store(this.store, "public RMI reference()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference);

        return this;
    }

    @Resource(tie = "super")
    public RMI reference(Object object, Object reference)
    {
        System.rmi.store(this.store, "public RMI reference()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, reference);

        return this;
    }

    //

    @Resource(tie = "super")
    public RMI reference(String URI, Object reference)
    {
        System.rmi.store(this.store, "public RMI reference()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference, URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI register(Object object, String type)
    {
        System.rmi.store(this.store, "public RMI register()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), object, type);

        System.event_registry.events.add(new SystemEvent(type));

        return this;
    }

    @Resource(tie = "super")
    public RMI register(SystemEvent event)
    {
        System.rmi.store(this.store, "public RMI register()", event, Thread.currentThread(), Thread.currentThread().getStackTrace(), event);

        System.event_registry.events.add(event);

        return this;
    }

    @Resource(tie = "super")
    public RMI register(Frame frame, Object object, String URI)
    {
        System.rmi.store(this.store, "public RMI as()", object, Thread.currentThread(), Thread.currentThread().getStackTrace(), frame, object, URI);

        return this;
    }

    @Resource(tie = "super")
    public RMI rehook(Class _class, String type)
    {
        System.rmi.store(this.store, "public RMI rehook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), _class, type);

        return this;
    }

    @Resource(tie = "super")
    public RMI requests()
    {
        System.rmi.store(this.store, "public RMI requests()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI rules(String URI)
    {
        System.rmi.store(this.store, "public RMI rules()", URI, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI rules(RMI endpoint)
    {
        System.rmi.store(this.store, "public RMI rules()", endpoint, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    public RMI run(Object object, Object subclass, Object reference, StackTraceElement[] stackdata, RMI system, Object... args)
    {
        System.rmi.store(this.store, "public RMI run()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), reference);

        Method method = null;

        String methodname = stackdata[2].getMethodName();

        String classname = stackdata[2].getClassName();

        ArrayList<Class> argtypes = new ArrayList();

        //

        try
        {
            for (int i = 0; i < args.length; i++)
            {
                if (args[i] == null)
                {
                    continue;   //return value
                }

                argtypes.add(args[i].getClass());
            }

            if (args.length == 0)
            {
                method = this.getClass().asSubclass(system.impl.ref.getClass()).getMethod(methodname);
            }

            if (args.length == 1)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0));
            }

            if (args.length == 2)
            {
                Class _class = this.getClass().getSuperclass();

                Method _method = _class.getMethod(methodname, argtypes.get(0), argtypes.get(1));

                //

                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1));
            }

            if (args.length == 3)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1), argtypes.get(2));
            }

            if (args.length == 4)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1), argtypes.get(2), argtypes.get(3));
            }

            if (args.length == 5)
            {
                method = this.getClass().asSubclass(this.impl.getClass()).getMethod(methodname, argtypes.get(0), argtypes.get(1), argtypes.get(2), argtypes.get(3), argtypes.get(4));
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI securitize(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI securitize(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference());

        //

        System.rmi.encrypt(parameter);

        System.rmi.encapsulate(parameter);

        System.rmi.synchronize(parameter);

        System.rmi.validate(parameter);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI encrypt(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI encrypt(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference());

        //

        String bytecode = null;


        ByteArrayOutputStream baos; //= new ByteArrayOutputStream();

        ObjectOutputStream oos; //= new ObjectOutputStream();

        try
        {
            baos = new ByteArrayOutputStream();

            oos = new ObjectOutputStream(baos);

            //

            oos.writeObject(parameter.getReference());

            oos.flush();

            oos.close();

            //

            bytecode = Arrays.toString(baos.toByteArray());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //

        Cipher cipher;

        try
        {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec("key".getBytes(), "AES"));

            Base64.getEncoder().encodeToString(cipher.doFinal(bytecode.getBytes("UTF-8")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //

        return this;
    }

    @Resource()
    public RMI encapsulate(Parameter parameter)
    {
        return this;
    }

    @Resource()
    public RMI synchronize(Parameter parameter)
    {
        return this;
    }

    @Resource()
    public RMI validate(Parameter parameter)
    {
        return this;
    }

    @Resource(tie = "super")
    public RMI securitize(Parameter parameter, Key key)
    {
        System.rmi.store(this.store, "public RMI securiize(RMI " + parameter.getRmi() + ", Object " + parameter.getReference() + ", Key " + key + ")", parameter.getReference(), Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getRmi(), parameter.getReference(), key);

        //

        System.rmi.encrypt(parameter, key);

        System.rmi.encapsulate(parameter, key);

        System.rmi.synchronize(parameter, key);

        System.rmi.validate(parameter, key);

        //

        return this;
    }

    @Resource(tie = "super")
    public RMI store()
    {
        this.store.store(null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(String id)
    {
        this.store.store(id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store)
    {
        store.store(null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database)
    {
        database.store(null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIDbms database, Integer id)
    {
        database.store(id, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, String id)
    {
        store.store(null, id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Integer id)
    {
        store.store(id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(String id, Object object)
    {
        this.store.store(object, id);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Object object, Thread thread, StackTraceElement[] elements)
    {
        store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(RMIStore store, Object object, Thread thread)
    {
        store.store(object, thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Object object, Thread thread, StackTraceElement[] elements)
    {
        this.store.store(object, thread, elements);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Parameter parameter, Thread thread)
    {
        this.store.store(parameter.getObject(), thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Parameter parameter, RMIStore store)
    {
        store.store(parameter.getObject());

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Parameter parameter, RMIDbms database, Thread thread)
    {
        database.store(parameter.getObject(), "$", thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Parameter parameter, RMIStore store, Thread thread)
    {
        store.store(parameter.getObject(), "$", thread);

        return this;
    }

    @Resource(tie = "super")
    public RMI store(Parameter parameter, RMIDbms database)
    {
        database.store(parameter.getObject(), "$");

        return this;
    }

    @Resource(tie = "super")
    public RMI unhook(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI unhook()", null, Thread.currentThread(), Thread.currentThread().getStackTrace(), parameter.getClass(), parameter.getType());

        return this;
    }

    @Resource(tie = "super")
    public RMI unlock(Parameter parameter)
    {
        System.rmi.store(this.store, "public RMI unlock()", null, Thread.currentThread(), Thread.currentThread().getStackTrace());

        return this;
    }
}
