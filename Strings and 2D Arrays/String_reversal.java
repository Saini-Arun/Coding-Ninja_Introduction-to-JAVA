package Lecture_codes;

public class String_reversal {
	public static void stringreverse(String str) {
		char ch[]=new char[str.length()];
		int end=str.length();
		int start=0;
		for(int i=str.length()-1; i>=0;i--) {
			ch[i]=str.charAt(i);
			if(ch[i]==' '){
				start=i+1;
				System.out.print(str.substring(start, end)+" ");
				end=i;
			}
			if(i==0) {
				System.out.println(str.substring(i,end));
			}
	}
	}
	// for complete reversed string output at once
	public static String wordwisereverse(String str) {
		String sortedstr="";
		char ch[]=new char[str.length()];
		int end=str.length();
		int start=0;
		for(int i=str.length()-1; i>=0;i--) {
			ch[i]=str.charAt(i);
			if(ch[i]==' '){
				start=i+1;
				String temp=str.substring(start, end);
				sortedstr=sortedstr+temp;
				sortedstr=sortedstr+" ";
				end=i;
			}
			if(i==0) {
				String temp=str.substring(i, end);
				sortedstr=sortedstr+temp;
			}
	}
		return sortedstr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Khan";
//		String str2=" 123";
//		str=str+str2;
		str=wordwisereverse(str);
		System.out.println(str);

	}

}
