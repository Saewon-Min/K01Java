package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
파일명 : QuUpDownGame.java

게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.

 */

class NumberRangeException extends Exception{
	
	public NumberRangeException() {
		System.out.println("1 ~ 100 사이의 숫자를 입력해주세요.");
	}
	
	public NumberRangeException(int n) {
		System.out.println("0 과 1 사이의 숫자를 입력해주세요.");
	} 
}




public class QuUpDownGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int comNum = 0 ; 
		
		int cnt = 1;
		int myNum = 0;
		boolean flag = false;
		
		while(true) {
			
			if(cnt==1) {
				System.out.println("업사이드다운 게임을 시작합니다");
				comNum = (int)(Math.random()*100)+1;
				System.out.println("컴퓨터숫자 : "+comNum);
			}
		
			System.out.println("숫자를 입력해주세요: ");
			
			try {
				myNum = scan.nextInt();
			}catch(InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("문자가 입력되었습니다.");
				continue;
			}
			
			try {

				if(myNum<1 || myNum>100) {
					NumberRangeException ex = new NumberRangeException();
					throw ex;					
				}
				
			}catch(NumberRangeException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			
			
			++cnt;
			
			
			if(cnt <= 7) {
				if(comNum == myNum) {
					System.out.println("정답입니다.");					
					flag = true;
					cnt = 8;
				}else if(comNum > myNum){
					System.out.println("정답숫자가 더 커요!");
				}else if(comNum < myNum) {
					System.out.println("정답숫자가 더 작아요!");
				}
			}
			
			if(cnt>7){
				if(flag = false) {
					System.out.println("실패입니다.");
				}
				
				while(true) {
					System.out.print("7번의 게임이 끝났습니다. 게임을 계속하시겠습니까? [재시작(1), 종료(0)] : ");
					
					
					int mynum2 = 0;
					try {
						mynum2 = scan.nextInt();					
						
					}
					catch(InputMismatchException e) {
						scan = new Scanner(System.in);
						System.out.println("숫자를 입력해주세요 : ");
						continue;
					}
					
					try {
						if(mynum2<0 || mynum2>1) {
							NumberRangeException ex = new NumberRangeException();
							throw ex;
						}
					}catch(NumberRangeException e) {
						System.out.println(e.getMessage());
						cnt = 1;
						continue;
					}
					
					
					if (mynum2 == 1) {
						cnt = 1;
						scan.nextLine();
						break;
					} else if(mynum2 == 0){
						System.out.println("게임이 종료되었습니다. 감사합니다.");
						scan.nextLine();
						System.exit(0);
					}
				}
				
				
				
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
