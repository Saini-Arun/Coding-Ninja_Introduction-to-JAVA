package Assignment;

import java.util.Scanner;

public class secondLargest {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int secondlargest(int []arr) {
		int size=arr.length;
		int largest=arr[0];
		int largest2=arr[1];
		int x=0;
		if (largest<largest2) {
			int temp=largest;
			largest=largest2;
			largest2=temp;
		}
		for(int i=2;i<size;i++) {
			x=arr[i];
			if (x>largest && x>largest2 ) {
				largest=largest2;
				largest=x;
			}else if(x<largest && x>largest2) {
				largest2=x;
			}
		}
		return largest2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=takeinput();
		int x=secondlargest(input);
		System.out.println(x);

	}

}
