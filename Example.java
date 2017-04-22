
import java.util.*;
public class Example {
	public static void main(String[] args) {
		//java 8 lambda expression 
		System.out.println("java 8 Lambda in action");
		Double result1 = Calculator.calculate(30d, 70d, (a, b) -> a + b);
		Double another = Calculator.calculate(4d,6d, (a,b) -> a*b); 
			System.out.println(another) ; 
        		System.out.println(result1); //100.0

	}

}


