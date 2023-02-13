package chap03_operator;

public class _02_twoOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 대입연산자
		//왼쪽 항의 변수에 오른쪽 항을 값을 대입
		int a = 10; // 왼쪽 a 오른쪽 10
		int b = 6;  // 왼쪽 b 오른쪽 6
		
		//2. 산술 연산자
		int num1 = 30;
		int num2 = 7;
		int result;
		
		System.out.println("num1 = 30");
		System.out.println("num2 = 7");
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
		
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result);
		System.out.println("---------------------------------------");
		
		//3. 복합 대입 연산자
		int num3 = 10;
		int num4 = 3;
		
		System.out.println("num3 = 10");
		System.out.println("num4 = 3");
		
		num3 += num4; //num3 = num3 + num4; => 13
		System.out.println("num3 += num4 " + num3);
		
		num3 -= num4; //num3 = num3 - num4l => 13 - 3 = 10
		System.out.println("num3 -= num4 " + num3);
		
		num3 *= num4; //num3 = num3 * num4; => 10* 3 = 30
		System.out.println("num3 *= num4 " + num3);
		
		num3 /= num4; //num3 = num3 / num4; => 
		System.out.println("num3 /= num4 " + num3);
		
		num3 %= num4;
		System.out.println("num3 %= num4 " + num3);
		System.out.println("-----------------------------------------");
		
		//4. 관계연산자
		int num5 = 100;
		int num6 = 300;
		boolean result2;
		
		System.out.println("num5 = 100");
		System.out.println("num6 = 300");
		
		
		result2 = num5 < num6;
		System.out.println("num5 < num6 = " + result2);
		
		result2 = num5 > num6;
		System.out.println("num5 > num6 = " + result2);
		
		result2 = num5 <= num6;
		System.out.println("num5 <= num6 = " + result2);
		
		result2 = num5 >= num6;
		System.out.println("num5 >= num6 = " + result2);
		
		result2 = num5 != num6;
		System.out.println("num5 != num6 = " + result2);
		
		//4. 논리연산자
		boolean result3;
		
		result3 = 43 >= 81 && 62 <99;;
		System.out.println(" 43 >= 81 && 62 < 99 " + result3); //false
		
		result3 = false || num5 == (num6 / 3);
		System.out.println("false || num5 == (num6 / 3) = " + result3);
		
		System.out.println("!result3 = " + result3); //false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
