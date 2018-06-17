package org.mearvk.examples.example001;

import org.mearvk.ancellaries.BaseListener;
import org.mearvk.ancellaries.Event;
import org.mearvk.ancellaries.System;

import java.io.Serializable;
import java.rmi.Remote;

public class Example001 implements Remote, Serializable
{
    public System system;

    public Example001()
    {
        this.system = new System("example001");
    }

    public static void main(String... args)
    {
        Example001 example001 = new Example001();

        //

        System system = example001.system;

        //

        system.rmi_client.put("//example001", example001);

        //

        system.rmi_client.put("//example001/listeners", new BaseListener());

        system.rmi_client.put("//example001/listeners/ui", new BaseListener());

        system.rmi_client.put("//example001/listeners/development", new BaseListener());

        system.rmi_client.put("//example001/listeners/product", new BaseListener());

        //

        BaseListener base_listener = (BaseListener) system.rmi_client.pull("//example001/listeners");

        BaseListener base_ui_listener = (BaseListener) system.rmi_client.pull("//example001/listeners/ui");

        BaseListener base_development_listener = (BaseListener) system.rmi_client.pull("//example001/listeners/development");

        BaseListener base_product_listener = (BaseListener) system.rmi_client.pull("//example001/listeners/product");

        //

        base_listener.responder = new SimpleOutputEventResponder();

        base_ui_listener.responder = new SimpleOutputEventResponder();

        base_development_listener.responder = new SimpleOutputEventResponder();

        base_product_listener.responder = new SimpleOutputEventResponder();

        //

        base_listener.addEvent(new Event("Base listener check; passed"));

        base_ui_listener.addEvent(new Event("UI base listener check; passed"));

        base_development_listener.addEvent(new Event("Development base listener check; passed"));

        base_product_listener.addEvent(new Event("Product base listener check; passed"));

        //

        //example001.system.rmi_client.put("//example001/notifiers/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/notifiers/ui/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/notifiers/dev/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/notifiers/prod/default", new DefaultListener());

        //

        //example001.system.rmi_client.put("//example001/registrars/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/registrars/ui/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/registrars/dev/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/registrars/prod/default", new DefaultListener());

        //

        //example001.system.rmi_client.put("//example001/publishers/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/publishers/ui/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/publishers/dev/default", new DefaultListener());

        //example001.system.rmi_client.put("//example001/publishers/prod/default", new DefaultListener());
    }
}
