package com.gecko.activity;

/**
 * Created by hlieu on 11/13/16.
 */
public interface Activity {
    void preExecute();
    void postExecute();
    void doActivity();
    void execute();
}
