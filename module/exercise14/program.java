import java.util.*;

public class program
{
	public int[] test(int[] input)
	{
		int nonz = 0;
		for(int i=0; i<input.length; i++){
			if(input[i]!=0){
				nonz++;
			}
		}

		int[] ans = new int[nonz];
		int j=0;
		for(int i=0; i<input.length; i++){
			if(input[i]!=0){
				ans[j]=input[i];
				j++;
			}
		}
		return ans;
		
	}
}




