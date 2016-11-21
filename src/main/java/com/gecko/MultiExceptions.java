package com.gecko;

import java.util.List;

/**
 * Created by hlieu on 11/20/16.
 */
public class MultiExceptions {
    public static void main (String[] args) {
        List<String> list = null;

        // starting java 7, multi-catch exceptions were introduced
        // to use it, you need to have java 7 installed and using that aspect of the feature
        try {
            list.add("Punk");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("This is genius");
        }
    }
}
