package ex04controlStatement;


/*
문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
 */
public class Qu_04_08 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 5; i<=j; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
