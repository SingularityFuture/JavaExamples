package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by test on 4/13/2017.
 */

public class LinkedListClass {

    private LinkedList<String> linked = new LinkedList<>();

    public void linkedSetup(){
        linked.add("Hello");
        linked.add(1,"Jump");

        ListIterator<String> linkedIterator = linked.listIterator();

        while(linkedIterator.hasNext()){
            System.out.println(linkedIterator.next());
        }

        for(String s:linked){
            System.out.println(s);
        }
    }
}
