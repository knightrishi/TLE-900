import java.util.*;
import java.io.*;
public class Main{
	public static void main(String ar[]){
		int t;
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		
		while(t-->0){
		int n;
		//	System.out.println(n);
			n=ob.nextInt();
 ob.nextLine();
 String s=ob.nextLine();
			
			int max=1;
			int count=1;
			for(int i=0;i<s.length()-1;i++){
			 if (s.charAt(i) == s.charAt(i + 1)){
			    count++;
			   
			  }
			 
			  else{
			  max=Math.max(max,count);
			count=1;
			  
			    
			  }
			}
			  max=Math.max(max,count);
			System.out.println(max+1);
			

		}

	}
}
