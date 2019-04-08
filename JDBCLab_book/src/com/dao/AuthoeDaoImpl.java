package com.dao;
/**
 * @author Vishal Singh
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Author;
import com.utility.AuthorUtility;

public class AuthoeDaoImpl implements AuthorDao {
	Connection con=AuthorUtility.getConnection();
	PreparedStatement ps=null;

	@Override
	public String insertAuthor(Author a) {
		String res="";
	
		try {
	      ps=con.prepareStatement("insert into author values(?,?,?,?,?)");
	      ps.setInt(1, a.getAuthorId());
	      ps.setString(2, a.getFirstName());
	      ps.setString(3, a.getMiddleName());
	      ps.setString(4, a.getLastName());
	      ps.setString(5, a.getPhoneNo());
	      int x=ps.executeUpdate();
	      if(x>0) {
	    	  res= "Table Updated";
	      }
		} catch (SQLException e) {
			res="Table Not Updated";
			e.printStackTrace();
		}
		return res;	
	}
			


	@Override
	public String deleteAuthor(int authorId) {
		String res="";
		try {
			ps=con.prepareStatement("delete from author where authorId=?");
			ps.setInt(1, authorId);
			int x=ps.executeUpdate();
			if(x>0) {
				res="Row Deleted";
			}
			
		} catch (SQLException e) {
			res="Row Not Deleted";
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public String updateAuthor(int authorId, String firstName) {
		String res="";
		try {
			ps=con.prepareStatement("update author set firstName=? where authorId=?");
			ps.setString(1, firstName);
			ps.setInt(2, authorId);
			int x=ps.executeUpdate();
			if(x>0) {
				res="Table Updated";
			}
		} catch (SQLException e) {
			res="Table Not Updated";
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public List<Author> allAuthor() {
		List<Author> li=new ArrayList<Author>();
		try {
			ps=con.prepareStatement("Select * from author");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Author a=new Author();
				a.setAuthorId(rs.getInt(1));
				a.setFirstName(rs.getString(2));
				a.setMiddleName(rs.getString(3));
				a.setLastName(rs.getString(4));
				a.setPhoneNo(rs.getString(5));
	            li.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

}
