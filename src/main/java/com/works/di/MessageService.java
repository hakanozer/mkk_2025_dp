package com.works.di;

abstract public class MessageService {
    public MessageService() {
        System.out.println("MessageService Call");
    }
    abstract void sendMessage(String message);
}
