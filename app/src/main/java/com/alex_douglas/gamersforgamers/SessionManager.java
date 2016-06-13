package com.alex_douglas.gamersforgamers;

/**
 * Created by adouglas on 6/13/2016.
 */
import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    public static final String PREF_NAME = "Gamr";


    public void setPreferences(Context context, String key, String value) {

        SharedPreferences.Editor editor = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();

    }



    public  String getPreferences(Context context, String key) {

        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME,	Context.MODE_PRIVATE);
        String position = prefs.getString(key, "");
        return position;
    }
}