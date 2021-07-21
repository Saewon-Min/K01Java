package designpattern.builder;

/*
Builder Pattern(빌더패턴)
	: 객체의 생성 과정에서 표현 방법과 생성 과정을 분리하여
	동일한 생성 절차에서 다른 표현 결과를 만들수 있게 하는 
	디자인 패턴이다. 멤버변수의 개수가 많을때 사용하면
	편리하다.
	
절차
	1. Person 클래스 생성 - 멤버변수, getter, setter
	2. PersonBuilder 클래스 생성 - Person과 동일한 멤버변수, setter
	3. setter를 아래와 같이 수정
		반환형 void -> PersonBuilder
		메소드명 setXXX -> set 삭제 후 멤버변수명과 동일하게 변경
		return this를 각 메소드에 추가
	4. PersonBuilder 클래스 마지막에 build() 메소드 생성
		setter를 통해 각 멤버변수 초기화 한 후 Person객체를 반환
	5. Person 클래스의 마지막에 PersonBuilder를 반환하는 
		static 타입의 builder() 메소드 생성
	
이와 같이 하면 객체 생성시 메소드 체인 형태로 각 멤버변수를
마음대로 설정할 수 있다.

 */
public class BuilderYesMain {

	public static void main(String[] args) {
		
		// 1번 객체 : 이름, 주소 초기화
		Person p1 = Person.builder()
					.firstName("김")
					.lastName("선호")
					.addr1("강남구")
					.addr2("청담동")
					.build();
		
		
		// 2. 객체 : 이름, 운전면허, 결혼 유무 초기화 
		Person p2 = Person.builder()
				.firstName("김")
				.lastName("선호")
				.driverLicence(true)
				.married(false)
				.build();		
		
		
	}
	
}
