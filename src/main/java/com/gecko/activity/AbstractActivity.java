package com.gecko.activity;

/**
 * Created by hlieu on 11/13/16.
 */
public abstract class AbstractActivity implements Activity {

    public abstract void preExecute();
    public abstract void postExecute();
    public abstract void doActivity();


    // an example of a Template Method design pattern
    // the template method should be final to prevent override
    // in sub classes. The implementation of the template method
    // should lay down the structure of the calls.
    // Subclasses should actually implement the gut of the
    // calls.
    public final void execute() {
        preExecute();
        doActivity();
        //execute();
        postExecute();
    }
}
