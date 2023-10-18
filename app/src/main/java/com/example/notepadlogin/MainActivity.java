package com.example.notepadlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eUser, ePass;
    private Button btnLogin;

    private String username = "admin";
    private String password = "adminn";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUser = findViewById(R.id.etUsername);
        ePass = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eUser.getText().toString().equalsIgnoreCase(username) && ePass.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(MainActivity.this, ActivityBottom .class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "LOGIN BERHASIL!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Username atau Password Yang Anda Masukkan Salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}