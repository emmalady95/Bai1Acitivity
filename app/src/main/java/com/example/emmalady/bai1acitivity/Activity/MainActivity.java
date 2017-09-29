package com.example.emmalady.bai1acitivity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.emmalady.bai1acitivity.R;

public class MainActivity extends AppCompatActivity {

    private Button btnOK;
    private EditText edName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOK = (Button) findViewById(R.id.btnOK);
        edName = (EditText) findViewById(R.id.edName);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentActivity.class);
                String name = edName.getText().toString();
                i.putExtra("Name",name);
                startActivity(i);
            }
        });
    }

}
