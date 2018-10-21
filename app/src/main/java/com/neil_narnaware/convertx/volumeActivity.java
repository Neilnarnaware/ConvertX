package com.neil_narnaware.convertx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class volumeActivity extends AppCompatActivity {
    TextView txt2,fromtxt,optext;
    EditText inputext;
    RadioButton rbdmili,rbdliter,rbdfoot,rbdinch,rbdyard,rbdtspoon,rbdmil,rbdlit,rbdcfoot,rbdcinch,rbdyar,rbdspoon;
    Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        txt2 = (TextView) findViewById(R.id.txt2);
        fromtxt = (TextView) findViewById(R.id.fromtxt);
        inputext = (EditText) findViewById(R.id.inputxt);
        optext = (TextView) findViewById(R.id.optext);
        rbdcfoot = (RadioButton) findViewById(R.id.rbdcfoot);
        rbdmili = (RadioButton) findViewById(R.id.rbdmili);
        rbdliter = (RadioButton) findViewById(R.id.rbdliter);
        rbdfoot = (RadioButton) findViewById(R.id.rbdfoot);
        rbdcinch = (RadioButton) findViewById(R.id.rbdcinch);
        rbdinch = (RadioButton) findViewById(R.id.rbdinch);
        rbdyard = (RadioButton) findViewById(R.id.rbdyard);
        rbdtspoon = (RadioButton) findViewById(R.id.rbdtspoon);
        rbdmil = (RadioButton) findViewById(R.id.rbdmil);
        rbdlit = (RadioButton) findViewById(R.id.rbdlit);
        btnsubmit=(Button)findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double opt;
                try {
                    String s = inputext.getText().toString();
                    double temp = Double.parseDouble(s);
                    if (rbdmili.isChecked()) {
                        if (rbdmil.isChecked()) {
                            opt = (temp * 1);
                            optext.setText("" + opt);

                        } else if (rbdlit.isChecked()) {
                            opt = (temp * 0.001);
                            optext.setText("" + opt);
                        } else if (rbdcfoot.isChecked()) {
                            opt = (temp * 0.00003531);
                            optext.setText("" + opt);
                        } else if (rbdcinch.isChecked()) {
                            opt = (temp * 0.06102);
                            optext.setText("" + opt);
                        } else if (rbdyar.isChecked()) {
                            opt = (temp * 0.000001307);
                            optext.setText("" + opt);
                        } else if (rbdspoon.isChecked()) {
                            opt = (temp * 0.0666);
                            optext.setText("" + opt);
                        }
                    }
                    if (rbdliter.isChecked()) {
                        if (rbdmil.isChecked()) {
                            opt = (temp * 1000);
                            optext.setText("" + opt);
                        } else if (rbdlit.isChecked()) {
                            opt = (temp * 1);
                            optext.setText("" + opt);
                        } else if (rbdcfoot.isChecked()) {
                            opt = (temp * 0.03531);
                            optext.setText("" + opt);
                        } else if (rbdcinch.isChecked()) {
                            opt = (temp * 61.02);
                            optext.setText("" + opt);
                        } else if (rbdyar.isChecked()) {
                            opt = (temp * 0.001307);
                            optext.setText("" + opt);
                        } else if (rbdspoon.isChecked()) {
                            opt = (temp * 66.666);
                            optext.setText("" + opt);
                        }
                    }
                    if (rbdfoot.isChecked()) {
                        if (rbdmil.isChecked()) {
                            opt = (temp * 28316.84);
                            optext.setText("" + opt);
                        } else if (rbdlit.isChecked()) {
                            opt = (temp * 28.316);
                            optext.setText("" + opt);
                        } else if (rbdcfoot.isChecked()) {
                            opt = (temp * 1);
                            optext.setText("" + opt);
                        } else if (rbdcinch.isChecked()) {
                            opt = (temp * 1728);
                            optext.setText("" + opt);
                        } else if (rbdyar.isChecked()) {
                            opt = (temp * 0.037);
                            optext.setText("" + opt);
                        } else if (rbdspoon.isChecked()) {
                            opt = (temp * 1887.78);
                            optext.setText("" + opt);
                        }
                    }
                    if (rbdinch.isChecked()) {
                        if (rbdmil.isChecked()) {
                            opt = (temp * 16.387);
                            optext.setText("" + opt);
                        } else if (rbdlit.isChecked()) {
                            opt = (temp * 0.0163);
                            optext.setText("" + opt);
                        } else if (rbdcfoot.isChecked()) {
                            opt = (temp * 0.00057);
                            optext.setText("" + opt);
                        } else if (rbdcinch.isChecked()) {
                            opt = (temp * 1);
                            optext.setText("" + opt);
                        } else if (rbdyar.isChecked()) {
                            opt = (temp * 0.000021);
                            optext.setText("" + opt);
                        } else if (rbdspoon.isChecked()) {
                            opt = (temp * 1.0924);
                            optext.setText("" + opt);
                        }
                    }
                    if (rbdyard.isChecked()) {
                        if (rbdmil.isChecked()) {
                            opt = (temp * 764554.85);
                            optext.setText("" + opt);
                        } else if (rbdlit.isChecked()) {
                            opt = (temp * 764.554);
                            optext.setText("" + opt);
                        } else if (rbdcfoot.isChecked()) {
                            opt = (temp * 27);
                            optext.setText("" + opt);
                        } else if (rbdcinch.isChecked()) {
                            opt = (temp * 46656);
                            optext.setText("" + opt);
                        } else if (rbdyar.isChecked()) {
                            opt = (temp * 1);
                            optext.setText("" + opt);
                        } else if (rbdspoon.isChecked()) {
                            opt = (temp * 50970.32);
                            optext.setText("" + opt);
                        }
                    }
                    if (rbdtspoon.isChecked()) {
                        if (rbdmil.isChecked()) {
                            opt = (temp * 15);
                            optext.setText("" + opt);
                        } else if (rbdlit.isChecked()) {
                            opt = (temp * 0.015);
                            optext.setText("" + opt);
                        } else if (rbdcfoot.isChecked()) {
                            opt = (temp * 0.00529);
                            optext.setText("" + opt);
                        } else if (rbdcinch.isChecked()) {
                            opt = (temp * 0.915);
                            optext.setText("" + opt);
                        } else if (rbdyar.isChecked()) {
                            opt = (temp * 0.0000196);
                            optext.setText("" + opt);
                        } else if (rbdspoon.isChecked()) {
                            opt = (temp * 1);
                            optext.setText("" + opt);
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });




    }
}
