package org.mearvk.ancellaries;

import javax.jms.*;
import javax.naming.InitialContext;
import java.util.concurrent.locks.Lock;

public abstract class SystemComponent
{
    public String name;

    //

    public System system;

    //

    public InitialContext messaging_context;

    public Topic messaging_exception_endpoint;

    public Topic messaging_event_endpoint;

    public TopicConnectionFactory messaging_connection_factory;

    public TopicConnection messaging_connection;

    public TopicSession messaging_session;

    public TopicPublisher messaging_topic_publisher;


    //

    public BusLogic in;

    public BusLogic out;

    //

    public SignalRegister signalregister;

    public ExceptionRegister exceptionregister;

    //

    public SystemComponent target;

    public SystemComponent deliverable;

    //

    public Lock latchlock;

    public Lock threadlock;

    //

    public abstract void latch() throws Exception;

    public abstract void unlatch() throws Exception;

    public abstract void ready() throws Exception;

    public abstract void init() throws Exception;
}
