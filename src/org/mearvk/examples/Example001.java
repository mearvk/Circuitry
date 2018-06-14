package org.mearvk.examples;

import org.mearvk.ancellaries.DefaultListener;
import org.mearvk.ancellaries.System;

import java.rmi.Remote;

public class Example001 implements Remote
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

        example001.system.rmi_client.put("//example001", example001);

        //

        example001.system.rmi_client.put("//example001/listeners/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/listeners/ui/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/listeners/dev/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/listeners/prod/default", new DefaultListener());

        //

        example001.system.rmi_client.put("//example001/notifiers/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/notifiers/ui/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/notifiers/dev/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/notifiers/prod/default", new DefaultListener());

        //

        example001.system.rmi_client.put("//example001/registrars/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/registrars/ui/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/registrars/dev/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/registrars/prod/default", new DefaultListener());

        //

        example001.system.rmi_client.put("//example001/publishers/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/publishers/ui/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/publishers/dev/default", new DefaultListener());

        example001.system.rmi_client.put("//example001/publishers/prod/default", new DefaultListener());
    }
}
