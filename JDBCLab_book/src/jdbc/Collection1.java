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

public class Collection1 {
	Statement s;
	static Connection con;
	public void getValue(){
		try {
			s=con.createStatement();
			ResultSet r=s.executeQuery("select value from collection1 ORDER BY value");
		
			while(r.next()) {
				System.out.println(r.getString(1));
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
			
//			    ps=con.prepareStatement("create table Collection1(Key Varchar2(10),Value Varchar2(10))");
//				ps.execute(); //Table Created
//				
//			    Statement s=con.createStatement();
//			    s.execute("insert into collection1 values('Vikas','one')");
//			    s.execute("insert into collection1 values('Vishal','two')");
//			    s.execute("insert into collection1 values('Manoj','three')");
//			    s.execute("insert into collection1 values('Lokesh','four')");
//				System.out.println("Value Inserted"); // Values Inserted
				
				Collection1 col=new Collection1();
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
