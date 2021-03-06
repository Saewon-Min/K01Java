package ex05method;


/*
메소드 오버로딩(Method Overloading)
	:동일한 이름의 메소드를 두개이상 정의하는 것을 말한다.
	- 매개변수의 개수가 다르거나, 자료형이 다를때 성립힌다.
	- 반환타입만 다른것은 허용하지 않는다.
	- 컴파일러는 메소드 호출시 전달되는 파라미터(=인자)를 통해
	호출할 메소드를 구분한다.
*/
public class E07Overloading {

	// 반환형(타입) 함수명 (매개변수)
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호: "+juminNum);
		System.out.println("군번: "+milNum);
	}
		
	static void person(int juminNum) {	
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호: "+juminNum);
		
	}
	
	// 반환타입만 다른 형태는 오버로딩이 성립하지 않는다.
//	static int person(int juminNum) {
//		System.out.println("미필자이거나 여성이시군요");
//		System.out.println("주민번호: "+juminNum);
//	
//		return 1;
//	}
	
	public static void main(String[] args) { // argument => args(인자)
		person(123456,7890123); // 전달되는 것 : 파라미터(=인자)
								// 123456,7890123이라는 인자값을 
								// juminNum, milNum라는 매개변수로 받는다.
		System.out.println("=================");
		person(987654);
		
	}

}
