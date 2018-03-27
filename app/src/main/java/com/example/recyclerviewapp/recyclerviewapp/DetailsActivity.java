package com.example.recyclerviewapp.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView detailsTitle, detailsDescription;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsTitle = (TextView) findViewById(R.id.detailsTitleId);
        detailsDescription = (TextView) findViewById(R.id.detailsDescriptionId);

        extras = getIntent().getExtras();

        if (extras != null) {
            detailsTitle.setText(extras.getString("title"));
            detailsDescription.setText(extras.getString("description"));
        }
    }
}
