import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
        int argX = 0, argY = 0;
        Fraction frac = new Fraction();
        System.out.println(args.length);
        if(args.length != 2) {
            argX = 1; 
            argY = 3;
            try {
                frac.setNumerator(argX);
                frac.setDenominator(argY);
                               
            System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

            } catch(Exception e) {
                e.printStackTrace();
            }
        } else {
                        
        //} else {
        //    System.exit(1);        
       // }
    try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         argX = Integer.parseInt(args[0]);
         argY = Integer.parseInt(args[1]);

         // set the values
         frac.setNumerator(argX);
         frac.setDenominator(argY);

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch(Exception e) {
         e.printStackTrace();
      }
    }
   }
}

