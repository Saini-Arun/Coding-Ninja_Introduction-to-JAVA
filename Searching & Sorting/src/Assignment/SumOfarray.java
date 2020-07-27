package Assignment;

import java.util.Scanner;

public class SumOfarray {
	public static int[] sumOfarrayMastercode(int[]arr1, int arr2[]) {
		 int size1=arr1.length;
	        int size2=arr2.length;
	        int size=0;
	        if (size1>size2) {
	            size=size1+1;
	        }else {
	            size=size2+1;
	        }
	        int finalarr[]=new int[size];
	        finalarr[0]=0;
	        int carry=0;
	        int LSB=0;
	        int sum=0;
	        int index1=size1-1;
	        int index2=size2-1;
	        int index=size-1;
 while(index1>-1 || index2>-1) {
                
                if(index1>-1 && index2>-1){
                    sum=arr1[index1]+arr2[index2]+carry;
                }else if(index2<0) {
                    sum=arr1[index1]+carry;
                }else if(index1<0){
                    sum=arr2[index2]+carry;
                }
                if(sum>=10){
                     LSB=sum%10;
                    carry=sum/10;
                    finalarr[index]=LSB;			
                    index--;
                    index2--;
                    index1--;
                }else{
                    LSB=sum;
                    finalarr[index]=LSB;
                    carry=0;
                    index1--;
                    index2--;
                    index--;
                }
                

 }
 return finalarr;

}
	public static int[] takeinput(){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void print(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}		
	}
public static int[] sumOfarray(int[]arr1, int arr2[]) {
	int size1=arr1.length;
	int size2=arr2.length;
	int size=0;
	if (size1>size2) {
		size=size1+1;
	}else {
		size=size2+1;
	}
	int finalarr[]=new int[size];
	finalarr[0]=0;
	int carry=0;
	int LSB=0;
	int sum;
	int index1=size1-1;
	int index2=size2-1;
	int index=size-1;
	if (size1>size2) {
	while(index1>-1) {
		while(index2>-1) {
			sum=arr1[index1]+arr2[index2]+carry;
			LSB=sum%10;
			carry=sum/10;
			finalarr[index]=LSB;			
			index--;
			index2--;
			index1--;		
	}
		if(index2<0) {
		sum=arr1[index1]+carry;
		LSB=sum%10;
		carry=sum/10;
		index1--;
	}
		finalarr[index]=LSB;
		index--;
	}
	
	
}else if (size2>size1) {
	while(index2>-1) {
		while(index1>-1) {
			sum=arr1[index1]+arr2[index2]+carry;
			LSB=sum%10;
			carry=sum/10;
			finalarr[index]=LSB;			
			index--;
			index2--;
			index1--;		
	}
		if(index1<0) {
		sum=arr1[index2]+carry;
		LSB=sum%10;
		carry=sum/10;
		index2--;
	}
		finalarr[index]=LSB;
		index--;
	}
	
}else {
	while(index1>-1 && index2>-1) {
		sum=arr1[index1]+arr2[index2]+carry;
		LSB=sum%10;
		carry=sum/10;
		finalarr[index]=LSB;			
		index--;
		index2--;
		index1--;		
}
	
}
	finalarr[0]=carry;
	return finalarr;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] =takeinput();
		int arr2[] =takeinput();
 		int output[]=sumOfarray(arr1,arr2);
 		System.out.println();
 		print(output);
	}

}
