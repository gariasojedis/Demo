package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private EditText editTextText2, editTextTextPassword2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText2 = (EditText) findViewById(R.id.editTextText2);
        editTextTextPassword2 = (EditText) findViewById(R.id.editTextTextPassword2);
        Button loginButton = findViewById(R.id.button);
    }

    public void sendMenssage (View view){
        Log.i("tagNueo","hola mundo");
        String username = editTextText2.getText().toString();
        String password = editTextTextPassword2.getText().toString();
        if (!username.isEmpty() && !password.isEmpty()){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class );
            intent.putExtra("USERNAME", username);
            startActivity(intent);
        } else {
            //error
        }
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume en MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause en MainActivity", Toast.LENGTH_SHORT).show();
    }
}