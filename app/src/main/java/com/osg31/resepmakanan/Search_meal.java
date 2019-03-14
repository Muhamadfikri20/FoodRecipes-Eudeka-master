package com.osg31.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class Search_meal extends AppCompatActivity {


    @BindView(R.id.search) TextInputEditText cari;
    @BindView(R.id.ok) Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_meal);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent proses= new Intent(Search_meal.this, list_meal.class);
                proses.putExtra("data",cari.getText().toString());
                startActivity(proses);
            }
        });

    }
}
