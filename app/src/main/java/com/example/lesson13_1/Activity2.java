package com.example.lesson13_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

import java.util.Locale;

public class Activity2 extends AppCompatActivity {

    final String KEY_PREF_LANGUAGE = "pref_language";

    final String LANGUAGE_CODE_ENG = "en";
    final String LANGUAGE_CODE_VI = "vi";

    String lastLanguageCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setLocale(Activity2.this, LANGUAGE_CODE_VI);

        setContentView(R.layout.activity_2);

        String sTheDoor = getString(R.string.key_door);

//        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//
//        lastLanguageCode = pref.getString(KEY_PREF_LANGUAGE, LANGUAGE_CODE_ENG);
//
//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (lastLanguageCode.equals(LANGUAGE_CODE_ENG)) {
//                    setLocale(Activity2.this, LANGUAGE_CODE_VI);
//                    lastLanguageCode = LANGUAGE_CODE_VI;
//                } else {
//                    setLocale(Activity2.this, LANGUAGE_CODE_ENG);
//                    lastLanguageCode = LANGUAGE_CODE_ENG;
//                }
//
//                pref.edit().putString(KEY_PREF_LANGUAGE, lastLanguageCode).apply();
//
//                recreate();
//            }
//        });
    }


    public static void setLocale(Activity activity, String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }
}