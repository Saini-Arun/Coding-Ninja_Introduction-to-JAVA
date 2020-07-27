package array2D_codes;

import java.util.Scanner;

public class Row_wiseSum { 
	public static int[][] take2Dinput() {
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		int colm=sc.nextInt();
		int arr[][]=new int[rows][colm];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colm;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void Rossum(int input[][]) {
		int rows=input.length;
		for(int i=0;i<rows;i++) {
			int colm=input[i].length;
			int sum=0;
			for(int j=0;j<colm;j++) {				
				sum=sum+input[i][j];				
			}
			System.out.print(sum+" ");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=take2Dinput();
//		int colm=arr[0].length;
//		System.out.println(colm);
		Rossum(arr);

	}

}
