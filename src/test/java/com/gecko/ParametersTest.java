package com.gecko;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 12/26/16.
 */
public class ParametersTest {
   @Test
   public void testAssertNotNull () {
      String s = "A String";
      Parameters.assertNotNull(s, "String s is null");
   }

   @Test (expected = IllegalArgumentException.class)
   public void testAssertNotNullFail () {
      String s = null;
      Parameters.assertNotNull (s, "Null String Error");
   }

   @Test
   public void testAssertNotNull_v2 () {
      String s = "A String";
      Parameters.assertNotNull(s);
   }

   @Test (expected = IllegalArgumentException.class)
   public void testAssertNotNullFail_v2 () {
      String s = null;
      Parameters.assertNotNull(s);
   }

}