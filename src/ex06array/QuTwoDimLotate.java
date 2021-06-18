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
public class QuTwoDimLotate {

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
