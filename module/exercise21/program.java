import java.util.*; 
    public class program {  
          
         * 
         *       try {
         * 
         *           System.out.println("numerator");
           
                  Sys
     

            double res = divide(num, den);
            System.out.println(res);

        } catch (ArithmeticExcept e) {
            System.err.println("error" + e.getMessage());

        } 
        }
    }

    public static double divide(double num, double den) {
        if (den == 0) {
            throw new ArithmeticExcept("Cannot divide by zero");

        } else {
            double ans = num / den;
            return ans;
        }
    }
}