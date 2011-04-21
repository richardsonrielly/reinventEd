package edu.fix.courses;

import java.util.Vector;

import android.app.Activity;

import edu.fix.bookcase.Book;

public class Course {
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
