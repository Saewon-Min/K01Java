package ex04controlStatement;


/*
문제4] 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
 */
public class Qu_04_09 {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 2; j <=9; j++) {
				System.out.printf("%d*%d=%d",j,i,(i*j));
				System.out.print("\t");
				
			}
			System.out.println();
		}
	}

}
