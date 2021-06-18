package ex18lambda;

/*
함수형 인터페이스
	: 람다식을 구현하기 위해서는 먼저 인터페이스를 만들고
	람다식으로 구현할 추상메소드를 선언한다.
	이를 람다식을 만들기 위한 함수형 인터페이스 라고 한다.
	
@FunctionalInterface
	: 함수형 인터페이스의 조건을 갖추었는지에 대한 검사를
	컴파일러에게 요청하는 역할을 하는 어노테이션이다.
 */
@FunctionalInterface
interface IKosmo4{
	void studyLambda(String str);
}


public class Ex04FunctionalInterface {

	// 3. 매개변수의 타입이 IKosmo4를 구현한 람다식 자체를 전달하여
	// 		해당 함수에서 studyLambda()를 호출할 수 있게된다.
	static void execute(IKosmo4 ko , String s) {
		ko.studyLambda(s);
	}
	
	public static void main(String[] args) {
		// 1. IKosmo4를 이용한 람다식 정의
		IKosmo4 kosmo = (str) -> 
			System.out.println("IKosmo4를 구현받아 정의한 람다입니다." + str);
		// 2. 앞에서 정의한 람다식을 인수로 전달
		execute(kosmo, "\n람다를 매개변수로 전달합니다.");
		
		/*
		객체를 생성하면 heap영역에 저장되기 때문에
		같은 주소값을 가진 객체가 생성된다.
		 */
		
	}

}
