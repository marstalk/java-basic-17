package org.example.privatemethodininterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface MyInterfaceA {
    void log(String a);


    // if we want to add more method here, it could a trouble, because
    // all the implement class have to implement this new added method as well
    // which could be overwhelmed in a complex project with a lot of implements.

    // so Java introduce a new feature called "default",
    // we could add a "default" method to the interface, which the implement class don't have to implement it.

    default void log(String a, LocalDateTime localDateTime){
        System.out.println("log " + a + " at " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
