package edu.fix.bookcase;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 470005430564380083L;
	private final String bookName;

	public Book(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}
}
