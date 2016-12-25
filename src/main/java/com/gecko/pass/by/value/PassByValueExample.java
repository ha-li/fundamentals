package com.gecko.pass.by.value;

/**
 * Created by hlieu on 11/13/16.
 *
 * An example of java's pass by reference is actually done as
 * pass by value.
 *
 *
 */
public class PassByValueExample {
    private int x;
    private int y;

    public PassByValueExample (int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * In this swap, we change the value of X's x and y, and then
     * <em>attempt</em> to swap X and Y so that
     * X now points to Y and Y points to X.
     *
     * We should see that after swap ends, X is still pointing to X
     * and Y is still pointing to Y
     * @param X
     * @param Y
     */
    public static void swap(PassByValueExample X, PassByValueExample Y) {
        X.x = 100;
        X.y = 100;

        PassByValueExample tmp = X;
        X = Y;     // set X to point to Y
        Y = tmp;   // set Y to point to X (ie tmp)
    }

    public static void delete(PassByValueExample g) {
        g.x = 1000;
        g.y = 1000;
        g = null;
    }

    public static void main (String[] args) {
        PassByValueExample x = new PassByValueExample(0, 0);
        PassByValueExample y = new PassByValueExample(0, 0);

        System.out.println("X.x: " + x.x + " X.y: " + x.y);
        System.out.println("Y.x: " + y.x + " Y.y: " + y.y);
        System.out.println ("\nNow we increment change X and attempt to swap X and Y, and we find");
        swap(x, y);

        System.out.println("X.x: " + x.x + " X.y: " + x.y);
        System.out.println("Y.x: " + y.x + " Y.y: " + y.y);
        System.out.println ("So the swap did not happen");

        System.out.println ("\nNow we increment Y and attempt to delete Y, and we find");

        delete(y);
        System.out.println("Y.x: " + y.x + " Y.y: " + y.y);
        System.out.println ("The delete failed also.");

        System.out.println ("\nConclusion: Java pass by reference of objects is actually");
        System.out.println ("Pass by Value of the address, and after the method ends, the object still exists");
    }
}
