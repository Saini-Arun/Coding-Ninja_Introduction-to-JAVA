package array2D_codes;

import java.util.Scanner;

public class spiralprint {
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
	public static void spiralprint(int input[][]) {
		int rowend=input.length;
		int colmend=input[0].length;
		int rowstart=0;
		int colmstart=0;
		while(rowstart<rowend && colmstart<colmend) {
		for(int i=colmstart;i<colmend;++i) {
			System.out.print(input[rowstart][i]+" ");
		}
		rowstart++;
		for(int i=rowstart;i<rowend;++i) {
			System.out.print(input[i][colmend-1]+" ");
		}
		colmend--;
		if(rowstart<rowend) {
			for(int i=colmend-1;i>=colmstart;--i) {
				System.out.print(input[rowend-1][i]+" ");
			}
			rowend--;
		}
		if(colmstart<colmend) {
			for(int i=rowend-1;i>=rowstart;--i) {
				System.out.print(input[i][colmstart]+" ");
			}
			colmstart++;
		}		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][]=take2Dinput();
		spiralprint(input);

	}

}
