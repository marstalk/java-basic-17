package org.example.privatemethodininterface;

import java.time.LocalDateTime;

public class MyInterfaceImpl implements MyInterfaceA{
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.log("a", LocalDateTime.now());
    }


    @Override
    public void log(String a) {
        System.out.println("log with " + a);
    }

    /**
     * we can optionally override the log(String a, LocalDateTime) method here.
     * @param a
     * @param localDateTime
     */
    @Override
    public void log(String a, LocalDateTime localDateTime) {
        MyInterfaceA.super.log(a + " override", localDateTime);
    }
}
