package com.reynaldiwijaya.worldcuprussia2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String[] namaNegara;
    int[] lambangNegara;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaNegara = getResources().getStringArray(R.array.nama_club);
        lambangNegara = new int[]{R.drawable.australia,R.drawable.peru,R.drawable.rusia,R.drawable.belgia,R.drawable.germany,R.drawable.eng,R.drawable.spanyol,R.drawable.polandia,R.drawable.islandia,R.drawable.serbia,R.drawable.portugal,R.drawable.francis,R.drawable.croatia,R.drawable.swiss,R.drawable.swedia, R.drawable.denmark,R.drawable.iran, R.drawable.jepang,R.drawable.koreaselatan,R.drawable.arabsaudi,R.drawable.brazil,R.drawable.uruguay,R.drawable.argentina,R.drawable.kolombia,R.drawable.meksiko,R.drawable.kostarika,R.drawable.panama,R.drawable.nigeria,R.drawable.mesir,R.drawable.senegal,R.drawable.tunisia,R.drawable.maroko};

        adapter = new Adapter(this, namaNegara,lambangNegara);

        Log.i("cek",String.valueOf(lambangNegara.length) + String.valueOf(namaNegara.length));

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecycleView.setAdapter(adapter);
    }
}
