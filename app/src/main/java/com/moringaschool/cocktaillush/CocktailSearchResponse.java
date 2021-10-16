
package com.moringaschool.cocktaillush;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CocktailSearchResponse {

    @SerializedName("drinks")
    @Expose
    private List<Drink> drinks = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CocktailSearchResponse() {
    }

    /**
     * 
     * @param drinks
     */
    public CocktailSearchResponse(List<Drink> drinks) {
        super();
        this.drinks = drinks;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

}
