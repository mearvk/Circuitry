package org.mearvk.circuitry.rmi.system.interfaces;

public interface Hooks
{
    //

    String ON_READY = "0b000000000001";

    String ON_START = "0b000000000010";

    String ON_PAUSE = "0b000000000100";

    String ON_STOP = "0b000000001000";

    //

    String ON_CHANGE = "0b000000010000";

    String ON_MOVE = "0b000000100000";

    String ON_FINALIZE = "0b000001000000";

    //

    String ON_CREATE = "0b0000000010000000";

    String ON_PERSIST = "0b0000000100000000";

    String ON_MONITOR = "0b0000001000000000";

    String ON_CLONE = "0b0000010000000000";

    String ON_DATA = "0b0000100000000000";

    String ON_REGISTER = "0b0001000000000000";

    String ON_INTEGRATE = "0b0010000000000000";

    //

    String ALL = "0b00111111111111111";

    //

    String REF_REGISTRY = "0x1111";
}
