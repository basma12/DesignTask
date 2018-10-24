package com.bmh.designtask.Activity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.bmh.designtask.Adapter.HelpPagerAdapter;
import com.bmh.designtask.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOther, tvHelps;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tvOther = findViewById(R.id.tvOthers);
        tvHelps = findViewById(R.id.tvHelps);
        tvOther.setOnClickListener(this);
        tvHelps.setOnClickListener(this);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new HelpPagerAdapter(getSupportFragmentManager()));
        // Give the TabLayout the ViewPager
        tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(2).select();
        changeTabsFont();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvOthers:
                selectView(tvOther);
                unSelectView(tvHelps);
                break;
            case R.id.tvHelps:
                selectView(tvHelps);
                unSelectView(tvOther);
                break;
        }
    }

    private void selectView(TextView textView) {
        textView.setBackgroundResource(R.drawable.white_round_shape);
        setViewPadding(textView);
        textView.setTextColor(getResources().getColor(android.R.color.black));

    }

    private void unSelectView(TextView textView) {
        textView.setBackgroundResource(android.R.color.transparent);
        setViewPadding(textView);
        textView.setTextColor(getResources().getColor(R.color.gray));
    }

    private void setViewPadding(View view) {
        int vPadding = (int) getResources().getDimension(R.dimen.view_padding);
        int hPadding = (int) getResources().getDimension(R.dimen.layout_padding2);

        view.setPadding(hPadding, vPadding, hPadding, vPadding);
    }

    private void changeTabsFont() {
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        for (int j = 0; j < vg.getChildCount(); j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            for (int i = 0; i < vgTab.getChildCount(); i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    setFont((TextView) tabViewChild);
                }
            }
        }
    }

    private void setFont(TextView textView) {
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/DIN-NEXT_-ARABIC-REGULAR.otf"));
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
