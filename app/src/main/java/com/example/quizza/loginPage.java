package com.example.quizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        final ProgressBar loadingProgressBar = findViewById(R.id.loading);
        loginButton.setEnabled(true);//TODO: add valid data
        Log.d("Debug","Test username and pwd is Test");
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernameEditText.getText().toString().equals("Test")&&passwordEditText.getText().toString().equals("Test"))//TODO:add connect to database and valid the username and password
                {
                    Toast.makeText(getApplicationContext(),"Login successful, load to Canvas to test",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), class_cavans.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Login error, please try again",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}