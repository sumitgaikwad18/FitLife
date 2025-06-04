package com.example.fitlife;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText emailInput;
    Button sendCodeButton, googleBtn, appleBtn;
    CheckBox termsCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInput = findViewById(R.id.emailInput);
        sendCodeButton = findViewById(R.id.sendCodeButton);
        googleBtn = findViewById(R.id.googleBtn);
        appleBtn = findViewById(R.id.appleBtn);
        termsCheck = findViewById(R.id.termsCheck);

        sendCodeButton.setOnClickListener(v -> {
            String email = emailInput.getText().toString().trim();
            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Verification code sent to " + email, Toast.LENGTH_SHORT).show();
                // Add actual code to send OTP here
            }
        });

        googleBtn.setOnClickListener(v ->
                Toast.makeText(this, "Continue with Google", Toast.LENGTH_SHORT).show());

        appleBtn.setOnClickListener(v ->
                Toast.makeText(this, "Continue with Apple", Toast.LENGTH_SHORT).show());
    }
}
