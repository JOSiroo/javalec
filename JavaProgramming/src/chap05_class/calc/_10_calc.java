package chap05_class.calc;

import java.util.Scanner;

import chap05_example.Calculator;

public class _10_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	       System.out.println("정수 하나 입력 : ");
	       int num1 = sc.nextInt();
	       
	       System.out.println("정수 하나 입력 : ");
	       int num2 = sc.nextInt();
	       
	       System.out.println("사칙연산 중 하나 선택(+, -, *, / : ");
	       String op = sc.next();
	       
	      Calculator calc = new Calculator(num1, num2, op);
	       
	      //결과 출력
		calc.calc();
	}

}
