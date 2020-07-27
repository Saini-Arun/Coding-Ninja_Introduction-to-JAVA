package Lecture_Codes;

import java.util.Scanner;

public class Bubblesort {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] bubblesort(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			for(int j=1;j<size;j++) {
				if(arr[j]<arr[j-1]) {
					int a=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=a;
				}
			}
		}
		return arr;
	}
	public static void print(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=takeinput();
		input=bubblesort(input);
		print(input);

	}

}
