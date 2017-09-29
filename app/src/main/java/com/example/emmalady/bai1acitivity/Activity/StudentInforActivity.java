package com.example.emmalady.bai1acitivity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.emmalady.bai1acitivity.Parcelable.MyParcelable;
import com.example.emmalady.bai1acitivity.R;

public class StudentInforActivity extends AppCompatActivity {
    private TextView tvName, tvOrigin, tvBirth, tvSex, tvClass, tvCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        tvName = (TextView) findViewById(R.id.tvShowName);
        tvOrigin = (TextView) findViewById(R.id.tvShowOrigin);
        tvBirth = (TextView) findViewById(R.id.tvShowBirth);
        tvSex = (TextView) findViewById(R.id.tvShowSex);
        tvClass = (TextView) findViewById(R.id.tvShowClass);
        tvCourse = (TextView) findViewById(R.id.tvShowCourse);

        //Receive Date by Parcelable
        MyParcelable getParcel = (MyParcelable)getIntent().getParcelableExtra("Object");
        tvName.setText(getParcel.getmName());
        tvOrigin.setText(getParcel.getmOrigin());
        tvBirth.setText(getParcel.getmBirth());
        tvSex.setText(getParcel.getmSex());
        tvClass.setText(getParcel.getmClass());
        tvCourse.setText(getParcel.getmCourse());
    }
}
