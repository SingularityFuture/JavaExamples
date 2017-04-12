package com.example;

/**
 * Created by Michael on 4/12/2017.
 */

// Illustrates the basic structure of a callback

public class CallbackSetup {

    private CallbackInterface callbackHandle;

    // Define a constructor that sends the instance of the calling class, which implements the interface method
    public CallbackSetup(CallbackInterface callbackImplementation) {
        if(callbackImplementation != null) { // Make sure the calling class implements callbackMethod
            callbackHandle = callbackImplementation; // Set the interface to the calling class, which is an instance of the interface (since it's the only thing that knows what to do!)
        } else {
            throw new RuntimeException("Calling class must implement callbackMethod!");
        }
    }

    // Define the interface that you want to be implemented by the calling class
    // The benefit of an interface is that any class that implements the interface can be used here, instead of just one class
    public interface CallbackInterface {
        void callbackMethod(); // Here, you can have one or more undefined method signatures that must be implemented by the calling class
    }

    public void illustrateCallback() { // Create a method that triggers the callback method from the calling class
        callbackHandle.callbackMethod(); // The handle refers back to the calling class, which knows how to implement the method
    }
}
