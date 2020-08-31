package com.company.services;

import com.company.data.Data;

import java.util.concurrent.TimeUnit;

public class Consumer extends Thread {

    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        while (true) {

            String message= data.getMessage();
            if (data!=null) {
                System.out.print(message);
            }else {
                System.out.print("No messages");
            }

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}
