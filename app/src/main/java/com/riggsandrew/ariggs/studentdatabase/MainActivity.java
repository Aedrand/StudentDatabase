package com.riggsandrew.ariggs.studentdatabase;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.mainList);
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Andrew Riggs", "Computer Science", "2018");
        studentList.add(student1);
        Student student2 = new Student("Andrew Riggs", "Computer Science", "2018");
        studentList.add(student2);
        Student student3 = new Student("Andrew Riggs", "Computer Science", "2018");
        studentList.add(student3);
        Student student4 = new Student("Andrew Riggs", "Computer Science", "2018");
        studentList.add(student4);

        StudentAdapter studentAdapter = new StudentAdapter(this, R.layout.single_line, studentList);
        listView.setAdapter(studentAdapter);



    }

}
