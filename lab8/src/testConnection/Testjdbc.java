package testConnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class Testjdbc {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";
		String pass = "Thanhthuidich123*";
		try {
			System.out.println("Connecting to database: "+jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful!!!");
		}catch(Exception exe) {
			exe.printStackTrace();
		}
	}
}
