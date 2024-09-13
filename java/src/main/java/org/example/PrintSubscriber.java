package org.example;

public class PrintSubscriber implements Subscriber{
    private String name;

    public PrintSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void message(Message message){
        System.out.println("Subscriber " + name + " received message: " + message);
    }
}
