package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;
/*
해당 클래스에서는
buyApple(FruitSeller4 seller, int money) 메소드를 호출할때
매개변수로 FruitSeller4 타입을 사용한다. 따라서 해당 클래스를
반드시 import 처리해야한다.
 */


//구매자를 표현한 클래스
public class FruitBuyer4 {

	int myMoney ; // 보유금액
	int numOfApple ; // 구매한 사과의 개수

	// 생성자 메소드
	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;

	}

	/*
	 * 구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드 1. 판매자에게 금액을 지불한다. -- 여기에서 seller객체의
	 * saleApple()메소드가 호출된다. -- 2. 판매자가 금액에 해당하는 사과의 개수를 반환하면, 해당 개수만큼 보유한 사과의 개수를
	 * 증가시킨다. 3. 판매자에게 지불한 금액만큼 차감된다.
	 * 
	 */
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	// 구매자의 현재 상태 출력
	public void showBuyResult() {

		System.out.println("[구매자]현재잔액 : " + myMoney);
		System.out.println("[구매자]사과갯수 : " + numOfApple);
	}

}