import java.util.ArrayList;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt(),ele=0,s1=0,s2=0;
	        int ar[][]=new int[n][n];
	   
	        for(int i=0;i<n;i++)
	        for(int j=0;j<n;j++){
	            ele=sc.nextInt();
	            if(i==j)
	            	s1+=ele;
	            if((i+j)==(n-1))
	            	s2+=ele;
	        	           
	        }
	   	        
	        System.out.println(Math.abs(s1-s2));
	        sc.close();
	        

}
}
