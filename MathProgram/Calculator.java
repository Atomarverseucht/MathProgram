package MathProgram;
import java.util.ArrayList;

// Store numbers and operators in two separate ArrayLists<>
public class Calculator {

   static ArrayList<Double> real = new ArrayList<>();
   static ArrayList<Double> imaginary = new ArrayList<>();
   static ArrayList<String> operator = new ArrayList<>();
   static ArrayList<Integer> rank = new ArrayList<>();

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

   public static void orderTerms() {
      int temp;
      for(int i=1; i < rank.size(); i++) {
         for(int j=0; j < rank.size()-i; j++) {
            if(getRank(j) > getRank(j+1)) {
               temp = rank.get(j+1);
               rank.set(j, rank.get(j+1));
               rank.set(j+1, temp);
            }               
         }
      }
   }

   public static int getRank(int index) {
      int output = 0;
      String[] rankedOperator = {"*", "/", "+", "-"};
      for (int a = 0; a < rankedOperator.length; a++) {
         if(operator.get(a) == rankedOperator[a]) {
            output = a;
            break;
         }
      }
      return output;
   }
}
