package ex06array;

import java.util.Scanner;

/*
문제3) 파일명 : QuSungJuk.java
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

실행결과]
학생수를 입력하세요?3
학생수:3
[1번째 학생의 점수 입력]
국어점수 입력?77
영어점수 입력?78
수학점수 입력?79
[2번째 학생의 점수 입력]
국어점수 입력?82
영어점수 입력?83
수학점수 입력?84
[3번째 학생의 점수 입력]
국어점수 입력?97
영어점수 입력?98
수학점수 입력?99
==========================
NO KOR ENG MAT TOT AVG
==========================
1  77  78  79  234 78.00
2  82  83  84  249 83.00
3  97  98  99  294 98.00
==========================

 */

// [선생님코드]

public class QuSungJuk {
	public static void main(String[] args) {
		
		
		
		
		
		
		
	}
}

/*
[내 코드]
public class QuSungJuk {
	
	
	static int total(int[][] stuArr,int kor, int eng, int math) {
		
		for (int i = 0; i < stuArr.length; i++) {
			
			for (int j = 0; j < stuArr[i].length; j++) {
				stuArr[i][0] = kor;
				stuArr[i][1] = eng;
				stuArr[i][2] = math;
			}
		}
		int tot = (kor+eng+math); 
		return tot;
	}
	
	static double avg(int[][] stuArr,int kor, int eng, int math) {
		
		for (int i = 0; i < stuArr.length; i++) {
			
			for (int j = 0; j < stuArr[i].length; j++) {
				stuArr[i][0] = kor;
				stuArr[i][1] = eng;
				stuArr[i][2] = math;
			}
		}
		double avg = (kor+eng+math)/3.0; 
		return avg;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수를 입력하세요? ");
		int studentNum = scanner.nextInt();
		System.out.printf("학생수 : %d\n",studentNum);
		
		int[][] stuArr = new int[studentNum][3];
		
		int[][] stuTotalArr = new int[studentNum][6];
		
		for (int i = 0; i < stuArr.length; i++) {
			System.out.printf("\n[%d번째 학생의 점수 입력]\n", i+1);
			System.out.print("국어점수 입력?");
			int kor = scanner.nextInt();
			System.out.print("영어점수 입력?");
			int eng = scanner.nextInt();
			System.out.print("수학점수 입력?");
			int math = scanner.nextInt();
	
//			System.out.printf("%d %d %d %d %d %.2f",i , kor,eng,math,
//					total(stuArr,kor,eng,math),avg(stuArr,kor,eng,math));
			for (int j = 0; j < stuTotalArr[i].length; j++) {
				stuArr[i][0] = kor;
				stuArr[i][1] = eng;
				stuArr[i][2] = math;
				// studentNum[i][j] = 
				if (i == studentNum) {
				stuTotalArr[i][j] = 123 ;
				} 
			}
			
			
		}
		
		
		
		
	}

}
*/