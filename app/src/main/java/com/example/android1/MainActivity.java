package com.example.android1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTxtName; //this is class attribute that will be used in both onClick and
                                  // onCreate scopes

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.button1)  // if the view id is the same as the hello button, say hello
        {
            Toast.makeText(this, "Hello there, " + editTxtName.getText().toString(), Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.button2) // if the view id is the same as the goodbye button, say goodbye
        {
            Toast.makeText(this, "Goodbye, " + editTxtName.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }

    // toast message is the way used to display our hello and goodbye messages

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        editTxtName = findViewById(R.id.editTxtName);

        //whenever a button is clicked, the onClick method is executed
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
}