package org.mearvk.ancellaries;

public class System
{
    public System system;

    public System() {

    }

    public System(System system) {
        this.system = system;
    }

    //

    public void latch(Object relative, Object target){}

    public void put(Object relative, Object deliverable, Object target){}

    public void pump(Object relative, ExceptionRegister register){}

    public void unlatch(Object relative, Object target){}
}
