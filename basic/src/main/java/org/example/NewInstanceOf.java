package org.example;

import org.junit.Assert;

import java.util.List;

public class NewInstanceOf {
    public static void main(String[] args) {
        Assert.assertEquals("string", newInstanceOf("liuyouer"));
        Assert.assertEquals("double", newInstanceOf(10d));
        Assert.assertEquals("other", newInstanceOf(List.of()));
    }

    private static String newInstanceOf(Object o) {
        if (o instanceof String s) {
            return "string";
        } else if (o instanceof Double d) {
            return "double";
        } else {
            return "other";
        }
    }
}
