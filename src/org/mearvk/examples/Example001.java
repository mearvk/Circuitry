package org.mearvk.examples;

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

        example001.system.rmi.put("//example001", example001);
    }
}
