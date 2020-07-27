package Array_codes;
import java.util.Scanner;
public class Swap {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void swap(int input[]){
		int i=0;
		int a;
		int size=input.length;
		if (size%2==0) {
		while(i<size) {
			a=input[i];
			input[i]=input[i+1];
			input[i+1]=a;
			i+=2;			
		}			
			for (int j=0;j<size;j++) {
				System.out.print(input[j]+" ");
			}
		
	}else {
		size--;
		while(i<size) {
			a=input[i];
			input[i]=input[i+1];
			input[i+1]=a;
			i+=2;			
		}		
		size++;
			for (int j=0;j<size;j++) {
				System.out.print(input[j]+" ");
			}
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=takeinput();
swap(arr);
	}

}
