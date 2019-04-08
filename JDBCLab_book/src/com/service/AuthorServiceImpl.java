package com.service;

import java.util.List;

import com.bean.Author;
import com.dao.AuthoeDaoImpl;
import com.dao.AuthorDao;
/**
 * 
 * @author Vishal Singh
 *
 */
public class AuthorServiceImpl implements AuthorService {
	AuthorDao adao=new AuthoeDaoImpl();

	@Override
	public String insertAuthor(Author a) {
		if(a.getFirstName().length()==0 || Integer.toString(a.getAuthorId()).length()<3)
		  return "Enter Valid AuthorId and name";
		else if(a.getPhoneNo().length()!=10)
			return "Enter Valid Phone Number";
		else
			return adao.insertAuthor(a);
	}

	@Override
	public String deleteAuthor(int authorId) {
		if(authorId<0 || Integer.toString(authorId).length()<3)
		  return "Enter valid AuthorId";
		else
			return adao.deleteAuthor(authorId);
	}

	@Override
	public String updateAuthor(int authorId, String firstName) {
		if(authorId<0 || Integer.toString(authorId).length()<3 || firstName.length()==0)
			  return "Enter valid AuthorId and name";
			else
				return adao.updateAuthor(authorId, firstName);
		
	}

	@Override
	public List<Author> allAuthor() {
		// TODO Auto-generated method stub
		return adao.allAuthor();
	}

}
