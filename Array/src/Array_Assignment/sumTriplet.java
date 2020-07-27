package Array_Assignment;

import java.util.Scanner;

public class sumTriplet {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void pairsum(int inpt[], int x) {
		int input[]=inpt;
		int size=input.length;
		for (int i=0;i<size;i++) {
			for(int j=(i+1);j<size;j++) {
				for(int k=(j+1);k<size;k++) {
				int a=input[i];
				int b=input[j];
				int c=input[k];
				if(x==(a+b+c)) {
					if(a<b) {
					}else {
						int temp =b;
						b=a;
						a=temp;
					}
					if(c>a && c>b) {
						System.out.println(a+" "+b+" "+c);
					}else if(c<a && c<b) {
						System.out.println(c+" "+a+" "+b);
					}else {
						System.out.println(a+" "+c+" "+b);
					}
						

					
				}
			}
			}
		}
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		pairsum(arr,x);

	}

}
