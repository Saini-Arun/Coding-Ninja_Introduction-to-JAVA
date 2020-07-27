package Array_codes;
import java.util.Scanner;
public class Linear_search {
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int linearSearch (int input[]){
		Scanner n=new Scanner(System.in);
		int element=n.nextInt();
		int size=input.length;
		for (int i=0;i<size;i++) {
			if(element==input[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeinput();
		int n=linearSearch(arr);
		System.out.println(n);
		

	}

}
