package Assignment;

import java.util.Scanner;

public class Sort012 {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void sort012(int [] arr) {
		int counter0=0;
		int counter1=0;
		int counter2=0;
		int size=arr.length;
		for (int i=1;i<size;i++) {
			if(arr[i]==0) {
				counter0 +=1;
			}else if(arr[i]==1) {
				counter1 +=1;
			}else  {
				counter2 +=1;
			}
		}
		int x=0;
		while(x<counter0) {
			arr[x]=0;
			x++;
		}

		while(x<counter0+counter1) {
			arr[x]=1;
			x++;
		}

		while(x<=counter0+counter1+counter2) {
			arr[x]=2;
			x++;
		}

		
	}
	public static void sort(int arr[]) {
//		int size=arr.length;
//		int nZ=0;
//		int nT=size-1;
//        int i=0;
//		while(i<nT) {
//			if(arr[i]==0) {
//				int temp=arr[i];
//				arr[i]=arr[nZ];
//				arr[nZ]=temp;
//                i++;
//				nZ++;
//			}
//			if(arr[i]==2) {
//				int temp=arr[i];
//				arr[i]=arr[nT];
//				arr[nT]=temp;
//				nT--;
//			}
//            if(arr[i]==1){
//                i++;
//            }
//		}
		int size=arr.length;
		int nZ=0;
		int nT=size-1;
		System.out.println(nT);
//		int i=0;
		for(int i=0;i<size;i++){ 
//		while(i<size){
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[nZ];
				arr[nZ]=temp;
				nZ++;
			}
			if(arr[i]==2) {
				int temp=arr[nT];
				arr[nT]=arr[i];
				arr[i]=temp;
				nT--;
			}
			i++;
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
		int input[]=takeinput();
		sort(input);
		print(input);
//		System.out.println();
//		sort(input);
//		print(input);
//		

	}

}
