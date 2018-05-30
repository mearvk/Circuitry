package org.mearvk.ancellaries;

public class System extends SystemComponent implements Runnable {
    public static void main(String... args) {
        System system = new System("system");

        //system.add(type1);

        //system.add(type2);

        //system.add(type3);

        system.run();
    }

    public System system;

    public System(String name) {
        this.name = name;
    }

    public System(System system, String name) {
        this.system = system;

        this.name = name;
    }

    //

    @Override
    public void latch() throws Exception {

    }

    @Override
    public void unlatch() throws Exception {

    }

    @Override
    public void ready() throws Exception {

    }

    public void put(Object object) {

    }

    public void pump() {

    }

    @Override
    public void init() {

    }

    @Override
    public void run() {
        java.lang.System.out.println();
    }
}
