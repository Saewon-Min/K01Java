package ex05method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
*/

/*
[선생님코드]
*/


public class E04MethodType03_2 {

	static void inputGugudan(int sNum, int eNum) {
		// 기존 구구단 프로그램을 sNum에서 eNum단까지 출력하는 걸로 변경함.
		for(int dan= sNum ; dan <= eNum ; dan++){
			for(int su=1 ; su <= 9 ; su++){
				System.out.printf("%-2d*%-2d=%2d ",dan,su,(dan*su));
			}
			// 단을 출력한 후 줄바꿈
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// 사용자로부터 시작단, 종료단을 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작 단을 입력: ");
		int startNum = scanner.nextInt();
		System.out.println("종료 단을 입력: ");
		int endNum = scanner.nextInt();
		
		// 입력받은 단을 매개변수로 전달
		inputGugudan(startNum, endNum);
		
	}
	
}
 


/*
[내 코드] 
 
public class E04MethodType03_2 {

	static void inputGugudan(int sNum, int eNum) {

		for(int i =sNum; i<=eNum;i++) {
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d*%d=%d\t", i,j,(i*j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째숫자: ");
		int sNum = scanner.nextInt();
		System.out.println("두번째숫자: ");
		int eNum = scanner.nextInt();
		
		inputGugudan(sNum, eNum);
		
	}
	
}
*/