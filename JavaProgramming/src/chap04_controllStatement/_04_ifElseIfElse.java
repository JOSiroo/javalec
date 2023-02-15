package chap04_controllStatement;

import java.io.IOException;

public class _04_ifElseIfElse { 

	public static void main(String[] args) throws IOException	 {
		// TODO Auto-generated method stub
		System.out.println("점수입력 : ");
		int score = System.in.read();
       //95점 이상 A+
       //95점 미만 A0
        if(score >= 90) {
        	if(score >= 95)
        		System.out.println("A+학점 입니다.");
        	else
        		System.out.println("A0학점 입니다.");
        }
       //85점 이상 B+
       //85점 미만 B0 
        if(score >= 80) {
        	if(score >= 85)
        		System.out.println("B+학점 입니다.");
        	else
        		System.out.println("B0학점 입니다.");
        }
       //75점 이상 C+
       //75점 미만 C0
        if(score >= 70) {
        	if(score >= 75)
        		System.out.println("c+학점 입니다.");
        	else
        		System.out.println("c0학점 입니다.");
        }
       //65점 이상 D+
       //65점 미만 D0
        if(score >= 60) {
        	if(score >= 65)
        		System.out.println("D+학점 입니다.");
        	else
        		System.out.println("D0학점 입니다.");
        }
        
        
	}

}
