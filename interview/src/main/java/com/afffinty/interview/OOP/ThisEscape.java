package com.afffinty.interview.OOP;

public class ThisEscape {

    private String message;

    public ThisEscape(EventSource source) {
        source.register(new Runnable() {
            @Override
            public void run() {
                System.out.println(message.toUpperCase());
            }
        });

        message = "hello";
    }

    public static void main(String[] args) {
        EventSource source = new EventSource();

        new ThisEscape(source);

        source.fireEvent();
    }
}