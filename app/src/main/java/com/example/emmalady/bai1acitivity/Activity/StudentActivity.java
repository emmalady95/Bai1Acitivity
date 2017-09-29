package com.example.emmalady.bai1acitivity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.emmalady.bai1acitivity.Parcelable.MyParcelable;
import com.example.emmalady.bai1acitivity.R;

public class StudentActivity extends AppCompatActivity {

    private TextView tvName;
    private EditText edOrigin, edBirth, edSex, edClass, edCourse;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        tvName = (TextView) findViewById(R.id.tvName1);
        Intent iRec = getIntent();
        String rec = iRec.getStringExtra("Name");
        tvName.setText(rec);
        edOrigin = (EditText) findViewById(R.id.edOrigin);
        edBirth = (EditText) findViewById(R.id.edBirth);
        edSex = (EditText) findViewById(R.id.edSex);
        edClass = (EditText) findViewById(R.id.edClass);
        edCourse = (EditText) findViewById(R.id.edCourse);
        btnSend = (Button) findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextStudentInfor = new Intent(StudentActivity.this, StudentInforActivity.class);
                String Name, Birth, Origin,Sex, Class, Course;
                Name = tvName.getText().toString();
                Origin = edOrigin.getText().toString();
                Birth = edBirth.getText().toString();
                Sex = edSex.getText().toString();
                Class = edClass.getText().toString();
                Course = edCourse.getText().toString();

                //Passing Data by Pacelable
                MyParcelable parcel = new MyParcelable();
                parcel.setmName(Name);
                parcel.setmOrigin(Origin);
                parcel.setmBirth(Birth);
                parcel.setmSex(Sex);
                parcel.setmClass(Class);
                parcel.setmCourse(Course);
                iNextStudentInfor.putExtra("Object", parcel);
                startActivity(iNextStudentInfor);
            }
        });
    }
}
