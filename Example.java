
import java.util.*;
public class Example {
	public static void main(String[] args) {
		//java 8 lambda expression 
		System.out.println("java 8 Lambda in action");

		System.out.println("********************************************");
		Double addition = Calculator.calculate(323d, 767d, (a, b) -> a + b);
		Double mult = Calculator.calculate(323d,767d, (a,b) -> a*b); 
			System.out.println("java 8 addition");
			System.out.println(addition) ; 
			System.out.println("java 8 multiplication");
			System.out.println(mult);

	}

}


