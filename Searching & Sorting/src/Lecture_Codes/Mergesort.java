package Lecture_Codes;

import java.util.Scanner;

public class Mergesort {
		public static int[] takeinput(){
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int arr[]=new int[size];
			for (int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			return arr;
		}
		public static int[] Mergesort(int []arr1, int []arr2) {
			int size=(arr1.length)+(arr2.length);
			int Sorted[]=new int[size]; 
			int x=0;
			int y=0;
			int i=0;
			while(x<arr1.length && y<arr2.length) {
				if (arr1[x]<arr2[y]) {
					Sorted[i]=arr1[x];
					x++;
					i++;
					
				}else {
					Sorted[i]=arr2[y];
					y++;
					i++;
				}
			}
			while(x<arr1.length) {
				Sorted[i]=arr1[x];
				x++;
				i++;
			}
			while(y<arr2.length) {
				Sorted[i]=arr2[y];
				y++;
				i++;
			}
			return Sorted;
		}
		public static void print(int[] arr) {
			int size=arr.length;
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}		
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] =takeinput();
		int arr2[]=takeinput();
		int arr[]=Mergesort(arr1,arr2);
		print(arr);
	}
}
