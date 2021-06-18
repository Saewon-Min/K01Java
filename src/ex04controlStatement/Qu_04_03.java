package ex04controlStatement;

import java.util.Scanner;

/*
국어, 영어, 수학 점수를 사용자로부터 입력받아서 평균을 구해  
	90점이상 A학점, 
	80점이상 B학점,
	....
	60점미만 F학점을 출력하는 프로그램을 작성하시오.
단 switch문을 사용해야 합니다.(Scanner클래스를 사용하세요)

	99/10 = 9 , 91/10 = 9
	88/10 = 8 , 80/10 = 8
			.
			.
			.

 */
public class Qu_04_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		System.out.print("국어: ");
		int kor = scanner.nextInt();
		System.out.print("영어: ");
		int eng = scanner.nextInt();
		System.out.print("수학: ");
		int math = scanner.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		int grade = (int)(avg/10);  // <= 핵심포인트(10으로 나눈 몫으로 구간을 정함)
	
		switch (grade) {
		case 10:  case 9: 
//			System.out.printf("국어:%d%n영어:%d%n수학:%d%n평균:%d%n학점:A",
//					kor,eng,math,avg);
			System.out.printf("평균:%d%n학점:A",avg);
			break;
		case 8:
//			System.out.printf("국어:%d%n영어:%d%n수학:%d%n평균:%d%n학점:B",
//					kor,eng,math,avg);
			System.out.printf("평균:%d%n학점:B",avg);
			break;
		case 7:
//			System.out.printf("국어:%d%n영어:%d%n수학:%d%n평균:%d%n학점:C",
//					kor,eng,math,avg);
			System.out.printf("평균:%d%n학점:C",avg);
			break;
		case 6:	
//			System.out.printf("국어:%d%n영어:%d%n수학:%d%n평균:%d%n학점:D",
//					kor,eng,math,avg);
			System.out.printf("평균:%d%n학점:D",avg);
			break;
		default:
//			System.out.printf("국어:%d%n영어:%d%n수학:%d%n평균:%d%n학점:F",
//					kor,eng,math,avg);
			System.out.printf("평균:%d%n학점:F",avg);
		}
		
		
		
	}

}
