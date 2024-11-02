package MathProgram;

import java.util.ArrayList;

// Store numbers and operators in two separate ArrayLists<>
public class Calculator {

   static ArrayList<Number> number = new ArrayList<Number>();
   static ArrayList<Double> real = new ArrayList<>();
   static ArrayList<Double> imaginary = new ArrayList<>();
   static ArrayList<String> operator = new ArrayList<String>();

   public static Number calculateTerm(){
      Term t = new Term();
      Number n2 = new Number(0,0);
      int count = 0;
      for (Double _real : real) {
         Number n1 = new Number(_real, imaginary.get(count));
         n2 = t.Operation(n2, n1, operator.get(count));
         count++;
      }
      return n2;
   }
}
