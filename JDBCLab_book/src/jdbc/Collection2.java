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

public class Collection2 {
	static Connection con;
	Statement s;
	public void getValue(){
		try {
			s=con.createStatement();
			ResultSet r=s.executeQuery("select value from collection1");
		
			while(r.next()) {
				String str=(r.getString(1));
			   System.out.println(str);
			   int a[]=new int[200];
			   for(int i=0;i<str.length();i++) {
				   a[(int)str.charAt(i)]++;
			   }
			   for(int i=97;i<122;i++) {
				   if(a[i]!=0) {
					   System.out.println((char)i+" :"+a[i]);
				   }
			   }
				
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
			

				
				Collection2 col=new Collection2();
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
