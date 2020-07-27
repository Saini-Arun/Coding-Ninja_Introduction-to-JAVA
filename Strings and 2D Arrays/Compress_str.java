package Assignment;

public class Compress_str {
	public static String stringcompression(String str) {
		int count = 1;
        StringBuilder builder = new StringBuilder();

        for(int i = 1; i<str.length(); i++){

            if(str.charAt(i) == str.charAt(i-1) && i < str.length()-1){
                count++;
            }
            // case when the last letter is in the sequence preceding it. Add that sequence to
            // the compressed string
            else if(i == str.length()-1 && str.charAt(i) == str.charAt(i-1)){
                count++;
                builder.append(str.charAt(i));
                if (count>1) {
                    builder.append(count);
                    }
            }

            // case where the last letter is NOT in the sequence preceding it. Add it to string.
            else if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
                builder.append(str.charAt(i-1));
                if (count>1) {   
                    builder.append(count);
                    }
                count = 1;
                builder.append(str.charAt(i));
                if (count>1) {
                    builder.append(count);
                    }
            }
            else{
                // appending the character and THEN appending the count works.
                builder.append(str.charAt(i-1));
                if (count>1) {
                builder.append(count);
                }
                count = 1;
            }

        }

        str = builder.toString();

        return str;
      }
//      for(int j=1;j<length;j++) {
//    	  int ascii=(int)(inputString.charAt(j-1));
//    	  char ch=inputString.charAt(j-1);
//    	  char nextch=inputString.charAt(j);
//    	  if (nextch!=ch || j==length-1) {
//    		  newstr=newstr+ch;
//    		  if(freq[ascii]>1) {
//    			  newstr=newstr+freq[ascii];
//    		  }
//    	  }
//      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abbcccddddaaa";
		System.out.println(stringcompression(str));

	}

}
