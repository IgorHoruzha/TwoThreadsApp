package com.company.data;

import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Data {
    BlockingQueue dataStorage;

    public Data() {
        dataStorage = new ArrayBlockingQueue(1024);
    }


    public void addData(String message) {
        dataStorage.add(message);
    }

    public String getData() {
        try {
            return (String) dataStorage.take();
        } catch (InterruptedException e) {
            return null;
        }
    }
}
