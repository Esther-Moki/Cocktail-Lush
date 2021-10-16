package com.moringaschool.cocktaillush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
  //  public static final String TAG = MainActivity.class.getSimpleName();
//    private Button mFindCocktailButton;
//    private EditText mNameEditText;
//    private TextView mAppNameTextView;
    @BindView(R.id. mFindCocktailButton) Button  mFindCocktailButton;
    @BindView(R.id.mNameEditText) EditText mNameEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mFindCocktailButton = (Button)findViewById(R.id.findCocktailButton);
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);

        mFindCocktailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
               // Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, CocktailActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
               //Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
            }
        });
    }

}