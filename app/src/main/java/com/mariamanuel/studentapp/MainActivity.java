package com.mariamanuel.studentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      b1=(AppCompatButton) findViewById(R.id.addbtn);
      b2=(AppCompatButton) findViewById(R.id.viewbtn);
      b2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Intent i=new Intent(getApplicationContext(),Viewstudent.class);
              startActivity(i);

          }
      });
      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),Addstudent.class);
              startActivity(i);
          }
      });
    }
}