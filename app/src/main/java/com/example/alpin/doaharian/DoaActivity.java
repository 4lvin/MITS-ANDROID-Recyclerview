package com.example.alpin.doaharian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by Alpin on 13/07/2017.
 */

public class DoaActivity extends AppCompatActivity {

private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doa);

        textView=(TextView) findViewById(R.id.tv_ket);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("message"));
    }
}