package com.example.alertdialouge;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnAlert;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = findViewById(R.id.btnAlert);
        builder = new AlertDialog.Builder(this);
        btnAlert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAlert){
            builder.setMessage("Do you want to close program??")
                    .setCancelable(true)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"You clicked Yes", Toast.LENGTH_LONG).show();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(),"you clicked no", Toast.LENGTH_LONG).show();
                }
            });
            AlertDialog alert = builder.create();
            alert.setTitle("This is the title");
            alert.show();
        }
    }
}
