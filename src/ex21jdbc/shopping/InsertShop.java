package ex21jdbc.shopping;

import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{

	public InsertShop(){
		super("kosmo","1234");
		
	}
	
	@Override
	public void execute() {
		String query = "INSERT INTO sh_goods  VALUES "
				+ " (goods_seq.NEXTVAL, ?,?,SYSDATE,?) ";
		try {
			
			psmt = con.prepareStatement(query);
			
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			int row = psmt.executeUpdate();
			System.out.println(row +"행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertShop().execute();
		
		
	}

}
