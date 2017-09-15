package com.riggsandrew.ariggs.studentdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Andrew Riggs on 9/15/2017.
 */

public class StudentAdapter extends ArrayAdapter<Student> {

    private int layoutResource;

    public StudentAdapter(Context context, int thisLayoutResource, List<Student> studentList) {
        super(context, thisLayoutResource, studentList);
        this.layoutResource = thisLayoutResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

         View view = convertView;

        if(view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(layoutResource, null);
        }

        Student student = getItem(position);

        if(student != null) {
            TextView nameLine = (TextView) view.findViewById(R.id.lineName);
            TextView majorYearLine = (TextView) view.findViewById(R.id.lineMajorYear);

            if(nameLine != null) {
                nameLine.setText(student.getName());
            }

            if(majorYearLine != null) {
                majorYearLine.setText(student.getMajor() + " - " + student.getGradYear());
            }
        }

        return view;

    }



}
