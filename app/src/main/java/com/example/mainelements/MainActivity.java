package com.example.mainelements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mainTextView;
    Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");

        mainButton = findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mainTextView.setText("Button pressed!");
    }

}
