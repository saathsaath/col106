import java.util.Scanner;
import java.util.Vector;

public class odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        Vector<Integer> ans = getodd(n);
        for(int a : ans){
            System.out.print(a + " ");
        }
        System.out.println("");
    }

    public static Vector<Integer> getodd(int n){
        Vector<Integer> ans=new Vector<Integer>();
        int x = 1;
        while(x<=n){
            ans.add(x);
            x+=2;
        }
        return ans;
    }
}
