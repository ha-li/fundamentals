package com.gecko.basics.innerclass;

/**
 * Created by hlieu on 12/25/16.
 *
 * An example illustrating inner class and static inner class.
 * The main difference is in the syntax of instantiation.
 */
public class Outer {
   private String outer_s;
   private static String outer_s_static = "outer-static-string-member";

   public Outer(String s) {
      outer_s = s;
   }

   // this is a change

   // private means private outside of this class and file,
   // so even though this is a private method, inside this file, we can
   // still call it
   private String privateMethod () {
      return "Calling a private method";
   }


   public class Inner {
      public String getOuterMember () {
         return outer_s;
      }

      public String getOuterStaticMember() {
         return outer_s_static;
      }
   }

   private static class InnerStatic {
      // since InnerStatic is a static class, every thing inside it is consider
      // static context, so it cannot access an instance variable like outer_s
      /* public String getOuterMember () {
         return outer_s;
      } */

      public String getOuterStaticMember () {
         return outer_s_static;
      }

      private static String privateStaticMethod () {
         return "Calling inner class private method";
      }
   }


   public static void main (String[] args) {
      Outer out = new Outer("outer-member-string");
      System.out.println(out.privateMethod ());


      Inner inner = out.new Inner ();

      // this is also a syntax error because it is treating
      // Inner in a static context
      //Inner inner2 = new Outer.Inner ();
      System.out.println ("\n"+inner.getOuterMember ());
      System.out.println (inner.getOuterStaticMember ());

      System.out.println ("\nOne of the differences is how we instantiate an inner or static inner class");


      // we can still instantiate an inner static class, so it
      // is not truely static in that sense. Many inner static instances
      // many exist.
      InnerStatic innerStatic = new Outer.InnerStatic ();

      // this is the wrong syntax
      //InnerStatic innerStatic2 = out.new InnerStatic ();
      System.out.println (innerStatic.getOuterStaticMember());
      System.out.println (innerStatic.privateStaticMethod ());
      innerStatic = null;
      innerStatic.getOuterStaticMember();
   }
}
