import java.util.*;
import java.io.*;
public class Main{
	public static void main(String ar[]){
		int t;
	
	
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		
		while(t-->0){
    long n;
		n=ob.nextLong();
		List<Long> list=new ArrayList<>();
		
	 long i = 1;
            while (n % i == 0) {
                i++;
            }
 
		System.out.println(i-1);
		
 
		}
