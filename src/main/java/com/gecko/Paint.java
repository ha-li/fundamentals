package com.gecko;

import com.gecko.enums.Color;
import com.gecko.enums.PaletteSource;

/**
 * Created by hlieu on 07/11/17.
 */
public class Paint {

   private Color color;

   public Paint (Color color) {
      this.color = color;
   }

   public static void main (String[] args) {
      Paint paint = new Paint (Color.RED);
      PaletteSource source = new PaletteSource();
      source.sku = "34.2.43.23";
      paint.color.palette.configure (source, "Color Be Bad!");
   }
}
