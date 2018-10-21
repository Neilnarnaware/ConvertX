package com.neil_narnaware.convertx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class tempActivity extends AppCompatActivity {
    TextView txt1,optext;
    EditText inputedit;
    RadioButton rbdf,rbdc;
    Button btnsubmit;
    ProgressBar pbar;
    Double opt;
    RadioGroup rbdgrp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        txt1=(TextView)findViewById(R.id.txt1);
        optext=(TextView)findViewById(R.id.optext);
        inputedit=(EditText)findViewById(R.id.inputedit);
        rbdc=(RadioButton)findViewById(R.id.rbdc);
        rbdf=(RadioButton)findViewById(R.id.rbdf);
        btnsubmit=(Button)findViewById(R.id.btnsubmit);
        pbar=(ProgressBar)findViewById(R.id.pbar);
        rbdgrp=(RadioGroup)findViewById(R.id.rbdgrp);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String q = inputedit.getText().toString();
                Double temp = Double.parseDouble(q);

                    if (rbdf.isChecked()) {
                        opt = ((temp* 9) / 5) + 32;
                        optext.setText("" + opt);
                        pbar.setVisibility(View.VISIBLE);

                    } else if (rbdc.isChecked()) {
                        opt = ((temp - 32) * 5) / 9;
                        optext.setText("" + opt);
                        pbar.setVisibility(View.VISIBLE);
                    } else if (rbdc.isChecked() && rbdf.isChecked()) {
                        Toast.makeText(tempActivity.this, "this is invalid", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(tempActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (q.equals(null)) {
                        Toast.makeText(tempActivity.this, "enter some input", Toast.LENGTH_SHORT).show();
                    }
                }

        });
        pbar.setVisibility(View.INVISIBLE);
        optext.setText("");
    }
}
