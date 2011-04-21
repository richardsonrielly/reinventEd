package edu.fix;

import edu.fix.agenda.AgendaView;
import edu.fix.calendar.CalendarView;
import edu.fix.courses.CoursesView;
import edu.fix.grades.GradesView;
import edu.fix.options.OptionsView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FixingEducation extends Activity {
	/** Called when the activity is first created. */
	Button agendaButton;
	Button calendarButton;
	Button coursesButton;
	Button gradesButton;
	Button optionsButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		assignWidgets();
		createListeners();
	}

	public void assignWidgets() {
		agendaButton = (Button) findViewById(R.id.button1);
		calendarButton = (Button) findViewById(R.id.button2);
		coursesButton = (Button) findViewById(R.id.button3);
		gradesButton = (Button) findViewById(R.id.button4);
		optionsButton = (Button) findViewById(R.id.button5);
	}

	public void createListeners() {
		agendaButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(FixingEducation.this,
						AgendaView.class);
				FixingEducation.this.startActivity(newIntent);
			}
		});
		calendarButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(FixingEducation.this,
						CalendarView.class);
				FixingEducation.this.startActivity(newIntent);
			}
		});
		coursesButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(FixingEducation.this,
						CoursesView.class);
				FixingEducation.this.startActivity(newIntent);
			}
		});
		gradesButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(FixingEducation.this,
						GradesView.class);
				FixingEducation.this.startActivity(newIntent);
			}
		});
		optionsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent newIntent = new Intent(FixingEducation.this,
						OptionsView.class);
				FixingEducation.this.startActivity(newIntent);
			}
		});

	}
}