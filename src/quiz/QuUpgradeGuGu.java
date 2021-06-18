package quiz;



/*
아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.
파일명] QuUpgradeGuGu.java

실행결과]
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489


 */
public class QuUpgradeGuGu {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			for (int num = 1; num <=9; num++) {
				if (num==1) {
					System.out.printf("%d X %d = %d\n",dan,num,(dan*num));
				}else {
					int square = 1;
					
					for (int two = 1; two <=num; two++) {
						
						if(two==num) {
							System.out.printf("%d",dan);
						}else {
							System.out.printf("%d X ",dan);
						}
						
						square *= dan;
					
					}
					System.out.printf(" = %d\n",square);
					
				}
				
			}
			
		}
		
	}

}
