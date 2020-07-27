import java.util.Scanner;
public class Total_Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic=sc.nextInt();
		int G=sc.next().charAt(0);
		double hra=(20*basic)/100d;
//		System.out.println(hra);
		double da=(50*basic)/100d;
//		System.out.println(da);
		double pf=(11*basic)/100d;
//		System.out.println(pf);
		double total_salary;
		if (G==65)
		{
			int allowance=1700;
			total_salary=(basic+hra+da+allowance-pf);			
			System.out.println(Math.round(total_salary));
		}
		else if(G==66)
		{
			int allowance=1500;
			total_salary=(basic+hra+da+allowance-pf);
			System.out.println(Math.round(total_salary));
		}
		else if ((G>=67) && (G<=90))
		{
			int allowance=1300;
		  total_salary=(basic+hra+da+allowance-pf);	
		  System.out.println(Math.round(total_salary));
		}		
	}
}

