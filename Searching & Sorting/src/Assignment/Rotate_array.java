package Assignment;

import java.util.Scanner;

public class Rotate_array {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void rotatearray(int []arr, int d) {
		int size=arr.length;
		int x=0;
		while(x<d) {
			for(int j=1;j<size;j++) {
					int a=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=a;
			}
		x++;
	}
	}
	public static void print(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= takeinput();
		Scanner sc =new Scanner(System.in);
		int d=sc.nextInt();
		rotatearray(input,d);
		print(input);
	}
}
