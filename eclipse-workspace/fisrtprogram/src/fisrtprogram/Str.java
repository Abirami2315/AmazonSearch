package fisrtprogram;
import java.util.*;
public class Str {
	
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        char ch[]=str.toCharArray();
	        int i,sum=0,t=0;
	        for(i=0;i<ch.length;i++){
	        if(ch[i]>='0' && ch[i]<='9'){
	        	t=ch[i]-'0';
	        sum=sum+ch[i];
	        }
	        
	        
	        System.out.print(sum);
	        }
	    }
	}


