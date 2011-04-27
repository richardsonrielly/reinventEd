package edu.fix.courses;

import java.io.File;
import android.content.Context;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Vector;

public class CourseList {
	private final Vector<Course> courses;

	public CourseList() {
		courses = new Vector<Course>();
	}

	// Retrieve and deserialize the courses on the device's local memory
	public void loadCourses(Context applicationContext)
			throws StreamCorruptedException, FileNotFoundException,
			IOException, ClassNotFoundException {
		courses.clear();
		String coursesFile = applicationContext.getFilesDir().getAbsolutePath()
				+ "/courses";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				coursesFile));
		while (true) {
			try {
				courses.add((Course) ois.readObject());
			} catch (EOFException e) {
				return;
			}
		}

	}

	// Serialize and save courses into the device's local memory
	public void saveCourses(Context applicationContext)
			throws FileNotFoundException, IOException {
		String filename = "courses";
		ObjectOutputStream oos = new ObjectOutputStream(
				applicationContext.openFileOutput(filename,
						Context.MODE_PRIVATE));
		for (Course course : courses) {
			oos.writeObject(course);
		}
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void removeCourseByName(String CourseName) {
		for (Course course : courses) {
			if (course.getCourseName() == CourseName) {
				courses.remove(course);
			}
		}
	}
}
