import java.util.*;
import java.io.*;
public class Main{
	public static void main(String ar[]){
		int t;
	
 
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		
		while(t-->0){
 
	int n;
 
	n=ob.nextInt();
	
	int x[]=new int[n];
	
	for(int i=0;i<n;i++){
	  x[i]=ob.nextInt();
	}
	if(n%2==0){
	  System.out.println(2);
	  System.out.println("1" +" "+ n);
	  System.out.println("1 " +" "+ n);
	  
	}
	else{
	   System.out.println(4);
	     System.out.println("1 " +" "+(n-1));
	     System.out.println("1 " +" "+ (n-1));
	     System.out.println((n-1) +" "+ n);
	     System.out.println((n-1) +" "+ n);
	  
	   
	}
	
	
		}
	
 
	}
}
