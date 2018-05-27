package org.mearvk.ancellaries;

import javax.jms.*;
import javax.naming.InitialContext;

public class System extends SystemComponent
{
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

    @Override
    public void init() {
        try {
            InitialContext context = new InitialContext();

            Topic topic = (Topic) context.lookup(name);

            TopicConnectionFactory connFactory = (TopicConnectionFactory) context.lookup("topic/connectionFactory");

            TopicConnection topicConn = connFactory.createTopicConnection();

            TopicSession topicSession = topicConn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
        } catch (Exception e) {

        }
    }
}
