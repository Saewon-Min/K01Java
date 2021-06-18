package ex16exception;

import java.io.IOException;

/*
예외처리방법3
	: 예외가 발생한 위치에서는 처리하지 않고 외부로 던진다.
	대신 함수를 호출한 지점에서 예외 객체를 받은 후 처리한다.
	이때 예외발생과 상관없이 finally절은 실행된다.
 */

public class Ex03ExceptionCase3 {

	static void compileFunc() throws IOException{ // 발생지점에서 무시
		try {
			System.out.println("하나의 문자를 입력하세요");
			int userChar = System.in.read();
			System.out.println("입력된 문자는 "+(char)userChar);
			int result = 10/0; /*
				해당 문장이 실행되면 ArithmeticException이 발생한다.
				따라서 main의 try문에서는 해당 예외를 처리할 수 없어
				실행이 중간에 멈추게된다. 이런 경우 여러개의 catch절이
				필요하다.
			 	*/			
			
		} finally {
			System.out.println("finally는 예외 발생여부와 상관없이 항상 실행됨");
		
		}
	
	}
	
	public static void main(String[] args) { // 호출한지점에서 처리
	
		try {
			compileFunc();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("끝");
	}

}
