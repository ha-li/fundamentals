package com.gecko.pass.by.value;

/**
 * Created by hlieu on 11/13/16.
 */
public class PassByValueExample {
    private int x;
    private int y;

    public PassByValueExample (int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void swap(PassByValueExample x, PassByValueExample y) {
        x.x = 100;
        x.y = 100;

        PassByValueExample tmp = x;
        x = y;   // set x to point to y
        y = tmp;   // set y to point to tmp
    }

    public static void delete(PassByValueExample g) {
        g.x = 1000;
        g.y = 1000;
        g = null;
    }

    public static void main (String[] args) {
        PassByValueExample x = new PassByValueExample(0, 0);
        PassByValueExample y = new PassByValueExample(0, 0);

        System.out.println("X: " + x.x + " Y: " + x.y);
        System.out.println("X: " + y.x + " Y: " + y.y);

        swap(x, y);

        System.out.println("after swapping, x.X: " + x.x + " x.Y: " + x.y);
        System.out.println("after swapping, but before deleting y, y.X: " + y.x + " y.Y: " + y.y);

        delete(y);

        System.out.println("After deleting y, y.X: " + y.x + " y.Y: " + y.y);

    }
}
