package edu.fix.courses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.Vector;

import edu.fix.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class CoursesView extends Activity {
	private LinearLayout courseListLayout;
	private final CourseList courses = new CourseList();
	private Vector<Button> courseButtons;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.courses);
		assignWidgets();
		testCourses();
		fillCourseContent();
	}

	private void testCourses() {
		courses.addCourse(new Course("Woodshop"));
		courses.addCourse(new Course("English"));
		try {
			courses.saveCourses(this);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			addCourseButton("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			addCourseButton("IOEXCEPTION");
			e.printStackTrace();
		}
		courses.removeCourseByName("Woodshop");
		courses.removeCourseByName("English");
		try {
			courses.loadCourses(this);
		} catch (StreamCorruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void assignWidgets() {
		courseButtons = new Vector<Button>();
		courseListLayout = (LinearLayout) findViewById(R.id.linearLayout2);
	}

	public void fillCourseContent() {
		Vector<Course> courseList = courses.getCourses();
		for (int i = 0; i < courseList.size(); i++) {
			addCourseButton(courseList.get(i).getCourseName());
		}
	}

	private void addCourseButton(String courseName) {
		Button newCourseButton = new Button(this);
		newCourseButton.setText(courseName);
		LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT);
		courseButtons.add(newCourseButton);
		courseListLayout.addView(newCourseButton, p);
	}

	public void createListeners() {

	}
}
