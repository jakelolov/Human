package com.example.yarik.human2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yarik.human2.Peaple.Pupil;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button btnClose;
    private TextView txtName;
    private Button btnPupil;
    private EditText pupNm;
    private String pupName = "LOLo";
    private Pupil createPupil(String name){
        Pupil pp = new Pupil(name);
//        pp.setName(name);
        return pp;
    }
    private Pupil createPupil(String lastname,String name){
        Pupil pp = new Pupil(lastname);
//        pp.setName(name);
        return pp;
    }

    public Pupil pup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pup = new Pupil();
        pup.jump();

        btnPupil = findViewById(R.id.btnPupil);
        btnPupil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pupil a = createPupil(pupNm.getText().toString());
                if (a.getName().isEmpty())
                    Toast.makeText(getBaseContext(),"No name",Toast.LENGTH_SHORT).show();
                else
                    txtName.setText(a.getName());
            }
        });

        btnClose = findViewById(R.id.btnClose);
        txtName = findViewById(R.id.txtName);
        pupNm = findViewById(R.id.editName);



        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }




}
