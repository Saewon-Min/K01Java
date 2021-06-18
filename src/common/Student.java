package common;

public class Student extends Person {

	private String stNumber;

	public Student(String name, int age, String stNumber) {
		super(name, age); // 상속을 받았기때문에 자동으로 만들어짐
		this.stNumber = stNumber;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + ", 학번 : "+stNumber;
	}
	
	@Override
	public void showInfo() {
		System.out.println("학생의 정보");
		System.out.println(getInfo());
	}
	
}
