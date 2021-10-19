
package com.moringaschool.cocktaillush.models;

import androidx.annotation.NonNull;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
@Generated("jsonschema2pojo")


@Parcel

public class Drink{

    @SerializedName("idDrink")
    @Expose
    private String idDrink;
    @SerializedName("strDrink")
     @Expose
     private String strDrink;
//    @SerializedName("strDrinkAlternate")
//    @Expose
//    private Object strDrinkAlternate;
    @SerializedName("strTags")
    @Expose
    private String strTags;
    @SerializedName("strVideo")
//    @Expose
//    private Object strVideo;
//    @SerializedName("strCategory")
    @Expose
    private String strCategory;
    @SerializedName("strIBA")
    @Expose
    private String strIBA;
    @SerializedName("strAlcoholic")
    @Expose
    private String strAlcoholic;
    @SerializedName("strGlass")
    @Expose
    private String strGlass;
    @SerializedName("strInstructions")
    @Expose
    private String strInstructions;
  //  @SerializedName("strInstructionsES")
//    @Expose
//    private Object strInstructionsES;
//    @SerializedName("strInstructionsDE")
//    @Expose
//    private String strInstructionsDE;
//    @SerializedName("strInstructionsFR")
//    @Expose
//    private Object strInstructionsFR;
     @SerializedName("strInstructionsIT")
     @Expose
     private String strInstructionsIT;
 //   @SerializedName("strInstructionsZH-HANS")
//    @Expose
//    private Object strInstructionsZHHANS;
//    @SerializedName("strInstructionsZH-HANT")
//    @Expose
//    private Object strInstructionsZHHANT;
    @SerializedName("strDrinkThumb")
    @Expose
    private String strDrinkThumb;
    //@SerializedName("strIngredient1")
//    @Expose
//    private String strIngredient1;
//    @SerializedName("strIngredient2")
//    @Expose
//    private String strIngredient2;
//    @SerializedName("strIngredient3")
//    @Expose
//    private String strIngredient3;
//    @SerializedName("strIngredient4")
//    @Expose
//    private String strIngredient4;
//    @SerializedName("strIngredient5")
//    @Expose
//    private Object strIngredient5;
//    @SerializedName("strIngredient6")
//    @Expose
//    private Object strIngredient6;
//    @SerializedName("strIngredient7")
//    @Expose
//    private Object strIngredient7;
//    @SerializedName("strIngredient8")
//    @Expose
//    private Object strIngredient8;
//    @SerializedName("strIngredient9")
//    @Expose
//    private Object strIngredient9;
//    @SerializedName("strIngredient10")
//    @Expose
//    private Object strIngredient10;
//    @SerializedName("strIngredient11")
//    @Expose
//    private Object strIngredient11;
//    @SerializedName("strIngredient12")
//    @Expose
//    private Object strIngredient12;
//    @SerializedName("strIngredient13")
//    @Expose
//    private Object strIngredient13;
//    @SerializedName("strIngredient14")
//    @Expose
//    private Object strIngredient14;
//    @SerializedName("strIngredient15")
//    @Expose
//    private Object strIngredient15;
//    @SerializedName("strMeasure1")
//    @Expose
//    private String strMeasure1;
//    @SerializedName("strMeasure2")
//    @Expose
//    private String strMeasure2;
//    @SerializedName("strMeasure3")
//    @Expose
//    private String strMeasure3;
//    @SerializedName("strMeasure4")
//    @Expose
//    private Object strMeasure4;
//    @SerializedName("strMeasure5")
//    @Expose
//    private Object strMeasure5;
//    @SerializedName("strMeasure6")
//    @Expose
//    private Object strMeasure6;
//    @SerializedName("strMeasure7")
//    @Expose
//    private Object strMeasure7;
//    @SerializedName("strMeasure8")
//    @Expose
//    private Object strMeasure8;
//    @SerializedName("strMeasure9")
//    @Expose
//    private Object strMeasure9;
//    @SerializedName("strMeasure10")
//    @Expose
//    private Object strMeasure10;
//    @SerializedName("strMeasure11")
//    @Expose
//    private Object strMeasure11;
//    @SerializedName("strMeasure12")
//    @Expose
//    private Object strMeasure12;
//    @SerializedName("strMeasure13")
//    @Expose
//    private Object strMeasure13;
//    @SerializedName("strMeasure14")
//    @Expose
//    private Object strMeasure14;
//    @SerializedName("strMeasure15")
//    @Expose
//    private Object strMeasure15;
    @SerializedName("strImageSource")
    @Expose
    private String strImageSource;
    @SerializedName("strImageAttribution")
    @Expose
    private String strImageAttribution;
    @SerializedName("strCreativeCommonsConfirmed")
    @Expose
    private String strCreativeCommonsConfirmed;
    @SerializedName("dateModified")
    @Expose
    private String dateModified;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Drink() {
    }

