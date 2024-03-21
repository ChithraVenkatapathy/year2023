package exceptionhandling;

import javax.management.RuntimeErrorException;

public class exceptionhandling {
	
	public static void main(String args[]) throws AgeValidate {
	//	agevalidatebyage(18);
		agevalidatebyage(0);
	}
	private static  void agevalidatebyage(int age) throws AgeValidate,CustomRuntimeException{
		try {
			int agearr[]=new int[5];
			agearr[4]=0;
		//	System.out.println(agearr[4]);
			if (age == 18) {
				System.out.println("valid age to vote");
			}
		 if(agearr[5]== 0) {
				throw new AgeValidate("array index");
		}
				try {
				if(12/age == 0) {
					throw new AgeValidate("Age must be greaterthan zero");
				}
			}catch(ArrayIndexOutOfBoundsException qe){
				throw new CustomRuntimeException("array index out of bound", qe.getCause());
			}			
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			//System.out.println("Array index out of boundary exception");
			throw new CustomRuntimeException("array index out of bound", ae.getCause());

		}catch(ArithmeticException ae) {
			
			throw new RuntimeException();
		
			//throw new AgeValidate("divisible by zero");
		}finally {
			//System.exit(0);
			System.out.println("Finally block exceuted");
		}		
		
		
	}

}
