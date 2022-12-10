package fisrtprogram;
import java.util.*;
public class Alternate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  //size of array 1 (n)
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();  //getting array elements 
		}
		int n1=sc.nextInt();   //size of array 2
		int b[]=new int[n1];
		for(i=0;i<n1;i++) {
			b[i]=sc.nextInt();   //getting array elements
		}  
		int l=0,r=n1-1;
		int c[]=new int[n+n1];    //for storing alternate array create a empty array
		for(i=0;i<n+n1;i++)
		{
			if(i%2==0)
			{
				c[i]=a[l++];
			}else {
				c[i]=b[r--];
			}
		}
		for(i=0;i<n+n1;i++)
			System.out.print(c[i]+" ");
	}

}
