package chap05_class;

public class _04_inputCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
       System.out.println("정수 하나 입력 : ");
       int num1 = sc.nextInt();
       
       System.out.println("정수 하나 입력 : ");
       int num2 = sc.nextInt();
       
       System.out.println("사칙연산 중 하나 선택(+, -, *, / : ");
       String op = sc.next();
       
       switch(op) {
       case "+" :
    	   System.out.println((num1 + " " + op + " " + num2 + " = " + add(num1, num2)));
    	   break;
       case "-" :
    	   System.out.println((num1 + " " + op + " " + num2 + " = " + minus(num1, num2)));
    	   break;
       case "*" :
    	   System.out.println((num1 + " " + op + " " + num2 + " = " + multiple(num1, num2)));
    	   break;
    
       }
       
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int minus(int a, int b) {
		return a - b;
	}
	
	public static long multiple(int a, int b) {
		
	}
	
	
	
}
