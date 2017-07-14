package com.example.alpin.doaharian;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Doa> dataSet = new ArrayList<>();
        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(dataSet);

        dataSet.add(new Doa("Doa Sebelum Tidur"));
        dataSet.add(new Doa("Doa Bangun Tidur"));
        dataSet.add(new Doa("Doa Sebelum Wudhu"));
        dataSet.add(new Doa("Doa Sesudah Wudhu"));
        dataSet.add(new Doa("Doa Keluar Rumah"));
        dataSet.add(new Doa("Doa Masuk Rumah"));
        dataSet.add(new Doa("Doa Pergi ke Masjid"));
        dataSet.add(new Doa("Doa Masuk Masjid"));
        dataSet.add(new Doa("Doa Keluar Masjid"));
        dataSet.add(new Doa("Doa Sesudah Adzan"));


        RecyclerView rvInbox = (RecyclerView) findViewById(R.id.rv_main);
        rvInbox.setLayoutManager(new LinearLayoutManager(this));
        rvInbox.addItemDecoration(new SpacesItemDecoration(this, R.dimen.space_5));
        rvInbox.setAdapter(adapter);


        rvInbox.addOnItemTouchListener(new RecyclerTouchListener(MainActivity.this, rvInbox,
                new RecyclerTouchListener.ClickListener() {
                    @Override
                    public void onClick(View view, int position) {
                        if (position == 0)            {
                            Intent intent = new Intent(MainActivity.this , DoaActivity.class);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onLongClick(View view, int position) {

                    }

                }));

}

    }


