package chap06_array;

import chap06_array_obj.car;

public class _04_objArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 객체 배열의 선언
		car[] carArr = new car[3];
		
		//초기화 안된 상태의 배열 인자의 값
		for(int i = 0; i < 3; i++) {
			//초기화 됐으면 주소값이 출력돼야 한다.
			//Car 객체가 인스턴스화 되지 않아서 주소값이 업삳.
			//System.out.println(carArr[i]);
		}
		
		//2. 객체 배열의 초기화
		//객체 배열의 초기화는 생성자를 통한 인서튼스화(객체화)가 필요화
		carArr[0] = new car("기아", "k9", "검정", 4000);
		carArr[1] = new car("현대", "아반떼", "흰", 2000);
		carArr[2] = new car("제네시스", "g80", "빨강", 5000);
		
		for(int i = 0; i < carArr.length; i++) {
			System.out.println(carArr[i]);
			carArr[i].carInfo();
		}
		
		car[] carArr2 = new car[3];
		
		//3. 반복문을 통한 객체 배열의 초기화
		for(int i = 0; i < carArr2.length; i++) {
			carArr2[i] = new car();
			//Car
		}
		
	}

}
