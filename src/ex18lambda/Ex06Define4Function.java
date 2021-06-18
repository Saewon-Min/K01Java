package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex06Define4Function {

	/*
	Function<T,E>
		: 매개변수와 리턴값을 둘 다 가지고 있는 apply()
		메소드를 가지고 있다. 개발자가 가장 많이 사용하는
		함수형 인터페이스다.
	 */
	public static void main(String[] args) {

		/*
		interface Function<T,E>{
			E apply(T);
		}	
		 */
		
		// 매개변수는 String, 반환값은 Integer인 람다식을 정의함
		// 문자열을 받아서 길이를 반환한다.
		Function<String, Integer> func = (String s) -> {
			return s.length();
		};
		
		System.out.println("Lambda 문자열 길이 = "+func.apply("Lambda"));
		System.out.println("LambdaExpression 문자열 길이 = "+
				func.apply("LambdaExpression"));
	
		System.out.println("=======================");
		
		
		Human p1 = new Human("옹성우","남",80);
		Human p2 = new Human("신예은","여",80);
		Human p3 = new Human("김선우","남",80);
		Human p4 = new Human("한효주","여",80);
		
		
		List<Human> list = Arrays.asList(p1,p2,p3,p4);
		
		/*
		Human 객체를 매개변수로 받아서 해당 객체의 점수를
		반환하는 람다식 정의
		 */
		Function<Human, Integer> getFunction = (Human h) ->{
			return h.getScore(); // Human객체의 score값 반환
		};
		
		int score = getFunction.apply(p1);
		System.out.println("p1의 점수 : "+score);
		
		System.out.println("### list에 저장된 객체의 점수 출력");
		for (Human h : list) {
			System.out.println(h.getName()+" 의 점수 : "+
					getFunction.apply(h));
		}
		
		List<Integer> list2 = Arrays.asList(1,3,5,7,9,11,12,14);
		
		int total;
		total = sum((Integer n)-> n%2 == 0 , list2);
		System.out.println("짝수 합 : "+total);
		
		total = sum((Integer n)-> n%2 != 0 , list2);
		System.out.println("홀수 합 : "+total);
		
	}
	
	
	public static int sum(Predicate<Integer> p , List<Integer> list) {
		int sum = 0;
		for (int a : list) {
			if(p.test(a)) {
				sum += a;
			}
		}
		return sum;
	}
	
	

}
