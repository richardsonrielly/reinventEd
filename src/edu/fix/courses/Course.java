package edu.fix.courses;

import java.util.Vector;
import java.io.Serializable;

import edu.fix.bookcase.Book;

public class Course implements Serializable {

	private static final long serialVersionUID = -6503056670685902032L;
	private final String courseName;
	private Vector<Book> books;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	};

	public void addBook(Book newBook) {
		// TODO: Prevent adding duplicate books
		this.books.add(newBook);
	}
}
