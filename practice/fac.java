import java.util.*;

public class fac{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(ComputeFactorial(x));
        input.close();
    }
    
    public static int ComputeFactorial(int n) {
        if(n==0){
            return 1;
        }else{
            return n*ComputeFactorial(n-1);
        }
        
        
    }
}