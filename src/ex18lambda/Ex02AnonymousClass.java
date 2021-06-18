package ex18lambda;

/*
익명 클래스로 오버라이딩
 */
interface Ikosmo2{
	void studyLambda(String str);

}


public class Ex02AnonymousClass{

	public static void main(String[] args) {
		// Ikosmo2를 인터페이스로 구현한 익명클래스 정의
		Ikosmo2 kosmo = new Ikosmo2() {
			/*
			상속의 절차를 익명클래스로 
			대체하였으므로 코드가 좀 더 간결해진다.
			 */
			@Override
			public void studyLambda(String str) {
				System.out.println(str + "을 공부하기 위해 익명클래스를 만들어요");
			}
		};
		kosmo.studyLambda("람다식");
	}
}

