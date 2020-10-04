package Java_String;

public class IntReverse {

	public static void main(String[] args) {
		
		/*  By algorithm
	 	int no=12345;
		int rev=0;
		while(no!=0){
			rev=rev*10+no%10;  // rev=5
			no=no/10;// no=1234 and so on.....123....12...1			
		}
			System.out.println(rev);

	*/
		/* By StringBuffer class
		 
		 */
	
		long no=12345;
		System.out.println(new StringBuffer(String.valueOf(no)).reverse());
	}

}
