package com.example;

/**
 * Created by Michael on 4/12/2017.
 */

public class Examples implements CallbackSetup.CallbackInterface{

    public static void main(String[] args){
        System.out.println("Hello World");

        Examples mainObject = new Examples(); // Instantiate since it's static and testCallback is not
        mainObject.testCallback(); // Call the class's method

        RunnableExamples runnableExamples = new RunnableExamples();
        runnableExamples.newThreadWithRunnable();


    }

    public void testCallback(){
        CallbackSetup callbackObject = new CallbackSetup(this);
        callbackObject.illustrateCallback();
    }

    public void callbackMethod(){
        System.out.println("Call back method called");
    }
}
