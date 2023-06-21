package com.techstudios.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup group;
    RadioButton checked;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group = (RadioGroup) findViewById(R.id.selector);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ChosenRadioButton = group.getCheckedRadioButtonId();
                checked = (RadioButton) findViewById(ChosenRadioButton);
                Toast.makeText(MainActivity.this, "You chose "+checked.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}