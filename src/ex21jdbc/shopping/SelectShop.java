package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.connect.IConnectImpl;


public class SelectShop extends IConnectImpl {

	public SelectShop() {
		super("kosmo","1234");
	}
		
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String sql = "SELECT g_idx, goods_name, "
					+ " to_char(goods_price,'999,000'), "
					+ " to_char(regidate, 'yyyy-mm-dd hh24:mi') d1 , p_code "
					+ " FROM sh_goods "
					+ " WHERE 1=1 ";
			
			String searchStr = scanValue("검색할상품명");
			if (searchStr != null) {
				sql = sql +" AND goods_name "
						+ " LIKE '%'" + searchStr + "'%'";
			}
			
			sql = sql + "order by g_idx asc";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString(1);//id컬럼
				String name = rs.getString("goods_name");
				String price = rs.getString("goods_price");				
				String pcode = rs.getString("p_code");				
				
				
				java.sql.Date regidate = rs.getDate("regidate");	

				String regidate1 = rs.getString("d1");

				System.out.printf("%s %s %s %s %s\n",
						id, name, price, regidate1,pcode);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	
	public static void main(String[] args) {
		new SelectShop().execute();
		
	}

}
