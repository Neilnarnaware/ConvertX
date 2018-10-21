package com.neil_narnaware.convertx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class lengthActivity extends AppCompatActivity {
    TextView txt1,txt2,optext;
    EditText editnumber;
    RadioButton rbdmili,rbdgram,rbdkg,rbdpound,rbdounce,rbdton,rbdmil,rbdgra,rbdk,rbdpoun,rbdounc,rbdto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);


        txt1=(TextView)findViewById(R.id.txt1);

    }
}
