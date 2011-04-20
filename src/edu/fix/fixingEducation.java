package edu.fix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class fixingEducation extends Activity {
	/** Called when the activity is first created. */
	ImageButton libraryButton;
	ImageButton toDoButton;
	ImageButton scheduleButton;
	ImageButton gradesButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		assignWidgets();
		createListeners();
	}

	//
	public void assignWidgets() {
		libraryButton = (ImageButton) findViewById(R.id.imageButton1);
		toDoButton = (ImageButton) findViewById(R.id.imageButton2);
		scheduleButton = (ImageButton) findViewById(R.id.imageButton3);
		gradesButton = (ImageButton) findViewById(R.id.imageButton4);
	}

	public void createListeners() {
		libraryButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(fixingEducation.this,
						LibraryView.class);
				fixingEducation.this.startActivity(newIntent);
			}
		});
		toDoButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(fixingEducation.this,
						ToDoView.class);
				fixingEducation.this.startActivity(newIntent);
			}
		});
		scheduleButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(fixingEducation.this,
						ScheduleView.class);
				fixingEducation.this.startActivity(newIntent);
			}
		});
		gradesButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(fixingEducation.this,
						GradesView.class);
				fixingEducation.this.startActivity(newIntent);
			}
		});
	}
}