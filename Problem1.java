package firstroundinterview;

import java.util.Scanner;

import firstroundinterview.Calculator;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a =sc.nextInt();
		System.out.println("enter the value of b :");
		int b=sc.nextInt();
		System.out.println("enter the operations(+,-,*,/) :");
		String operator=sc.next();
		int c=0;
		Calculator obj= new Calculator(a,b);
		switch(operator) {
		case "+":
		     c=obj.add();
		     break;
		case "-":
			c=obj.sub();
			break;
		case "*":
			c=obj.mul();
			break;
		case "/":
			c=obj.div();
			break;
			default:System.out.println("invalid input");
		}
		System.out.println(a +operator+ b + "="+c);
}
	}



class  Calculator {
	int a,b;
	Calculator(int a, int b){
		this.a = a;
		this.b = b;
	}
	int add() {
		return a+b;
	}
	int sub() {
		return a-b;
	}
	int div() {
		return a/b;
	}
	int mul() {
		return a*b;
	}
}
