package firstjava;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
System.out.print("enter C to convert Celsius into Fahrenheit");
		
System.out.println(" or enter F to convert Fahrenheit into Celsius");
Scanner CF = new Scanner(System.in);


String choice = CF.nextLine();
if (choice.equals("C") || choice.equals("c")) { 
System.out.println("enter temp in Celsius temp");
double temp = CF.nextDouble();
System.out.println(9*temp/5 + 32);
}else if (choice.equals("F") || choice.equals("f")){
	System.out.println("enter temp in Fahrenheit temp");
	double temp = CF.nextDouble();
	temp = 5*(temp-32)/9;
	System.out.println(temp);
}else {
	System.out.println("invalad");
}
	}
}
