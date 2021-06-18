package ex06array;

/*
문제2] 파일명 : QuTwoDimLotate.java
다음의 형태로 표현된 2차원 배열이 있다. 

123
456
789

이렇게 전달되면 다음의 형태로 구조를 변경하는 메소드를 정의해보자.

789
123
456

즉 메소드를 호출하면 1행은 2행으로, 2행은 3행으로 마지막행은 1행으로 이동하게된다.
단 세로길이에 상관없이 동작하도록 메소드를 정의해야 한다.

 */

// [선생님코드]


public class QuTwoDimRotate {

	public static void main(String[] args) {

		// 3by3 배열 생성
		// int[][] arr = new int[3][3];
		int[][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}}; // 생성과 동시에 초기화
		
		arrPrint(arr); // 배열 초기화 직후 출력
		
		// 행 이동 후 출력하기1
		rotateArray(arr);
		arrPrint(arr);

		// 행 이동 후 출력하기2
		rotateArray(arr);
		arrPrint(arr);

		// 행 이동 후 출력하기3
		rotateArray(arr);
		arrPrint(arr);

		
	}
	
	static void rotateArray(int[][] arrParam) {
		
		/*
		진행절차
			1. 배열의 마지막행을 1차원배열 변수에 임시로 저장한다.
			2. 배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
			3. 1번에서 임시로 저장했던 값을 1행으로 옮긴다.
			
			※ 2차원배열에서 "배열이름[인덱스]"가 하나의 행(세로행)을
				가리킨다는 것을 활용하는 문제임.※
		 */
		// 절차1
		int[] lastRow = arrParam[arrParam.length -1];
		
		// 절차2
		for (int row = arrParam.length -1; row > 0; row--) {
			arrParam[row] = arrParam[row-1];
		}
		
		// 절차3
		arrParam[0] = lastRow;
		
		
	}
	
	static void arrPrint(int[][] arr) {
		// 코드 삽입
		// 세로 길이만큼 반복
		for (int i = 0; i < arr.length; i++) {
			// 가로 길이만큼 반복
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 한 행 출력 후 줄바꿈
		}
		// 출력의 구분선
		System.out.println("========================");
	}
	
}



/*
// [내 코드]
public class QuTwoDimLotate {
	
	static void firstArr(int[] arr) {
		
		
	}
	
	static void secondArr(int[][] arr) {
		
		
	}
	
	public static void main(String[] args) {
		
		int row =3 ,col =3 ;
		int[][] arr = new int[row][col];
		
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				num += 1;
				arr[i][j] = num;
				//System.out.print(arr[i][j]);
				
			}
			//System.out.println();
		}
		
		int[][] arr2 = new int[row][col]; 
		
		int num2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				num2 += 1;
				arr[i][j] = num2;
				System.out.print(arr[i][j]);
				
			}
			System.out.println();	
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(i < arr.length-1){
					arr2[i+1][j] = arr[i][j];
			
				}
				if(i==(arr.length-1)) {
					arr2[i-(arr.length-1)][j] = arr[arr.length-1][j];
				
				}
				System.out.print(arr2[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
		

}
*/