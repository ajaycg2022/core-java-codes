package operations;

public class UnaryOperation {

	public static void main(String[] args) {
		int a=2;
		//System.out.println(a);//no operation 
		//System.out.println(++a); 
		//it will increment a first and then it will print a OP::3
		
		
		
	/*
		  System.out.println(a++); 
		 
		//it will print a first and then it will increament a op:: 2
		System.out.println(a); //increment is done alreay in above statement so op::3
		*/
		//System.out.println(--a);  //op::1
	
		/*
		 *System.out.println(a--);   // op::2
		
		System.out.println(a);     //op will be 1 because it is already decremented
		 */
		
		//System.out.println(~a);// (-2)-1
		
		int b=6;
		/*
		 b+=4;
		System.out.println(a); // add 4 to b op::6
		*/
		
		/*b-=4;
		System.out.println(a); // subtract 4 from b op::2
		*/
		// this is same for multiplication and division
		// c*=4; means c=c*4;
		// d/=4; means d=d/4;
		//e% =4; means e=e%4;
		
	a+=b; // means a=a+b
	
	
	}

}
