import java.util.Scanner;
public class sumof_even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int integer=sc.nextInt();
	     int sum_even=0;
	     int sum_odd=0;
	     int x= 0;
	     while (integer!=0)
	     {
	    	 x=integer%10;
	    	if (x%2==0)
	    	{
	    		 sum_even=sum_even+x;
	    	 }
	    	 else {
	    		 sum_odd=sum_odd+x;
	    	 }
	    	integer=Math.round(integer/10);	    	
	     }
	     System.out.print(sum_even+" "+sum_odd);     
}
}