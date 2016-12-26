package com.gecko.basics.statix;

/**
 * Created by hlieu on 12/25/16.
 *
 * An example of a true utility class (similar to java.lang.Math)
 *
 * 1. the class is marked as final so that it cannot be inherited from
 * 2. the constructor is private so that it cannot be instantiated
 * 3. all methods are static
 */
public final class Utils {

   // this is legal, but pointless, in fact we can have multiple utils
   private static Utils utils = new Utils();
   private static Utils utils2 = new Utils ();
   private static final int I = 100;

   // we do not ever want to instantiate this class, just call it
   private Utils (){}

   public static void doSomeUtility () {

   }
   public static void doSomeOtherUtility () {}
}
