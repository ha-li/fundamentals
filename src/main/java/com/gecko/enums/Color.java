package com.gecko.enums;

/**
 * Created by hlieu on 07/11/17.
 */
public enum Color {

   RED ( new Palette () {
         @Override
         public void configure ( PaletteSource source, String creator  ) {
            System.out.println ("Creator=" + creator + ", sku=" + source.sku);
            // where did i buy this RED
            source.number = "12.14.54.22";
         }

   }),

   BLUE ( new Palette () {
         @Override
         public void configure ( PaletteSource source, String creator ) {
            source.number = "56.32.11.29";
         }
      }
   );

   public Palette palette;

   private Color (Palette palette) {
      this.palette = palette;
      // this.dialect = palette.getPaletteNumber ();
   }

   public interface Palette {

       // configure the palette with the store purchased from, who purchased
       void configure (PaletteSource source, String creator);

   }
}
