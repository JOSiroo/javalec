package chap05_class.calc;

import java.util.Scanner;

import chap05_example.DistanceChanger;

public class distanceChangerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner는 String값을 받아준다.
		//String 비교는 equals메소드를 사용한다.
		//String은 jdk에서 제공하는 기본 클래스를 사용하기 때문에
		// == 비교할 시 객체의 동일성(주소 값)을 비교한다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변환될 거리를 입력해주세요(정수) : ");
        long distance = sc.nextLong();
        
        System.out.println("변환할 단위를 입력해 주세요.(cm, mm, km, inch)");
        String unit = sc.next();
        
        //객체생성
        DistanceChanger distan = new DistanceChanger(distance, unit);
       
        //변환된 단위로 출력
        distan.distan();
        
        
	}

}
