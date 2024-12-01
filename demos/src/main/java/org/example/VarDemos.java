package org.example;

public class VarDemos {
    public static void main(String[] args) {
        var z = "11";

        var i = Integer.valueOf(1);

        var v = new VarDemos();

        System.out.println(z.getClass().getTypeName());
        System.out.println(i instanceof Integer);
        System.out.println(v.getClass().getTypeName());
    }
}
