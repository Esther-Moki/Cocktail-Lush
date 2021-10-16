package com.moringaschool.cocktaillush;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyCocktailArrayAdapter  extends ArrayAdapter {
    private Context mContext;
    private String[] mCocktails;
    private String[] mIngredients;

    public MyCocktailArrayAdapter(Context mContext, int resource, String[] mCocktails, String[] mIngredients) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mCocktails = mCocktails;
        this.mIngredients = mIngredients;
    }

    @Override
    public Object getItem(int position) {
        String cocktail = mCocktails[position];
        String ingredient = mIngredients[position];
        return String.format("%s \nThis cocktail contains: %s", cocktail, ingredient);
    }

    @Override
    public int getCount() {
        return mCocktails.length;
    }
}
