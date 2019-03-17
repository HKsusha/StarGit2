package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
       import android.view.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mainTextView;
    Button button;
    int pressCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        mainTextView = findViewById(R.id.text);
        button.setOnClickListener(this);
        mainTextView.setText("Вы пока еще не нажимали кнопку");

    }
    @Override
    public void onClick(View v){
        this.pressCount++;
        mainTextView.setText("Вы попали в кнопку: " + this.pressCount + " раз");
    }
}
