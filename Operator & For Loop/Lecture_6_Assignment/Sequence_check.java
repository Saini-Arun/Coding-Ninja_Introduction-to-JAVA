package Lecture_6_Assignment;

import java.util.Scanner;

public class Sequence_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[];
		a=new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
					
		}
		int prev=a[0];
		int curr;
		int e=0;
		boolean isDec=true;
		boolean s;
		int f=1;
		int counter=0;
		while(e!=(n-1)) {
			
//			System.out.println(prev);
			
			
			curr=a[f];
			if (prev==curr) {
				System.out.println("False");
				counter=0;
				break;
			}
				if(curr<prev) {
			
				s=true;
				}else {
					s=false;
					}
			
//			System.out.println(isDec);
			prev=curr;
			f++;
			e++;
			if(s!=isDec) {
				counter=counter+1;
			}
			isDec=s;
		
					
		}
		if (counter>1) {
			System.out.println("False");
		}else if (counter==1) {
			System.out.println("true");			
		}
	}
}

/*import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0; int temp=0;
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n-1;i++){
            if(count==0){
                if(num[i]<num[i+1]){
                    count++;
                }
            }
            else if(count==1){
                if(num[i]>=num[i+1]){
                    count++;
                }
            }
            else if(count>1){
                break;
            }
        }
        if(count==0||count==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}*/
