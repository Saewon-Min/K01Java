package ex15usefulclass;

class MyClass {
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyClass) {
			MyClass mc = (MyClass)obj;
			
			if (mc.data == this.data) {
				return true;
			} else {
				return false;
			}
			
		}
		else {
			return false;
			
			
		}
	
	}
	
	
}

class Point{
	
	int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pos = (Point)obj;
			
			if (this.x == pos.x && this.y == pos.y) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return "x = " + String.valueOf(x)+",y = "+String.valueOf(y);
	}
	
}


public class E04Object3Equals {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		
		System.out.println("[두 객체를 equals()메소드로 비교]");
		
		if (mc1 == mc2) {
			System.out.println("인스턴스 참조값(주소값)이 같다.");
		} else {
			System.out.println("인스턴스 참조값(주소값)이 다르다.");

		}
		
		System.out.println(mc1.equals(mc2)? "같다":"다르다");
		
		System.out.println("[두 객체의 toString()메소드 호출]");
		System.out.println("mc1.toString() => "+mc1.toString());
		System.out.println("mc2.toString() => "+mc2.toString());
		
		
		Point pos1 = new Point(10,20);
		Point pos2 = new Point(10,30);
		System.out.println("두 점의 비교결과 : ");
		System.out.println(pos1.equals(pos2)? "같다":"다르다");
		
		System.out.println("pos1.toString() => "+pos1.toString());
		System.out.println("pos2.toString() => "+pos2.toString());
		System.out.println(pos1);
		System.out.println(pos2);
		
	}

}
