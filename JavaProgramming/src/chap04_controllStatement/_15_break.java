package chap04_controllStatement;

public class _15_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i = 0; i < 10; i++) {
        	if(i == 6) {
        		//break문을 만나서 for문을 종료시킴
        		break;
        	}
        	System.out.println(i);
        }
		
        int num = -1;
        while(++num < 10) {
        	if(num == 6) {
        		//break문을 만나서 for문을 종료시킴
        		break;
        	}
        	System.out.println(num);
        }
        System.out.println("----------------------------------");
        //중첩 for문에서 break나 continue를 사용할 경우 break되거나 continue
        //원하는 반복문의 블록을 잘 파악해서 사용한다.
        //구구단중에서 5단까지만 출력, 4단은 제외
        for(int i = 2; i <= 9; i++) {
        	if(i > 6) {
        		break;
        	}
        	if(i == 4) {
        		continue;
        	}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i +" * " + j + " = " + i * j);
			}
		    //엔터 값으로 단이 끝난것을 표시
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
