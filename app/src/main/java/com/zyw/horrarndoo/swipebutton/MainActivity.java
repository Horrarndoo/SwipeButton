package com.zyw.horrarndoo.swipebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SlideSwitchView mSlideSwitchView;
    private boolean mIsPowerOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSlideSwitchView = (SlideSwitchView) findViewById(R.id.slide_switch_view);
        mSlideSwitchView.setOnSwitchStateUpdateListener(new SlideSwitchView.OnSwitchStateUpdateListener() {
            @Override
            public void onStateUpdate() {
                mIsPowerOn = !mIsPowerOn;
                String content = mIsPowerOn ? "Slide to power off" : "Slide to power on";
                mSlideSwitchView.setText(content);
            }
        });
    }
}
