package com.example.dz_6_month2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button button;
    TextView text,text2,text3,text4,text5,text6,text7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      email =  findViewById(R.id.edit);
      password =  findViewById(R.id.edit2);
      text=findViewById(R.id.vhod);
      text2=findViewById(R.id.enter);
      text3=findViewById(R.id.edit);
      text4=findViewById(R.id.edit2);
      text5=findViewById(R.id.forget);
      text6=findViewById(R.id.forget2);
    

      button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "выш имаил пустой b gfhjkm", Toast.LENGTH_SHORT).show();
                } else {
                    if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                        Toast.makeText(getApplicationContext(), "добро пожаловать", Toast.LENGTH_SHORT).show();
                        text.setVisibility(View.GONE);
                        text2.setVisibility(View.GONE);
                        text3.setVisibility(View.GONE);
                        text4.setVisibility(View.GONE);
                        text5.setVisibility(View.GONE);
                        text6.setVisibility(View.GONE);


                      button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));

                    } else {
                        Toast.makeText(getApplicationContext(), "неправильно вели породт", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
}