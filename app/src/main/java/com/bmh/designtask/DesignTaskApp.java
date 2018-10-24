package com.bmh.designtask;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class DesignTaskApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("DIN-NEXT_-ARABIC-REGULAR.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
