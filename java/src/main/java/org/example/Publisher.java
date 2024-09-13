package org.example;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Publisher {
    private  Set<Topic>topics;

    public Publisher() {
        topics = new CopyOnWriteArraySet<>();
    }

    public void addTopics(Topic topic){
        topics.add(topic);
    }

    public void publishTopics(Topic topic, Message message){
        if(!topics.contains(topic)){
            System.out.println("topic not exist");
            return;
        }
        topic.publishMessage(message);
    }
}
