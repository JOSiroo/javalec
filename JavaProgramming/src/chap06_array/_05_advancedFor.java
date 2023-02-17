package chap06_array;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 98, 76, 85, 65};
		int sum = 0;
		double avg;
		
		for(int s : score) {
			System.out.println(s);
			sum += s;
		}
		
		System.out.println("정수의 총합 : " + sum);
		
		avg = (double)sum / score.length;
		
		System.out.println("평균 점수 : " + avg);

	}
	

}
