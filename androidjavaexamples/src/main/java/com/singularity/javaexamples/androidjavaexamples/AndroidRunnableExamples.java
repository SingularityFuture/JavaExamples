package com.singularity.javaexamples.androidjavaexamples;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/**
 * Created by Michael on 4/12/2017.
 */

public class AndroidRunnableExamples {

    Handler mHandler;

    public AndroidRunnableExamples(){

        mHandler = new Handler(Looper.getMainLooper()) {
            /*
             * handleMessage() defines the operations to perform when
             * the Handler receives a new Message to process.
             */
            @Override
            public void handleMessage(Message inputMessage) {
                Log.i("Handle Message: ", "Message output by handler");
            }
        };
    }

    public void handlerMessageExample(){
        Message mMessage = new Message();
        Bundle data = new Bundle();
        data.putString("message_key","Sent Message");
        mMessage.setData(data);
        mHandler.sendMessage(mMessage);
    }

    public void handlerRunnableExample(){
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("RunnableMessage: ", "Post Delayed 5 seconds");
            }
        }, 5000);
    }

}
