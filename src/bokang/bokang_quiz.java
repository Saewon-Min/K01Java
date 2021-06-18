package bokang;

import java.util.Scanner;

/*
시나리오]
정수 5개를 저장할 수 있는 배열을 생성한 후 숫자를 입력받아
저장한다. 단, 숫자가 짝수일때만 순서대로 저장해야하고,
5개를 모두 입력되면 프로그램을 종료한다.
 */
public class bokang_quiz {

	public static void main(String[] args) {

		
		int even ;
		int cnt = 0;
		int[] evenArr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수를 입력하세요.");
		
		while(true) {
			
			even = sc.nextInt();
			if (even %2 == 0) {
				evenArr[cnt] = even;
				System.out.printf("[짝수배열의 %d번째가 입력되었습니다.]",(cnt+1));
				cnt ++;
				
			} else {
				System.out.println("다시 입력해주세요");
			}

			if (cnt==5) {
				break;
			}
			
		}
		System.out.println();
		System.out.println("짝수배열");
		for (int i = 0; i < evenArr.length; i++) {
			
			System.out.print(evenArr[i]+" ");
		}
		
		
	}

}
