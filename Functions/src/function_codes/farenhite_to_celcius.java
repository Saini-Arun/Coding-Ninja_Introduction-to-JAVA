package function_codes;
import java.util.Scanner;
public class farenhite_to_celcius {
	public static void printFahrenheitTable(int start, int end, int step) {
		for (int i=start;i<=end;i+=step){
            int ans=(int)((i-32)*5)/9;
            System.out.println(start+" "+ans);
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int start=sc.nextInt();
int end=sc.nextInt();
int step=sc.nextInt();
printFahrenheitTable(start,end,step);

	}

}
