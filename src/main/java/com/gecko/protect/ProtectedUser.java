package com.gecko.protect;

/**
 * Created by hlieu on 11/13/16.
 */
public class ProtectedUser {
    public ProtectedUser() {

    }

    public void doNothing() {
        // fails compile time
        //Protected p = new Protected();
    }

    public static void main(String[] args) {
        ProtectedUser user = new ProtectedUser();
        user.doNothing();
    }
}
