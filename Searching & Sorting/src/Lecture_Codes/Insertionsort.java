package Lecture_Codes;

import java.util.Scanner;

public class Insertionsort {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] insertionsort(int arr[]) {
		int size=arr.length;
		for(int i=1;i<size;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				 
				 arr[j+1]=arr[j];				
				j--;				
			}
			System.out.println(j);
			
			arr[j+1]=temp;

				
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
		input=insertionsort(input);
//		print(input);

	}

}
