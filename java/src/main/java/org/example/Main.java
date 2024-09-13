package org.example;

public class Main {
    public static void main(String[] args) {
        // Create topics
        Topic topic1 = new Topic("Topic1");
        Topic topic2 = new Topic("Topic2");

        // Create publishers
        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();


        // Create subscribers
        Subscriber subscriber1 = new PrintSubscriber("Subscriber1");
        Subscriber subscriber2 = new PrintSubscriber("Subscriber2");
        Subscriber subscriber3 = new PrintSubscriber("Subscriber3");


        publisher1.addTopics(topic1);
        publisher2.addTopics(topic2);


        topic1.addSubscriber(subscriber1);
        topic1.addSubscriber(subscriber2);
        topic2.addSubscriber(subscriber2);
        topic2.addSubscriber(subscriber3);

        // Publish messages
        publisher1.publishTopics(topic1, new Message("Message1 for Topic1"));
        publisher1.publishTopics(topic1, new Message("Message2 for Topic1"));
        publisher2.publishTopics(topic2, new Message("Message1 for Topic2"));


        // Unsubscribe from a topic
        topic1.removeSubscriber(subscriber2);
    }
}