package array2D_codes;

import java.util.Scanner;

public class array2D {
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
	public static void waveprint(int input[][]) {
		int rows=input.length;
		for(int i=0;i<rows;i++) {
			int colm=input[i].length;
			for(int j=0;j<colm;j++) {
				if (j%2==0) {
				for(int k=0;k<rows;k++) {
					System.out.print(input[k][j]+" ");
				}
				}else {
					for(int k=rows-1;k>=0;k--) {
						System.out.print(input[k][j]+" ");
					
				}
			}
			}
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][]=take2Dinput();
		waveprint(input);

	}

}
