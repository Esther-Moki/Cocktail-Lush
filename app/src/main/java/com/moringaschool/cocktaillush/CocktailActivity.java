package com.moringaschool.cocktaillush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CocktailActivity extends AppCompatActivity {
    private TextView mNameTextView;
    private ListView mListView;



    private String[] cocktails = new String[] {"Jungle Bird", "Long Island Iced Tea",
                " Gin Gin Mule", "White Lady", " El Diablo", " Cosmopolitan",
                "Zombie", " Hanky Panky", "Vodka Martini", " Caipirinha",
                "Tom Collins", "Bamboo", " Tommy’s Margarita",
                "Last Word", ". Pina Colada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail);

        mListView = (ListView) findViewById(R.id.listView);
        mNameTextView = (TextView) findViewById(R.id.nameTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cocktails);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String cocktail = ((TextView)view).getText().toString();
                Toast.makeText(CocktailActivity.this, cocktail, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Here are all the " + name + " cocktails" );

    }
}