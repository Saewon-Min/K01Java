package ex12inheritance;

public class E07RideAndLoad02 {

	public static void main(String[] args) {

		System.out.println("Child형 참조변수로 Child 객체 참조");
		DeChild child = new DeChild("율곡이이",49,"00학번");
	
		/*
		오버라이딩 처리된 메소드이므로 참조변수에 상관없이 무조건
		자식클래스의 메소드가 호출된다.
		 */
		child.excesise();
		child.sleep();
		child.printParent();
		
		child.study(); // 자식에서 확장된 메소드(부모에는 없음)
		child.walk(); // 오버로딩 - 부모클래스 메소드 정의
		child.walk(25); // 오버로딩 - 자식클래스 메소드 정의
		
		/*
		정적메소드는 클래스명을 통해 호출한다. static의
		기본규칙을 따른다. 오버라이딩의 대상이 될 수 없다.
		 */
		DeChild.staticMethod();
	
		/////////////////////////////////////////////////
		
		System.out.println("Parent형 참조변수로 Child객체 참조");
	
		DeParent parent = new DeChild("퇴계이황",35,"99학번");
		
		/*
		오버라이딩 처리된 메소드이므로 참조변수에 상관없이
		무조건 자식쪽 메소드가 호출된다.
		참조변수의 영향을 받지 않는다.
		 */
		parent.excesise();
		parent.sleep();
		parent.printParent();
		
		//parent.study(); 자식에서 확장된 메소드이므로 접근불가
		parent.walk();
		//parent.walk(25); 자식에서 정의된 메소드이므로 접근불가
		
		/*
		정적메소드는 오버라이딩 되지 않는다. 클래스명만으로 호출된다.
		 */
		DeParent.staticMethod();
	
	}

}
