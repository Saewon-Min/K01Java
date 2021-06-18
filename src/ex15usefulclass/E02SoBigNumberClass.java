package ex15usefulclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class E02SoBigNumberClass {

	public static void main(String[] args) {

		System.out.println("Long형의 최대값 : "+Long.MAX_VALUE);
		System.out.println("Long형의 최소값 : "+Long.MIN_VALUE);
		
		/*
		BigInteger 클래스
			: int형이나 long형으로 표현할수 없는 범위의 큰수를
			연산할때 사용한다. 인자로 전달할때 반드시 문자열형태로
			기술해야한다.
		 */
		//long lugNum = 100000000000000000000000000; => 코드작성불가
		BigInteger bigvalue1 = new BigInteger("1000000000000000000");
		BigInteger bigvalue2 = new BigInteger("-999999999999999999");
		
		// 사칙연산은 아래 메소드를 통해 수행한다.
		BigInteger addResult = bigvalue1.add(bigvalue2);
		BigInteger subResult = bigvalue1.subtract(bigvalue2);
		BigInteger mulResult = bigvalue1.multiply(bigvalue2);
		BigInteger divResult = bigvalue1.divide(bigvalue2);
		BigInteger remResult = bigvalue1.remainder(bigvalue2);
		
		System.out.println("큰수의 덧셈결과 : "+addResult);
		System.out.println("큰수의 뺄셈결과 : "+subResult);
		System.out.println("큰수의 곱셈결과 : "+mulResult);
		System.out.println("큰수의 나눗셈결과 : "+divResult);
		System.out.println("큰수의 나머지결과 : "+remResult);
		
		/*
		BigDecimal 클래스
			: 실수의 오차없는 표현이나 연산을 위해 사용하는 클래스
		 */
		double dbl1 = 1.6;
		double dbl2 = 0.1;
		
		System.out.println("두 실수의 덧셈결과(오차있음) : "+(dbl1+dbl2));
		System.out.println("두 실수의 곱셈결과(오차있음) : "+(dbl1*dbl2));
		
		BigDecimal bigDec1 = new BigDecimal("1.6");
		BigDecimal bigDec2 = new BigDecimal("0.6");
		
		System.out.println("두 실수의 덧셈결과 : "+bigDec1.add(bigDec2));
		System.out.println("두 실수의 뺄셈결과 : "+bigDec1.subtract(bigDec2));
		System.out.println("두 실수의 곱셈결과 : "+bigDec1.multiply(bigDec2));
		System.out.println("두 실수의 나눗셈결과 : "+bigDec1.divide(bigDec2));
		System.out.println("두 실수의 나머지결과 : "+bigDec1.remainder(bigDec2));
		
		
		
		
	}

}
