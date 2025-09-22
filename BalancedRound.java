import java.util.*;
import java.io.*;
public class Main{
	public static void main(String ar[]){
		int t;
	
	
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		
		while(t-->0){
    int  n,k;
		n=ob.nextInt();
		k=ob.nextInt();
	int a[]=new int[n];
		
        for(int i=0;i<n;i++){
          a[i]=ob.nextInt();
        }
int count=1;
  int first=1;
Arrays.sort(a);
  for(int i=1;i<n;i++){
    if(a[i]-a[i-1]<=k){
      count++;
    }
    else{
      count=1;
    }
    first=Math.max(first,count);
  }
		System.out.println(n-first);
		

		}
		

	}
}
