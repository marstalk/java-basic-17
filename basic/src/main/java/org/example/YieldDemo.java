package org.example;

import org.junit.Assert;

public class YieldDemo {
    public static void main(String[] args) {
        String hello = switchWithYield("hello");
        Assert.assertEquals("hello world", switchWithYield("hello"));
        Assert.assertEquals("hi world", switchWithYield("hi"));
        Assert.assertEquals("other", switchWithYield("liuyouer"));
    }

    /**
     * using keyword yield to in matching expression.
     *
     * @param input
     * @return
     */
    private static String switchWithYield(String input) {
        return switch (input) {
            case "hello" -> {
                System.out.println("hello");
                yield "hello world";
            }
            case "hi" -> {
                System.out.println("hi");
                yield "hi world";
            }
            default -> {
                System.out.println("default");
                yield "other";
            }
        };
    }


}
