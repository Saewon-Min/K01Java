package quiz;

import java.util.Scanner;

/*
파일명 : QuBaseballGame.java

게임설명 : 야구게임을 메소드를 이용하여 구현한다.
중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다.
생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3]; 
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.


 */

class RandomArr{
	
	boolean flag = true;
	int[] com = new int[3];
	int randnumber; 
	int[] user = new int[3];

	public void randomNum() {

		for (int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			
			for (int j = 0; j < i ; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}

		}
			
		for (int j = 0; j < com.length; j++) {
			System.out.println(com[j]);
		}
		
	}
	
	public void matchNum() {
		randomNum();
		
		Scanner scan = new Scanner(System.in);
		int inputUser;
		int cnt =0;
		
		while(true) {
			System.out.println("숫자를 입력해주세요 : ");
			inputUser = scan.nextInt();
			
			user[cnt] = inputUser;
			
			cnt++;
			if(cnt>=3) {
				break;
			}
			
		}
		
		for(int i=0; i<user.length; i++) {
			System.out.println("user : "+user[i]);
		}
		
		
		if(com[0]==user[0]) {
			System.out.println("strike");
		}
		
		
		
		
	}	
		
}



public class QuBaseballGame {

	public static void main(String[] args) {

		RandomArr randomArr = new RandomArr();
		//randomArr.randomNum();
		randomArr.matchNum();
	}

}







