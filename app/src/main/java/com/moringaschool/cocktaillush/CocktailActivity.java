package com.moringaschool.cocktaillush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CocktailActivity extends AppCompatActivity {
    private TextView mNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail);
        mNameTextView = (TextView) findViewById(R.id.nameTextView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Here are all the " + name + " cocktails" );

    }
}