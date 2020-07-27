package array2D_codes;

import java.util.Scanner;

public class largest_inRC {
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
	public static void findLargestSum(int input[][]) {
		int largestR= Integer.MIN_VALUE;
		int largestC= Integer.MIN_VALUE;
		int numR=Integer.MIN_VALUE;
		int numC=Integer.MIN_VALUE;
		int rows=input.length;
		for(int i=0;i<rows;i++) {
			int colm=input[i].length;
			int sum=0;
			for(int j=0;j<colm;j++) {				
				sum=sum+input[i][j];
				if(sum>largestR) {
					largestR=sum;
					numR=i;
				}	
			}
		}
		for(int i=0;i<rows;i++) {
			int colm=input[i].length;
			
			for(int j=0;j<colm;j++) {
				int sum=0;
				for(int k=0;k<rows;k++) {
				sum=sum+input[k][j];
				if(sum>largestC) {
					largestC=sum;
					numC=i;
				}	
			}
			}
		}
		if(largestC>largestR) {
			System.out.println("column "+numC+" "+largestC);
		}else {
			System.out.println("row "+numR+" "+largestR);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][]=take2Dinput();
		findLargestSum(input);

	}

}
