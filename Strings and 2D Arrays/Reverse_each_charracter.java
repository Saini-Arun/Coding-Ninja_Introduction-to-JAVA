package Assignment;

public class Reverse_each_charracter {
	public static String ECR(String input) {
		String out="";
		char ch[]=new char[input.length()];
		char outa[]=new char[input.length()];
		int end=input.length();
		int s=0;
		int e=0;
		int f=0;
		for(int i=0;i<input.length();i++) {
			ch[i]=input.charAt(i);
			if(ch[i]==' '){
				e=i;
				f=i;
				for(int k=s;k<e;k++) {
					outa[k]=ch[f-1];
					f--;
				}
				outa[i]=(char)' ';
				s=i+1;
			}
			if (i==input.length()-1) {
				e=i;
				f=i;
				for(int k=s;k<=e;k++) {
					outa[k]=ch[f];
					f--;
				}
			}
		}
		for(int l=0;l<input.length();l++) {
			out=out+outa[l];
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="emocleW ot gnidoC sajniN";
		System.out.println(ECR(str));

	}
}
