package com.example.assignment_2021101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText editTextName, editTextStudentID, editTextDateOfBirth, editTextPhoneNumber, editTextEmail;
    TextView submitMessage;
    final String SUBMIT_SUCCESS = "Submit success";
    final String SUBMIT_FAIL = "Invalid input";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextStudentID = findViewById(R.id.editTextStudentID);
        editTextDateOfBirth = findViewById(R.id.editTextDateOfBirth);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);

        submitMessage = findViewById(R.id.result);

        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hasInputTextEmpty(editTextName, editTextStudentID, editTextDateOfBirth,
                        editTextPhoneNumber, editTextEmail)) {
                    submitMessage.setText(SUBMIT_FAIL);
                } else {
                    submitMessage.setText(SUBMIT_SUCCESS);
                }
            }
        });
    }

    private boolean hasInputTextEmpty(EditText... editText) {
        for (EditText temp : editText) {
            if (temp.getText().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }

}