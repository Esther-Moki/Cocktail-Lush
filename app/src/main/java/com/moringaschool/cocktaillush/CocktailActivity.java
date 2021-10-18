package com.moringaschool.cocktaillush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CocktailActivity extends AppCompatActivity {
    private static final String TAG = CocktailActivity.class.getSimpleName();

//    private TextView mNameTextView;
//    private ListView mListView;

    @BindView(R.id.nameTextView) TextView mNameTextView;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;


    public List<Drink> cocktails;
    public List<CocktailSearchResponse> categories;





//    private String[] cocktails = new String[] {"Jungle Bird", "Long Island Iced Tea",
//                " Gin Gin Mule", "White Lady", " El Diablo", " Cosmopolitan",
//                "Zombie", " Hanky Panky", "Vodka Martini", " Caipirinha",
//                "Tom Collins", "Bamboo", " Tommy’s Margarita",
//                "Last Word", ". Pina Colada"};
//    private String[] ingredients = new String[] {"Gin", "Absinthe verte", "Tequila", "Brandy",
//            "Armamgnac blanche", "Cognac", "Pavlova vodka", "Vanila infused gin",
//            "Toffee vodka", "Tequila blanco", "Amaretto liqueur", "Cucumber Sake",
//            "Beer-Italian Lager", "Calamansi Juice", "Blue Curacao syrup", "Black Pepper" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail);
        ButterKnife.bind(this);

//        mListView = (ListView) findViewById(R.id.listView);
//        mNameTextView = (TextView) findViewById(R.id.nameTextView);

        // ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cocktails);
       // MyCocktailArrayAdapter adapter = new MyCocktailArrayAdapter(this, android.R.layout.simple_list_item_1, cocktails, ingredients); // the arguments must match constructor's parameters!
       // mListView.setAdapter(adapter);

//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String cocktail = ((TextView) view).getText().toString();
//                Toast.makeText(CocktailActivity.this, cocktail, Toast.LENGTH_LONG).show();
//            }
//        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
       // mNameTextView.setText("Here are all the " + name + " cocktails" );

        //API part
        CocktailApi client = CocktailDbClient.getClient();

        Call<CocktailSearchResponse> call = client.getCocktails(name);

        call.enqueue(new Callback<CocktailSearchResponse>() {
            @Override
            public void onResponse(Call<CocktailSearchResponse> call, Response<CocktailSearchResponse> response) {
                if (response.isSuccessful()) {
                    List<Drink> cocktailsList = response.body().getDrinks();

                    String[] cocktails = new String[cocktailsList.size()];
                    String[]  categories = new String[cocktailsList.size()];

                    for (int i = 0; i < cocktails.length; i++){
                        cocktails[i] = cocktailsList.get(i).getStrDrink();
                    }

                    for (int i = 0; i < categories.length; i++) {
//                        Category category = cocktailsList.get(i).getStrCategory.get(0);
//                        categories[i] = category.();
                        cocktails[i] = cocktailsList.get(i).getStrCategory();

                    }

                    ArrayAdapter adapter
                            = new MyCocktailArrayAdapter(CocktailActivity.this, android.R.layout.simple_list_item_1, cocktails,categories);
                    mListView.setAdapter(adapter);

                    showCocktails();
                } else {
                    showUnsuccessfulMessage();
                }
            }



            @Override
            public void onFailure(Call<CocktailSearchResponse> call, Throwable t) {
                Log.e("Error Message", "onFailure: ",t );
                hideProgressBar();
                showFailureMessage();
            }

        });
    }


    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showCocktails() {
        mListView.setVisibility(View.VISIBLE);
        mNameTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}