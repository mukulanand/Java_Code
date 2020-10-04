package Java_String;

public class ReplaceSpecialChar {
	public static void main(String[] args) {
		String s="@#$%Selenium&*()World102456";
		//regular expression=["^a-zA-Z0-9"]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
