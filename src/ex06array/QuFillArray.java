package ex06array;



import java.util.Scanner;

/*
문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

실행결과]
1번째 정수를 입력하세요:2
2번째 정수를 입력하세요:4
3번째 정수를 입력하세요:5
4번째 정수를 입력하세요:3
5번째 정수를 입력하세요:2
6번째 정수를 입력하세요:9
7번째 정수를 입력하세요:7
8번째 정수를 입력하세요:8
9번째 정수를 입력하세요:5
10번째 정수를 입력하세요:1
순서대로입력된결과
2 4 5 3 2 9 7 8 5 1 
홀수/짝수 구분입력결과
5 3 9 7 5 1 8 2 4 2 


 */

// [선생님코드]

public class QuFillArray {

	public static void main(String[] args) {
		
		// 입력받은 정수를 순서대로 입력할 배열
		int[] arr1 = new int[10];
		// 홀,짝을 구분해서 입력할 배열
		int[] arr2 = new int[10];
		
		// arr2배열의 시작인덱스와 마지막인덱스를 저장할 변수(홀,짝 구분)
		int indexStart = 0;
		int indexEnd = arr2.length - 1;
		
		// 사용자 입력을 위한 객체생성
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i< arr2.length ; i++) {
			System.out.print("채울 숫자를 입력하세요: ");
			int inputNum  = scanner.nextInt();
			
			// 첫번째 배열에는 입력한 순서대로 채워준다.
			arr1[i] = inputNum;
			
			if(inputNum%2==1) {
				// 홀수 => 앞에서부터 채우고 인덱스 1증가
				arr2[indexStart++] = inputNum;
				
			}else {
				// 짝수 => 뒤에서부터 채우고 인덱스 1감소
				arr2[indexEnd--] = inputNum;
			}
		}
		
		System.out.println("첫번째 배열 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n두번째 배열 출력");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}










/*
[내 코드]
public class QuFillArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] arrOddEven = new int[10];
			
		System.out.print("1번째 정수를 입력하세요: ");
		int one = scanner.nextInt();
		System.out.print("2번째 정수를 입력하세요: ");
		int two = scanner.nextInt();
		System.out.print("3번째 정수를 입력하세요: ");
		int three = scanner.nextInt();
		System.out.print("4번째 정수를 입력하세요: ");
		int four = scanner.nextInt();
		System.out.print("5번째 정수를 입력하세요: ");
		int five = scanner.nextInt();
		System.out.print("6번째 정수를 입력하세요: ");
		int six = scanner.nextInt();
		System.out.print("7번째 정수를 입력하세요: ");
		int seven = scanner.nextInt();
		System.out.print("8번째 정수를 입력하세요: ");
		int eight = scanner.nextInt();
		System.out.print("9번째 정수를 입력하세요: ");
		int nine = scanner.nextInt();
		System.out.print("10번째 정수를 입력하세요: ");
		int ten = scanner.nextInt();
		
		arr[0] = one ; arr[1] = two ; arr[2] = three ;
		arr[3] = four ;arr[4] = five ;arr[5] = six ;
		arr[6] = seven ;arr[7] = eight ;arr[8] = nine ;
		arr[9] = ten ;
		
		System.out.println("순서대로입력된결과");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
		
		System.out.println();
		System.out.println("홀수/짝수 구분입력결과");
		
		int cnt = 0;
		int cnt2 = 0;
		for (int i = 0; i < arr.length; i++) {
			
			
			//홀수를 앞에서부터 채우기
			if(arr[i]%2 == 1) {
				
				arrOddEven[cnt] = arr[i];
				cnt += 1;
				
			}else { //짝수를 뒤에서부터 채우기
				
				arrOddEven[9-cnt2] = arr[i];
				cnt2 += 1;	
				
				}
				
			}
			
		for (int i = 0; i < arrOddEven.length; i++) {
			System.out.print(arrOddEven[i]+" ");
		}
		
	}
}
*/