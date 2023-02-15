package chap05_class;

public class _03_method {
    static int sum;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //반환타입이 있는 경우 해당 타입의 변수로 값을 받아줘도 된다.
		//그러면 메소드의 결과 값(return 값)이 해당변수에 저장
		int addResult = add(1, 2);
		//반환타입과 다른 타입의 변수로 받을 경우 에러발생
		//강제 형변환을 통해서 변수의 타입과 맞춰주면 다른 타입의 변수로도 받을 수 있다.
		char aaa = (char)add(1, 2);
	    System.out.println("1 + 2 : " + addResult);
	
	    //반환타입이 있기 때문에 바로 출력 가능
	    System.out.println("3 + 4 : " + add(3, 4));
	
	    //void형태는 반환 타입이 없기 때문에 메소드내에서 미리 선언해놓은
	    //전역변수나 static변수에 담아서 사용한다.
	    add(5, 6, 7);
	    System.out.println("5 + 6 + 7 :" + sum);
	}
	
	//메소드 지정
	//같은 클래스에서 사용할 메소드는 static 선언(내일 설명)
	//반환타입이 int여서 return int 형태로 지정
	public static int add(int a, int b) {
		return a + b;		
	}
	
	//오버로딩된 메소드(매개변수의 타입이나 개수가 다르고 메소드의 이름은 같다)
	//void형태로 반환 값이 없는 타입이르몰 return문이 필요없다.
	public static void add(int a, int b, int c) {
		sum = a + b +c;
	}
	
	//곱하기 메소드 만들기(메소드명 : multiple, 반환타입은 long(매개변수 2개),
	//void(매개변수 3개))
	
	long multipleResult = multiple(7, 3);
	public long multiple(long c, long d) {
	//빼기, 나누기(minus(int,void),divide(double,void))
		
	}
	
	
	
	
	
	
	
	
	
	

}
