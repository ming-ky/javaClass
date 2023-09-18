package kr.co.himedia.review;

public class DBConnectionTest {

	public static void main(String[] args) {
		
		Connection conn;
		
		//oracle DB접속
		conn = new OracleDriver();
		conn.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "himedia", "1128");
		
		//postgresql DB 접속
		conn = new PostgresqlDriver();
		conn.getConnection("jdbc:postgrsql://@127.0.0.1:5432:himediadb", "himedia", "1128");
		
		//mysql DB 접속
		conn = new MysqlDriver();
		conn.getConnection("jdbc:mysql://@127.0.0.1:3306:himediadb", "himedia", "1128");

	}

}
