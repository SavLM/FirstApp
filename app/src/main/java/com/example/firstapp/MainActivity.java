package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit;
        final EditText txtInput;
        final TextView txtDisplay;

        btnSubmit = findViewById(R.id.main_button_view);
        txtInput = findViewById(R.id.input_text_view);
        txtDisplay = findViewById(R.id.output_text_view);

        // define onclick method of btnSubmit
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtInput.getText());
            }
        });
    }
}
