package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
파일명 : QuUpDownGame.java

게임설명 : 업다운게임을 메소드를 이용해 구현한다.
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다.
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7. 함수를 사용하여 구현한다.
8. 무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.


 */


// [선생님 코드]
/*
public class QuUpDownGame {
	
	public static void main(String[] args) {
		
	}
	
	
}
*/


/*
[내 코드]

class NumberRangeException extends Exception{
	
	public NumberRangeException() {
		super("숫자를 잘못 입력하셨습니다.");
	}
}

public class QuUpDownGame {

	static void upDown(int num,int mynum,int cnt) {
		
		if(num<mynum) {
			System.out.println("숫자가 더 작아요.");
		}else if(num>mynum) {
			System.out.println("숫자가 더 커요.");
		}else if(num==mynum) {
			System.out.println("성공입니다. 정답입니다!");
			tryCatch(cnt);
		}
		
	}
	
	
	static int tryCatch(int cnt) {
		
		
		try {
			
			System.out.print("게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
			int mynum2 = readNum2();
			
			if (mynum2 == 1) {
				cnt = 1;

				
			} else if(mynum2 == 0){
				System.out.println("게임이 종료되었습니다. 감사합니다.");
				System.exit(0);
			}
			
		} catch (NumberRangeException e) {
			System.out.println("[예외발생]"+e.getMessage());
		}
		
		
		return cnt;
	}
	
	public static int readNum() throws NumberRangeException{
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		try {
			inputNum = sc.nextInt();
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
		
		if (!(inputNum >= 1 && inputNum <= 100)) {
			NumberRangeException nr = new NumberRangeException();
			throw nr;
		}
		return inputNum;
		
	}
	
	
	public static int readNum2() throws NumberRangeException{
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		try {
			inputNum = sc.nextInt();
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
		
		if (!(inputNum == 0 | inputNum == 1)) {
			NumberRangeException nr = new NumberRangeException();
			throw nr;
		}
		return inputNum;
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int cnt = 0;
		int num;
		int mynum;
		System.out.println("게임을 시작합니다.");
		System.out.println("기회는 총 7번입니다.");
		num = (random.nextInt(100)+1);
		
		while(true) {
			
			
			System.out.println("num = "+ num);
			
			try {
				
				System.out.print("숫자를 입력하세요 : ");
				mynum = readNum();
				System.out.println();
				
				if (cnt<7){
					upDown(num,mynum,cnt);
					//num = (random.nextInt(100)+1);
				}
				
				cnt++;
				
			} catch (NumberRangeException e) {
				System.out.println("[예외발생]"+e.getMessage());
			}
			
			
			try {
				
				if (cnt == 7){
					System.out.println("7번의 게임이 끝났습니다. 실패입니다.");
					
					System.out.print("게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
					int mynum2 = readNum2();
				
					if (mynum2 == 1) {
					cnt = 1;
					
					} else if(mynum2 == 0){
					System.out.println("게임이 종료되었습니다. 감사합니다.");
					System.exit(0);
					}
				}	
			}catch (NumberRangeException e) {
				System.out.println("[예외발생]"+e.getMessage());
				
			}
				
			
		}
		
	}

}


*/