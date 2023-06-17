package com.example.squadject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OTP extends AppCompatActivity {

    private EditText text1, text2, text3, text4;
    private Button confirmButton, resendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        // Initialize EditTexts
        text1 = findViewById(R.id.text1_otp);
        text2 = findViewById(R.id.text2_otp);
        text3 = findViewById(R.id.text3_otp);
        text4 = findViewById(R.id.text4_otp);

        // Initialize Buttons
        confirmButton = findViewById(R.id.confirm_otp);
        resendButton = findViewById(R.id.resendOtp_otp);

        // Set onClickListener for confirmButton
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle confirm button click event here
                String otp = text1.getText().toString() +
                        text2.getText().toString() +
                        text3.getText().toString() +
                        text4.getText().toString();
            }
        });

        // Set onClickListener for resendButton
        resendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle resend button click event here
            }
        });
    }
}
