package com.gecko;

/**
 * Created by hlieu on 12/25/16.
 */
public final class Parameters {

   public static void assertNotNull (Object reference, String message) {
      if (reference == null) {
         throw new IllegalArgumentException (message);
      }
   }

   public static void assertNotNull (Object reference) {
      assertNotNull(reference, "Null reference is not allowed.");
   }

   public static void assertTrue (boolean condition, String message) {
      if( !condition ) {
         throw new IllegalArgumentException (message);
      }
   }

   public static void assertTrue (boolean condition) {
      assertTrue (condition, "Condition must be true.");
   }

   public static void assertFalse (boolean condition, String message) {
      if (condition) {
         throw new IllegalArgumentException (message);
      }
   }

   public static void assertFalse (boolean condition) {
      assertFalse (condition, "Condition must be false.");
   }

   public static void assertGreater (long value, long bound, String message) {
      assertTrue (value > bound, message);
   }

   public static void assertGreaterOrEqual (long value, long bound, String message) {
      assertTrue (value >= bound, message);
   }

   public static void assertLesser (long value, long bound, String message) {
      assertTrue (value < bound, message);
   }

   public static void assertLesserOrEqual (long value, long bound, String message) {
      assertTrue (value <= bound, message);
   }

   public static void assertInRangeInclusive (long value,
                                              long lowerBound,
                                              long upperBound,
                                              String message) {
      assertGreaterOrEqual (value, lowerBound, message);
      assertLesserOrEqual (value, upperBound, message);
   }

   public static void assertEquals (long leftVal, long rightVal, String message) {
      assertTrue (leftVal == rightVal, message);
   }


   /**
    * Private constructor to prevent unnecessary instantiation.
    */
   private Parameters() {
      // empty
   }
}
