package Assignment;

public class Remove_Char {
	public static String RC(String input, char c) {
		int length=input.length();
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<length;i++) {
			if(c!=input.charAt(i)) {
				builder.append(input.charAt(i));
			}
		}
		input=builder.toString();
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manisha khattar";
		char c='a';
		System.out.println(RC(str,c));

	}

}
