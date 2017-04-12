package com.example;

/**
 * Created by Michael on 4/12/2017.
 */

public class RunnableExamples {

    public RunnableExamples(){ // Dummy constructor
    }

    public void newThreadWithRunnable(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("newThreadWithRunnable");
            }
        });
        thread.run();
    }
}
