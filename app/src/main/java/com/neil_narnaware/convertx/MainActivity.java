package com.neil_narnaware.convertx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView welcometext,txtchoose;
    RadioButton rbd1,rbd2,rbd3,rbd4,rbd5;
    Button submitbtn;
    ProgressBar pbar;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcometext=(TextView)findViewById(R.id.welcometext);
        txtchoose=(TextView)findViewById(R.id.txtchoose);
        rbd1=(RadioButton)findViewById(R.id.rbd1);
        rbd2=(RadioButton)findViewById(R.id.rbd2);
        rbd3=(RadioButton)findViewById(R.id.rbd3);
        rbd4=(RadioButton)findViewById(R.id.rbd4);
        rbd5=(RadioButton)findViewById(R.id.rbd5);
        submitbtn=(Button)findViewById(R.id.submitbtn);
        pbar=(ProgressBar)findViewById(R.id.pbar);
    submitbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        if(rbd1.isChecked()){
            intent=new Intent(getApplicationContext(),tempActivity.class);
            pbar.setVisibility(View.VISIBLE);
            startActivity(intent);
        }
            else if(rbd2.isChecked()){
            intent=new Intent(getApplicationContext(),lengthActivity.class);
            pbar.setVisibility(View.VISIBLE);
            startActivity(intent);
        }
            else if(rbd3.isChecked()){
            intent=new Intent(getApplicationContext(),currencyActivity.class);
            pbar.setVisibility(View.VISIBLE);
            startActivity(intent);
        }
            else if(rbd4.isChecked()){
            intent=new Intent(getApplicationContext(),weightActivity.class);
            pbar.setVisibility(View.VISIBLE);
            startActivity(intent);
        }
            else if(rbd5.isChecked()){
            intent=new Intent(getApplicationContext(),volumeActivity.class);
            pbar.setVisibility(View.VISIBLE);
            startActivity(intent);
        }
            else{
            Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
        }


        }
    });

        pbar.setVisibility(View.INVISIBLE);

    }

}
