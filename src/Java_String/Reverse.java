package Java_String;

public class Reverse {
	public static void main(String[] args) {
		
		String s="Selenium";
		String rev="";
		int s1=s.length();
		System.out.println(s1);
		for (int i=s1-1;i>=0;i--){
			rev=rev+ s.charAt(i);
			
		}
			System.out.println(rev);
	}

}
