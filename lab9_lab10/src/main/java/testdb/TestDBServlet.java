package testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String user = "root";
//		String password = "Thanhthuidich123*";
		
		String user = "hbstudent";
		String password = "hbstudent";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hibernate_crud?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter printWriter = response.getWriter();
			printWriter.println("Connecting to database: "+jdbcUrl);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
			printWriter.println("SUCCESS!!!");
			myConn.close();
		}catch(Exception exc) {
			exc.printStackTrace();
			throw new ServletException();
		}
	}

}
