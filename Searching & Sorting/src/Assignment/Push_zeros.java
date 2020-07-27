package Assignment;

import java.util.Scanner;

public class Push_zeros {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int[] pushZeros(int[] arr) {
		int size=arr.length;
		int temp[]=new int[size];
		int k=0;
		for (int i=0;i<size;i++) {
			
			if(arr[i]!=0) {
				temp[k]=arr[i];
				k++;
			}
		}
		while(k<size) {
		
			temp[k]=0;
			k++;
		}
		return temp;
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
		input=pushZeros(input);
		print(input);

	}

}
//for (int i=0;i<size;i++) {
//if(arr[i]==0) {
//	for(int j=i+1;j<size;j++) {
//		int temp = arr[j];
//		arr[j]=arr[j-1];
//		arr[j-1]=temp;
//	}
//}			
//}

//{TA's Code 
//int j=0;
//for(int i=0;i<arr.length;i++){
//    if(arr[i]!=0){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        j++;
//    }
//}