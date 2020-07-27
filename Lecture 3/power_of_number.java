import java.util.Scanner;
public class power_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     double x=sc.nextInt();
	     double n=sc.nextInt();
	     if (((x<=8)&&(x>=0)) &&(n>=0)&& (n<=9))
	     {
	    	 System.out.println(Math.round(Math.pow(x, n)));
	     }
	     System.out.println(0);
	}
}
