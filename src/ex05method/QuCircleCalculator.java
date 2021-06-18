package ex05method;

import java.util.Scanner;

/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.

메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름


실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985


 */


// [선생님코드]
public class QuCircleCalculator {
	// 원의 넓이와 둘레는 원주율 3.14를 곱해야 하므로
	// 반환형은 실수로 정의한다.
	
	//넓이
	static double circleArea(double r) {
		double result = 3.14*r*r;
		return result;
	}
	
	//둘레
	static double circleRound(double r) {
		return 2*3.14*r;
	}
	
	public static void main(String[] args) {
		System.out.println("원의 넓이: "+circleArea(5.5));
		System.out.println("원의 넓이: "+circleRound(5.5));
		
		
	}
	
	
}


/*
[내 코드]
public class QuCircleCalculator {

	static void circleArea(double r) {
		final double PI = 3.14;
		double area = PI*r*r;
		System.out.printf("원의 넓이(%f) : %f%n",r,area);
		
	}
	
	static void circleRound(double r) {
		final double PI = 3.14;
		double round = 2*PI*r;
		System.out.printf("원의 둘레(%f) : %f%n",r,round);
		
	}
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 반지름을 입력해주세요.");
		double r = scanner.nextDouble();
		
		circleRound(r);
		circleArea(r);
	}

}
*/