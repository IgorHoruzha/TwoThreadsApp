package com.company.data;

import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Data {

    private static Data single_instance = null;

    BlockingQueue dataStorage;

    private Data() {
        dataStorage = new ArrayBlockingQueue(1024);
    }

    // static method to create instance of Singleton class
    public static Data getInstance()
    {
        if (single_instance == null)
            single_instance = new Data();

        return single_instance;
    }

    public void addMessage(String message) {
        dataStorage.add(message);
    }

    public String getMessage() {
        try {
            return (String) dataStorage.take();
        } catch (InterruptedException e) {
            return null;
        }
    }
}
