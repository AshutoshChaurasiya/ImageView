package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RadioButton rdopit, rdohamal, rdorai;
    private ImageView imgview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdopit = findViewById(R.id.rdopit);
        rdohamal = findViewById(R.id.rdohmal);
        rdorai = findViewById(R.id.rdorai);

        rdopit.setOnClickListener(this );
        rdohamal.setOnClickListener(this);
        rdorai.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdopit:
                Toast toast = Toast.makeText(this, "pit", Toast.LENGTH_LONG);
                toast.show();
                break;
        }

        switch (v.getId()) {
            case R.id.rdohmal:
                Toast toast = Toast.makeText(this, "hamal", Toast.LENGTH_LONG);
                toast.show();
                break;
        }

        switch (v.getId()) {
            case R.id.rdorai:
                Toast toast = Toast.makeText(this, "rai", Toast.LENGTH_LONG);
                toast.show();
                break;
        }
    }
}
