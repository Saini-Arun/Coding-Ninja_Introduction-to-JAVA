public class Solution{	
      public static void sort012(int[] arr){
    	
        int n = arr.length;
        int nextZero=0,nextTwo=n-1;
        for(int i=0;i<n;i++)
        {
            if(i>nextTwo){
                break;
            }
            if(arr[i]==0)
            {
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero++;
            }else if(arr[i]==2){
                int temp = arr[nextTwo];
                arr[nextTwo]=arr[i];
                arr[i]=temp;
                nextTwo--;
                i--;
            }
            
        }
    }
}
