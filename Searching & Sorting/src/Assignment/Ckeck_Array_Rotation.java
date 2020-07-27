package Assignment;

import java.util.Scanner;

public class Ckeck_Array_Rotation {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int rotationcheck(int []arr) {
		int size=arr.length;
		int k=0;
		for (int i=1;i<size; i++) {
			if(arr[i-1]>arr[i]) {
				k=i;
				break;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= takeinput();
		int k=rotationcheck(input);
		System.out.println(k);

	}

}
