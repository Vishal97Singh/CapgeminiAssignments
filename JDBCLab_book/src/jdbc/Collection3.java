package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Vishal Singh
 *
 */

public class Collection3 {
	Statement s;
	static Connection con;
	public void getValue(){
		try {
			s=con.createStatement();
			ResultSet r=s.executeQuery("select val from collection3");
		
			while(r.next()) {
				int i=(r.getInt(1));
			   System.out.println(i*i);	
			}
			
	
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","lpu","hr");// Connection Established
		
				Collection3 col=new Collection3();
				col.getValue(); //Method Called
				
			} catch (SQLException e) {
				System.out.println("Table not created");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
