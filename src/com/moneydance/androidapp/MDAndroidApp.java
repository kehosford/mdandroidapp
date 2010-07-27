package com.moneydance.androidapp;

import android.app.Activity;
import android.os.Bundle;

public class MDAndroidApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}