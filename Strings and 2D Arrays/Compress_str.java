public class Solution {

	public static String compress(String inputString) {
		// Write your code here
		int count = 1;
        StringBuilder builder = new StringBuilder();

        for(int i = 1; i<inputString.length(); i++){

            if(inputString.charAt(i) == inputString.charAt(i-1) && i < inputString.length()-1){
                count++;
            }
            else if(i == inputString.length()-1 && inputString.charAt(i) == inputString.charAt(i-1)){
                count++;
                builder.append(inputString.charAt(i));
                if (count>1) {
                    builder.append(count);
                    }
            }
            else if(i == inputString.length()-1 && inputString.charAt(i) != inputString.charAt(i-1)){
                builder.append(inputString.charAt(i-1));
                if (count>1) {
                    builder.append(count);
                    }
                count = 1;
                builder.append(inputString.charAt(i));
                if (count>1) {
                    builder.append(count);
                    }
            }
            else{
                builder.append(inputString.charAt(i-1));
                if (count>1) {
                builder.append(count);
                }
                count = 1;
            }

        }

        inputString = builder.toString();

        return inputString;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abbcccddddaaa";
		System.out.println(stringcompression(str));

	}

}
