package org.mearvk.ancellaries;

import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnectionFactory;
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
            this.messaging_context = new InitialContext();

            this.messaging_exception_endpoint = (Topic) messaging_context.lookup(name + "/exceptions");

            this.messaging_event_endpoint = (Topic) messaging_context.lookup(name + "/events");

            this.messaging_connection_factory = (TopicConnectionFactory) messaging_context.lookup(name + "/connection_factory");

            this.messaging_connection = messaging_connection_factory.createTopicConnection();

            this.messaging_session = messaging_connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

            this.messaging_topic_publisher = messaging_session.createPublisher(messaging_exception_endpoint);

        } catch (Exception e) {

        }
    }
}