    /**
     * 
     * @param strInstructionsDE
     * @param strImageSource
     * @param strIngredient10
     * @param strDrink
     * @param strIngredient12
     * @param strIngredient11
     * @param strIngredient14
     * @param strCategory
     * @param strAlcoholic
     * @param strIngredient13
     * @param strIngredient15
     * @param strCreativeCommonsConfirmed
     * @param strIBA
     * @param strVideo
     * @param strTags
     * @param strInstructions
     * @param strIngredient1
     * @param strIngredient3
     * @param strIngredient2
     * @param strIngredient5
     * @param strIngredient4
     * @param strIngredient7
     * @param strIngredient6
     * @param strInstructionsZHHANS
     * @param strIngredient9
     * @param strInstructionsFR
     * @param strInstructionsZHHANT
     * @param strIngredient8
     * @param idDrink
     * @param strInstructionsES
     * @param strInstructionsIT
     * @param strGlass
     * @param strMeasure12
     * @param strMeasure13
     * @param strMeasure10
     * @param strMeasure11
     * @param strImageAttribution
     * @param dateModified
     * @param strDrinkAlternate
     * @param strDrinkThumb
     * @param strMeasure9
     * @param strMeasure7
     * @param strMeasure8
     * @param strMeasure5
     * @param strMeasure6
     * @param strMeasure3
     * @param strMeasure4
     * @param strMeasure1
     * @param strMeasure2
     * @param strMeasure14
     * @param strMeasure15
     */
    public Drink(String idDrink, String strDrink, Object strDrinkAlternate, String strTags, Object strVideo, String strCategory, String strIBA, String strAlcoholic, String strGlass, String strInstructions, Object strInstructionsES, String strInstructionsDE, Object strInstructionsFR, String strInstructionsIT, Object strInstructionsZHHANS, Object strInstructionsZHHANT, String strDrinkThumb, String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, Object strIngredient5, Object strIngredient6, Object strIngredient7, Object strIngredient8, Object strIngredient9, Object strIngredient10, Object strIngredient11, Object strIngredient12, Object strIngredient13, Object strIngredient14, Object strIngredient15, String strMeasure1, String strMeasure2, String strMeasure3, Object strMeasure4, Object strMeasure5, Object strMeasure6, Object strMeasure7, Object strMeasure8, Object strMeasure9, Object strMeasure10, Object strMeasure11, Object strMeasure12, Object strMeasure13, Object strMeasure14, Object strMeasure15, String strImageSource, String strImageAttribution, String strCreativeCommonsConfirmed, String dateModified) {
        super();
        this.idDrink = idDrink;
        this.strDrink = strDrink;
//        this.strDrinkAlternate = strDrinkAlternate;
        this.strTags = strTags;
//        this.strVideo = strVideo;
        this.strCategory = strCategory;
        this.strIBA = strIBA;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
//        this.strInstructionsES = strInstructionsES;
//        this.strInstructionsDE = strInstructionsDE;
//        this.strInstructionsFR = strInstructionsFR;
        this.strInstructionsIT = strInstructionsIT;
//        this.strInstructionsZHHANS = strInstructionsZHHANS;
//        this.strInstructionsZHHANT = strInstructionsZHHANT;
        this.strDrinkThumb = strDrinkThumb;
//        this.strIngredient1 = strIngredient1;
//        this.strIngredient2 = strIngredient2;
//        this.strIngredient3 = strIngredient3;
//        this.strIngredient4 = strIngredient4;
//        this.strIngredient5 = strIngredient5;
//        this.strIngredient6 = strIngredient6;
//        this.strIngredient7 = strIngredient7;
//        this.strIngredient8 = strIngredient8;
//        this.strIngredient9 = strIngredient9;
//        this.strIngredient10 = strIngredient10;
//        this.strIngredient11 = strIngredient11;
//        this.strIngredient12 = strIngredient12;
//        this.strIngredient13 = strIngredient13;
//        this.strIngredient14 = strIngredient14;
//        this.strIngredient15 = strIngredient15;
//        this.strMeasure1 = strMeasure1;
//        this.strMeasure2 = strMeasure2;
//        this.strMeasure3 = strMeasure3;
//        this.strMeasure4 = strMeasure4;
//        this.strMeasure5 = strMeasure5;
//        this.strMeasure6 = strMeasure6;
//        this.strMeasure7 = strMeasure7;
//        this.strMeasure8 = strMeasure8;
//        this.strMeasure9 = strMeasure9;
//        this.strMeasure10 = strMeasure10;
//        this.strMeasure11 = strMeasure11;
//        this.strMeasure12 = strMeasure12;
//        this.strMeasure13 = strMeasure13;
//        this.strMeasure14 = strMeasure14;
//        this.strMeasure15 = strMeasure15;
        this.strImageSource = strImageSource;
        this.strImageAttribution = strImageAttribution;
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
        this.dateModified = dateModified;
    }

