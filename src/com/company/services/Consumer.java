package com.company.services;

import com.company.data.Data;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        while (true) {
            String message = data.getMessage();
            System.out.print(message);
        }
    }
}
