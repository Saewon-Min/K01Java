package ex11static;

public class E02StaticBlockMain {

	public static void main(String[] args) {
		
		/*
		해당 파일안에 static 블럭이 없으므로 우선 main이 실행된다.
		 */
		
		System.out.println("static블럭 - 다른 클래스의 메인 메소드 실행");
		StaticBlock sb = new StaticBlock();
		System.out.println("StaticBlock.staticVar = "+
				StaticBlock.staticVar);
		
	}

}
