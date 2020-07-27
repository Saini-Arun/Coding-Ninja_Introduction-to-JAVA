package Array_Assignment;
import java.util.Scanner;
public class Intersection {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void intersection(int input1[],int input2[]) {
		int size=input1.length;
		int size1=input2.length;
		if(size1>=size) {
			int x=0;
			for (int i=0;i<size;i++) {
			for(int j=0;j<size1;j++) {
				if (input1[i]==input2[j]) {
					
					System.out.println(input1[i]);
					input2[j]=0;
					break;
				}
			}
		}
	}else {
		for (int i=0;i<size1;i++) {
			for(int j=0;j<size;j++) {
				if (input2[i]==input1[j]) {
					System.out.println(input2[i]);
					input1[j]=0;
					break;
				}
			}
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		int arr1[]=takeinput();
		intersection(arr,arr1);
		

	}

}
