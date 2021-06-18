package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/*
파일명 : QuRockPaperScissors.java
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

실행결과]
무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 1
사용자 : 가위, 컴퓨터 : 보
이겼습니다.

무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 4
가위바위보 할줄 모르세요? 제대로 내세요^^;

….게임진행...

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 1

….게임재시작…

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 0
게임이 종료되었습니다. 감사합니다.

….게임종료….

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 5
잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요…..

////////////////////////////////////////////////////////////////////

가위바위보 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오
숫자대신 문자를 입력할 경우 발생되는 예외를 처리하시오. (가위바위보 입력시, 재시작여부 입력시)
게임과 관련없는 숫자를 입력했을때 사용자정의 예외클래스를 통해 처리하시오.
예외처리 클래스명 : WrongNumberException



 */
// 예외처리는 inputmissmatch

class WrongNumberException extends Exception {
	

	
	public WrongNumberException() {
		super("1-3사이의 숫자를 입력해주세요.");
		
	}

	public WrongNumberException(int n) {
		super("0과 1사이의 숫자를 입력해주세요.");
		
	}
}


public class QuRockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int comnum = 0; 
		int cnt = 0;
		int mynum=0;
		
		while(true) {
			
			try {
				comnum = random.nextInt(3)+1;
				switch(comnum) {
					case 1 : System.out.println("컴퓨터 : 가위"); break;
					case 2 : System.out.println("컴퓨터 : 바위"); break;
					case 3 : System.out.println("컴퓨터 : 보"); break;
				}
				System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
				
				mynum = scanner.nextInt();
				
			}
			catch(InputMismatchException e) {
				scanner = new Scanner(System.in);
				System.out.println("숫자를 입력해주세요.");
				continue;
				
			}
				
			try {

				if(mynum<1 || mynum>3) {
					WrongNumberException ex = new WrongNumberException();
					throw ex;					
				}
				
			}catch(WrongNumberException e) {
				System.out.println(e.getMessage());
				continue;
			}
				
			if(mynum != 0) {
				System.out.print("사용자 : "+mynum);
			
				if (comnum == 1 && mynum == 2) {
					System.out.println("(바위)");
					System.out.println("이겼습니다.");
				}else if(comnum == 1 && mynum == 3) {
					System.out.println("(보)");
					System.out.println("졌습니다.");
				}else if(comnum == 2 && mynum == 1) {
					System.out.println("(가위)");
					System.out.println("졌습니다.");
				}else if(comnum == 2 && mynum == 3) {
					System.out.println("(보)");
					System.out.println("이겼습니다.");
				}else if(comnum == 3 && mynum == 1) {
					System.out.println("(가위)");
					System.out.println("이겼습니다.");
				}else if(comnum == 3 && mynum == 2) {
					System.out.println("(바위)");
					System.out.println("졌습니다.");
				}else if(comnum == 1 && mynum == 1) {
					System.out.println("(가위)");
					System.out.println("비겼습니다.");
				}else if(comnum == 2 && mynum == 2) {
					System.out.println("(바위)");
					System.out.println("비겼습니다.");
				}else if(comnum == 3 && mynum == 3) {
					System.out.println("(보)");
					System.out.println("비겼습니다.");
				}
				
				
			
				System.out.println();
				cnt++;	
				
			}	
				
			if (cnt == 5) {
				while(true) {
					System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? [재시작(1), 종료(0)] : ");
					
					
					int mynum2 = 0;
					try {
						mynum2 = scanner.nextInt();					
						
					}
					catch(InputMismatchException e) {
						scanner = new Scanner(System.in);
						System.out.println("숫자를 입력해주세요.");
						continue;
					}
					
					try {
						if(mynum2<0 || mynum2>1) {
							WrongNumberException ex = new WrongNumberException(2);
							throw ex;
						}
					}catch(WrongNumberException e) {
						System.out.println(e.getMessage());
						cnt = 0;
						continue;
					}
					
					
					if (mynum2 == 1) {
						cnt = 0;
						scanner.nextLine();
						break;
					} else if(mynum2 == 0){
						System.out.println("게임이 종료되었습니다. 감사합니다.");
						scanner.nextLine();
						System.exit(0);
					}
				}
			
			}
		
		}
		
		
	}

}
