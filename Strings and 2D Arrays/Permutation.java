package Assignment;

import java.util.Scanner;

public class Permutation {
	public static boolean permutation(String input1, String input2) {
//        int l1= input1.length();
//		int l2=input2.length();
//        if(l1!=l2)return false;
//        
//        int freq[]= new int[256];
//        
//        for(int i=0;i<l1;i++){
//            int ascii=(int)(input1.charAt(i));
//            freq[ascii]++;
//        }
//        for(int i=0;i<l2;i++){
//            int ascii=(int)(input2.charAt(i));
//            freq[ascii]--;
//        }
//        
//        for(int i=0;i<freq.length;i++){
//            if(freq[i]!=0)return false;
//        }
//        return true;
		int l1= input1.length();
		int l2=input2.length();
		int counter=0;
		boolean check=false;
		for(int i=0;i<l1;i++) {
			char ch1=input1.charAt(i);
			for (int j=0;j<l2;j++) {
				char ch2=input2.charAt(j);
				if (ch1==ch2) {
					counter+=1;
				}
			}
		}
		if(counter==l1) {
			return check=true;
		}
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(permutation(str1, str2));

	}

}
