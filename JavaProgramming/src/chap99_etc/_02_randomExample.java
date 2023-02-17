package chap99_etc;

import java.util.Scanner;

public class _02_randomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컴퓨터는 1 ~ 3 까지의 랜덤생성
		int num = ((int)(Math.random() * 3) + 1);
		System.out.println(num);
		//사용자가 1 ~ 3까지 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 3 사이의 정수 하나 입력 : ");
	       int num1 = sc.nextInt();
		
	       //사용자가 입력한 값이 컴퓨터가 생성한 랜덤 값과 같으면
		//"맞췄습니다." 출력 아니면
		// "틀렸습니다." 출력
	       if(num1 == num) {
	       System.out.println("맞췄습니다.");
	       } else {
	    	   System.out.println("틀렸습니다");
	       }
	

	}
}
