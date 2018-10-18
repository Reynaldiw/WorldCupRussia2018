package com.reynaldiwijaya.worldcuprussia2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnHistory(View view) {
        Intent pindah = new Intent(this, HistoryActivity.class);
        startActivity(pindah);
    }

    public void btnSchedule(View view) {
        Intent pindah = new Intent(this, ScheduleActivity.class);
        startActivity(pindah);
    }

    public void btnTeams(View view) {
        Intent pindah = new Intent(this,RecycleActivity.class);
        startActivity(pindah);
    }
}
