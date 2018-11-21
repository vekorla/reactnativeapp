package com.kohlsreactnativepoc;

import com.facebook.react.ReactActivity;
import android.app.Activity;
import com.adobe.mobile.Analytics;
import com.adobe.mobile.Config;

import android.os.Bundle;

public class MainActivity extends ReactActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        Config.setContext(this.getApplicationContext());
        Config.collectLifecycleData(this);
        Config.setDebugLogging(true);
        Analytics.trackState("Simple Tracking Example", null);
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "kohlsreactnativepoc";
    }
}
