package com.gecko.patterns.template.method;

/**
 * Created by hlieu on 11/13/16.
 */
public class Climbing extends AbstractActivity {

    @Override
    public void preExecute(){
        System.out.println("Chalking up");
    }


    public void postExecute(){
        System.out.println("Tearing down harness");
    }

    public void doActivity() {
        System.out.println("climbing");
    }

    public static void main(String[] args) {
        Activity climb = new Climbing();
        climb.execute();
    }

}
