package chap99_etc;

import java.util.Scanner;

public class _03_rockScissoPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//몇승 먗무 몇패인지 셀 변수
				int win = 0;
				int lose = 0;
				int draw = 0;
				
				//승점 담아줄 변수(승:1, 무:0, 패:-1)
				int score = 0;
				
				//승무패 기록을 담아줄 배열
				int[] wdl = new int[10];
				
				for(int i = 0; i < wdl.length; i++) {
				
				//컴퓨터는 1 ~ 3 까지의 랜덤 변수 발생(1:가위, 2:바위, 3:보)
				int randomVal = ((int)(Math.random() * 3) + 1);
				//사용자가 1 ~ 3까지 입력
				Scanner sc = new Scanner(System.in);
				System.out.println("가위, 바위, 보 중 하나 입력 : ");
			       String userNumStr = sc.nextLine();
			       int userNum;
			       
			       if(userNumStr.equals("가위")) {
			    	   userNum = 1;
			       } else if(userNumStr.equals("바위")) {
			    	   userNum = 2;
			       } else if(userNumStr.equals("보")) {
			    	   userNum = 3;
			       } else {
			    	   System.out.println("잘못 입력하셨습니다.");
			    	   //해당 게임을 다시 진행하기 위해 1 감소
			    	   //for문에서 continue문을 만나면 증감식으로 이동하기 때문
			    	   i--;		    		      
			       }
			       continue;       			
				}	
				if(randomVal == )
	}
}		  
			       
	


