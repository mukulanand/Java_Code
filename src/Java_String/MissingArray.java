package Java_String;

public class MissingArray {
	public static void main(String[] args) {
		int arr[]={1,2,4,5,6};
		//1+2++4+5+6=18
		//1+2+3+4+5+6=21
		//21-18=3
		int sum=0;
		int sum1=0;	
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];			
	}
			System.out.println(sum);
		
		
		for(int j=1;j<=6;j++){
			sum1=sum1+j;
	}	
		System.out.println(sum1);
		System.out.println("The Missing no is-->" + (sum1-sum));
	}

}
