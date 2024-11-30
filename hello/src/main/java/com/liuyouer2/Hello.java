package com.liuyouer2;

import com.liuyouer.World;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello " + World.get());

        // can't user World3, cause world3 is not exported.
    }
}
