import java.util.*;
import java.io.*;
public class Main{
	public static void main(String ar[]){
		int t;
	

		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		
		while(t-->0){
	long a,b;
	int n;
	a=ob.nextLong();
	b=ob.nextLong();
	n=ob.nextInt();
	
	long x[]=new long[n];
	
	for(int i=0;i<n;i++){
	  x[i]=ob.nextLong();
	}
long ans=b;
	  for(int i=0;i<n;i++){
	    ans+=Math.min(x[i],a-1);//If you can do an action any number of times in a turn, and there’s no downside, dump all actions at once to maximize your advantage.
                              //Then just calculate the resulting state directly, without simulation.
	  }
			
	System.out.println(ans);
		}
	

	}
}
