package ex02variable;

/*
문제3] 파일명 : Qu_02_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면적의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.

변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double

공식]
	원의넓이 = 반지름 * 반지름 * 3.14

 */

public class Qu_02_03 {

	public static void main(String[] args) {
		int area_int = (int)(10*10*3.14);
		float area_float = (float)(10*10*3.14);
		double area_double = (double)(10*10*3.14);
		
		System.out.println("int형 넓이:"+area_int);
		System.out.println("float형 넓이:"+area_float);
		System.out.println("double형 넓이:"+area_double);
		
		
		/*
		final double PI = 3.14;
		int rad = 10;
		
		int area_int ;
		float area_float ;
		double area_double ;
		
		area_int = (int)(rad*rad*PI);
		area_float = (float)(rad*rad*PI);
		area_double = rad*rad*PI;
		
		
		큰 자료형을 작은 자료형에 대입할때는 자료의 손실이 있을수 있으므로
		반드시 강제형변환(명시적형변환)을 통해 형변환 후 대입해야한다.
		
		
		System.out.println("int형 넓이:"+area_int);
		System.out.println("float형 넓이:"+area_float);
		System.out.println("double형 넓이:"+area_double);
		
		 */
		
		
		
		
		
		
	}

}
