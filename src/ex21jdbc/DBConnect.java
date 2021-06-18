package ex21jdbc;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {

		try {
			
			/*
			JDBC 프로그래밍 절차
			
			 1. 오라클용 JDBC 드라이버를 메모리에 로드
			 	:new를 사용하지 않고 클래스명으로 직접 찾아서 객체를 생성한 후
			 	메모리에 로드하는 forName() 메소들 사용한다.
			 	메모리에 로드된 드라이버가 DriverManager라는 클래스에 등록된다.
			 
			*/
			Class.forName("oracle.jdbc.OracleDriver");

			/*
			2. 오라클 연결을 위한 커넥션 URL, 계정아이디, 패스워드를 준비한다.
			커넥션 URL => jdbc:oracle:thin:@IP주소 :포트번호 :SID명
			※ 서버환경에 따라 ip주소, 포트번호, sid는 변경될수있다.
			*/

			
			// 나중에 ip주소를 이용할때는 localhost 부분을 ip주소로 바꿀것
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id ="kosmo";  // 계정이름
			String pass = "1234";  // 계정비번
			
			/*
			3. DriverManager 클래스의 메소드를 통해 오라클에 연결을 시도한다.
			연결에 성공할 경우 연결된 주소를 반환한다. 
			 */
			Connection con = DriverManager.getConnection(url,id,pass);
			if (con!=null) {
				System.out.println("Oracle 연결성공");
			} else {
				System.out.println("Oracle 연결실패");
			}
		}catch (Exception e){
			System.out.println("Oracle 연결시 예외발생");
			e.printStackTrace();
		}
		
	}

}
