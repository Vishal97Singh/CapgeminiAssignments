package com.dao;

import java.util.List;

import com.bean.Author;

public interface AuthorDao {
	String insertAuthor(Author a);
	String deleteAuthor(int authorId);
	String updateAuthor(int authorId,String firstName);
	List<Author> allAuthor();

}
