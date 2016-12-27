package com.gecko.basics.statix;

import org.junit.Test;
/**
 * Created by hlieu on 12/25/16.
 */
public class UtilsUser {

   @Test
   public void testDoSomething () {

      // this is not possible
      //Utils util = new Utils();
      Utils.doSomeUtility ();
   }

   @Test
   public void testDoSomethingUtility () {
      Utils.doSomeOtherUtility ();
   }
}
