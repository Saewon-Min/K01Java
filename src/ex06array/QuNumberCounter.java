package ex06array;


/*
문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 
배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];


실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4


 */

// [선생님코드]


public class QuNumberCounter {

	
	public static void main(String[] args) {
		// 문제에서 주어진 샘플코드
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		// 배열을 선언하면 각 요소값이 자동으로 0으로 초기화된다.
		int[] counter = new int[4];
		
		// answer 배열을 처음부터 끝까지 한번 진행
		// 배열의 크기만큼 반복하면서 순차적으로 요소에 접근한다.
		for (int i = 0; i < answer.length; i++) {
			// 만약 1이라면 0번 인덱스를 하나 증가시킨다.
			if(answer[i]==1) counter[0]++; // int배열은 0으로 초기화되어있기 때문에 ++이 가능함
			else if(answer[i]==2) counter[1]++;
			else if(answer[i]==3) counter[2]++;
			else if(answer[i]==4) counter[3]++;
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.printf("counter[%d] (%d)의 개수 : %d\n",i,
					i+1,counter[i]);
		}
		
	}
}

/*
[내 코드]
public class QuNumberCounter {

	
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		int[] counter = new int[4];

		for (int j = 0; j < answer.length; j++){
			if (answer[j]==1) {
				counter[0] += 1 ;
			}
			else if (answer[j]==2){
				counter[1] += 1;
			}
			else if (answer[j]==3){
				counter[2] += 1;
			}
			else {
				counter[3] += 1;
			}
				
		}
		System.out.println("counter[0] => "+ counter[0]);
		System.out.println("counter[1] => "+ counter[1]);
		System.out.println("counter[2] => "+ counter[2]);
		System.out.println("counter[3] => "+ counter[3]);
		
	}

}
*/