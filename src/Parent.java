
public class Parent {

	// class-->>the file where you actually write your java codes
	// pink words are java keywords
	// the lines with two slashes are called comments
	
	public static void main(String[] args) {
		//main-->from where the control and execution will begin

	//	int a=10;
	//	int b=20;
	//	a=a+b;
	//	b=a;
		
	//	System.out.println(b);
		// when u print something without double quotes, java take it as the variable
		//if u want to concatenate string and variable, u can use + operator
		//System.out.println("sum is "+ b);
		System.out.println("I navigated to homepage");
		
		Method m=new Method();
		//new in java is memory allocator
		m.validateHeader();
		//Syntax is classObject.method name
     System.out.println(m.validateHeader());
     //here it will also return u the value 10
	}

}
