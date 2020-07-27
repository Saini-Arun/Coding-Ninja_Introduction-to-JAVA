package Array_Assignment;
import java.util.Scanner;
public class Find_Unique {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int size=(2*size1)+1;
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void SearchUnique(int input[]) {
		int size =input.length;
		
		for(int i=0;i<size;i++) {
			int counter=0;
			for(int j=0;j<size;j++) {
				if (input[i]==input[j]) {
					counter++;
				}
			}
			if(counter==2) {
				System.out.println(input[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=takeinput();
SearchUnique(arr);
	}

}