    public String getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

//    public Object getStrDrinkAlternate() {
//        return strDrinkAlternate;
//    }
//
//    public void setStrDrinkAlternate(Object strDrinkAlternate) {
//        this.strDrinkAlternate = strDrinkAlternate;
//    }

    public String getStrTags() {
        return strTags;
    }

    public void setStrTags(String strTags) {
        this.strTags = strTags;
    }

//    public Object getStrVideo() {
//        return strVideo;
//    }
//
//    public void setStrVideo(Object strVideo) {
//        this.strVideo = strVideo;
//    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrIBA() {
        return strIBA;
    }

    public void setStrIBA(String strIBA) {
        this.strIBA = strIBA;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

//    public Object getStrInstructionsES() {
//        return strInstructionsES;
//    }
//
//    public void setStrInstructionsES(Object strInstructionsES) {
//        this.strInstructionsES = strInstructionsES;
//    }

//    public String getStrInstructionsDE() {
//        return strInstructionsDE;
//    }
//
//    public void setStrInstructionsDE(String strInstructionsDE) {
//        this.strInstructionsDE = strInstructionsDE;
//    }
//
//    public Object getStrInstructionsFR() {
//        return strInstructionsFR;
//    }
//
//    public void setStrInstructionsFR(Object strInstructionsFR) {
//        this.strInstructionsFR = strInstructionsFR;
//    }

    public String getStrInstructionsIT() {
        return strInstructionsIT;
    }

    public void setStrInstructionsIT(String strInstructionsIT) {
        this.strInstructionsIT = strInstructionsIT;
    }

//    public Object getStrInstructionsZHHANS() {
//        return strInstructionsZHHANS;
//    }
//
//    public void setStrInstructionsZHHANS(Object strInstructionsZHHANS) {
//        this.strInstructionsZHHANS = strInstructionsZHHANS;
//    }
//
//    public Object getStrInstructionsZHHANT() {
//        return strInstructionsZHHANT;
//    }
//
//    public void setStrInstructionsZHHANT(Object strInstructionsZHHANT) {
//        this.strInstructionsZHHANT = strInstructionsZHHANT;
   // }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

//    public String getStrIngredient1() {
//        return strIngredient1;
//    }
//
//    public void setStrIngredient1(String strIngredient1) {
//        this.strIngredient1 = strIngredient1;
//    }
//
//    public String getStrIngredient2() {
//        return strIngredient2;
//    }
//
//    public void setStrIngredient2(String strIngredient2) {
//        this.strIngredient2 = strIngredient2;
//    }
//
//    public String getStrIngredient3() {
//        return strIngredient3;
//    }
//
//    public void setStrIngredient3(String strIngredient3) {
//        this.strIngredient3 = strIngredient3;
//    }
//
//    public String getStrIngredient4() {
//        return strIngredient4;
//    }
//
//    public void setStrIngredient4(String strIngredient4) {
//        this.strIngredient4 = strIngredient4;
//    }
//
//    public Object getStrIngredient5() {
//        return strIngredient5;
//    }
//
//    public void setStrIngredient5(Object strIngredient5) {
//        this.strIngredient5 = strIngredient5;
//    }
//
//    public Object getStrIngredient6() {
//        return strIngredient6;
//    }
//
//    public void setStrIngredient6(Object strIngredient6) {
//        this.strIngredient6 = strIngredient6;
//    }
//
//    public Object getStrIngredient7() {
//        return strIngredient7;
//    }
//
//    public void setStrIngredient7(Object strIngredient7) {
//        this.strIngredient7 = strIngredient7;
//    }
//
//    public Object getStrIngredient8() {
//        return strIngredient8;
//    }
//
//    public void setStrIngredient8(Object strIngredient8) {
//        this.strIngredient8 = strIngredient8;
//    }
//
//    public Object getStrIngredient9() {
//        return strIngredient9;
//    }
//
//    public void setStrIngredient9(Object strIngredient9) {
//        this.strIngredient9 = strIngredient9;
//    }
//
//    public Object getStrIngredient10() {
//        return strIngredient10;
//    }
//
//    public void setStrIngredient10(Object strIngredient10) {
//        this.strIngredient10 = strIngredient10;
//    }
//
//    public Object getStrIngredient11() {
//        return strIngredient11;
//    }
//
//    public void setStrIngredient11(Object strIngredient11) {
//        this.strIngredient11 = strIngredient11;
//    }
//
//    public Object getStrIngredient12() {
//        return strIngredient12;
//    }
//
//    public void setStrIngredient12(Object strIngredient12) {
//        this.strIngredient12 = strIngredient12;
//    }
//
//    public Object getStrIngredient13() {
//        return strIngredient13;
//    }
//
//    public void setStrIngredient13(Object strIngredient13) {
//        this.strIngredient13 = strIngredient13;
//    }
//
//    public Object getStrIngredient14() {
//        return strIngredient14;
//    }
//
//    public void setStrIngredient14(Object strIngredient14) {
//        this.strIngredient14 = strIngredient14;
//    }
//
//    public Object getStrIngredient15() {
//        return strIngredient15;
//    }
//
//    public void setStrIngredient15(Object strIngredient15) {
//        this.strIngredient15 = strIngredient15;
//    }
//
//    public String getStrMeasure1() {
//        return strMeasure1;
//    }
//
//    public void setStrMeasure1(String strMeasure1) {
//        this.strMeasure1 = strMeasure1;
//    }
//
//    public String getStrMeasure2() {
//        return strMeasure2;
//    }
//
//    public void setStrMeasure2(String strMeasure2) {
//        this.strMeasure2 = strMeasure2;
//    }
//
//    public String getStrMeasure3() {
//        return strMeasure3;
//    }
//
//    public void setStrMeasure3(String strMeasure3) {
//        this.strMeasure3 = strMeasure3;
//    }
//
//    public Object getStrMeasure4() {
//        return strMeasure4;
//    }
//
//    public void setStrMeasure4(Object strMeasure4) {
//        this.strMeasure4 = strMeasure4;
//    }
//
//    public Object getStrMeasure5() {
//        return strMeasure5;
//    }
//
//    public void setStrMeasure5(Object strMeasure5) {
//        this.strMeasure5 = strMeasure5;
//    }
//
//    public Object getStrMeasure6() {
//        return strMeasure6;
//    }
//
//    public void setStrMeasure6(Object strMeasure6) {
//        this.strMeasure6 = strMeasure6;
//    }
//
//    public Object getStrMeasure7() {
//        return strMeasure7;
//    }
//
//    public void setStrMeasure7(Object strMeasure7) {
//        this.strMeasure7 = strMeasure7;
//    }
//
//    public Object getStrMeasure8() {
//        return strMeasure8;
//    }
//
//    public void setStrMeasure8(Object strMeasure8) {
//        this.strMeasure8 = strMeasure8;
//    }
//
//    public Object getStrMeasure9() {
//        return strMeasure9;
//    }
//
//    public void setStrMeasure9(Object strMeasure9) {
//        this.strMeasure9 = strMeasure9;
//    }
//
//    public Object getStrMeasure10() {
//        return strMeasure10;
//    }
//
//    public void setStrMeasure10(Object strMeasure10) {
//        this.strMeasure10 = strMeasure10;
//    }
//
//    public Object getStrMeasure11() {
//        return strMeasure11;
//    }
//
//    public void setStrMeasure11(Object strMeasure11) {
//        this.strMeasure11 = strMeasure11;
//    }
//
//    public Object getStrMeasure12() {
//        return strMeasure12;
//    }
//
//    public void setStrMeasure12(Object strMeasure12) {
//        this.strMeasure12 = strMeasure12;
//    }
//
//    public Object getStrMeasure13() {
//        return strMeasure13;
//    }
//
//    public void setStrMeasure13(Object strMeasure13) {
//        this.strMeasure13 = strMeasure13;
//    }
//
//    public Object getStrMeasure14() {
//        return strMeasure14;
//    }
//
//    public void setStrMeasure14(Object strMeasure14) {
//        this.strMeasure14 = strMeasure14;
//    }
//
//    public Object getStrMeasure15() {
//        return strMeasure15;
//    }
//
//    public void setStrMeasure15(Object strMeasure15) {
//        this.strMeasure15 = strMeasure15;
//    }

    public String getStrImageSource() {
        return strImageSource;
    }

    public void setStrImageSource(String strImageSource) {
        this.strImageSource = strImageSource;
    }

    public String getStrImageAttribution() {
        return strImageAttribution;
    }

    public void setStrImageAttribution(String strImageAttribution) {
        this.strImageAttribution = strImageAttribution;
    }

    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

//    @NonNull
//    @Override
//    public String toString() {
//        return String.format("%s, %s, %s %s", this.strIngredient10, this.strIngredient11,
//                this.strIngredient12, this.strIngredient13,this.strIngredient14,this,strIngredient15);
//    }


}