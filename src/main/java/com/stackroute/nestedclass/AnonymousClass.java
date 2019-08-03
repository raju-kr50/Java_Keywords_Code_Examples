package com.stackroute.nestedclass;

interface Anonymous {
    void message();
}

public class AnonymousClass implements Anonymous{
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        });
    }

    @Override
    public void message() {

    }
}