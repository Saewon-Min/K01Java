package ex05method;

/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8


 */

// [선생님코드]
public class QuTemperature {
	
	// 섭씨->화씨
	static double celsiusToFahrenheit(double cel) {
		return (1.8*cel+32);
		
		
	}
	
	// 화씨->섭씨
	static double fahrenheitToCelsius(double fah) {
		double result = (fah-32)/1.8;
		return result;
		
	}
	
	public static void main(String[] args) {
		/*
		인자로 전달하는 35는 정수이고, 매개변수 cel은 실수이므로 전달될때
		자동형변환이 일어난다.
		 */
		System.out.println("화씨 = "+ celsiusToFahrenheit(35)); // double이 int보다 큰 자료형이기 때문에 자동형변환이 일어남
		System.out.printf("섭씨 = %4.2f", fahrenheitToCelsius(95));
	}

}


/*
public class QuTemperature {
	
	static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (1.8*celsius+32);
		return fahrenheit;
		
	}
	
	static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit-32)/1.8;
		return celsius;
		
	}
	
	public static void main(String[] args) {

		System.out.println("화씨 = "+ celsiusToFahrenheit(35));
		System.out.printf("섭씨 = %4.2f", fahrenheitToCelsius(95));
	}

}
*/