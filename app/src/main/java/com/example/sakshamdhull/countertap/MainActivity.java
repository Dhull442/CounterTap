package com.example.sakshamdhull.countertap;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public int i;
    public Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=0;
        bt = (Button) findViewById(R.id.button);
    }
    public void increase(View view)
    {
       i++;
       bt.setText(String.valueOf(i));
    }
    public void reset(View view)
    {
        i=0;
        bt.setText("RESET");
    }

}
