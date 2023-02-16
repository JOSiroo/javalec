package chap05_class;

import chap05_example.Operation;       //Chap05_example.Operation 임포트 함

public class _08_localGlobalVariables {
    //전역 변수
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Operation op = new Operation();
       
       //지역변수 result2는 add메소드가 종료되면 사라지기 때문에
       //기존에 연산됐던 값도 함게 삭제된다
       System.out.println(op.add(1, 2));
       System.out.println(op.add(3, 4));
       
       
       //전역변수로 선언도니 result1이 객체가 삭제되기 전까지는
       //존재하기 때문에 바뀐 값을 계속 기억하고 있다
       //result1에 3더하고 그게 남은상태로 4를 더함
       System.out.println(op.add(3));
       System.out.println(op.add(4));
       //내가 한거.
       System.out.println(op.add(1) + op.add(1, 4));
       

	}
	
	
}


                        