package Lecture_Codes;

import java.util.Scanner;

public class Binary_Search {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int Search(int arr[], int num) {
		int size=arr.length;
		int start=0;
		int end=size;
		int mid=0;
		while(start<=end) {
			 mid=(int)((start+end)/2);
			 if(num!=arr[mid] && start==end) {
				 return-1;
			 }else {
//			 System.out.println(mid);
			if(num==arr[mid]) {
				break;
			}else if(arr[mid]>num) {
				end=mid-1;
			}else if(arr[mid]<num) {
				start=mid+1;
			}		
			
		}
		}
		
		System.out.println(arr[mid]);
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrr[]=takeinput();
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int sol=Search(arrr,x);
		System.out.println(sol);

	}

}
