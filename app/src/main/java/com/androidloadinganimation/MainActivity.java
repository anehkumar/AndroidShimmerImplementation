package com.androidloadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    Button stop, start;
    ShimmerFrameLayout animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stop = (Button)findViewById(R.id.stop);
        start = (Button)findViewById(R.id.start);
        animation = (ShimmerFrameLayout)findViewById(R.id.loading_animation);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.startShimmer();
                start.setVisibility(View.GONE);
                stop.setVisibility(View.VISIBLE);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.stopShimmer();
                stop.setVisibility(View.GONE);
                start.setVisibility(View.VISIBLE);
            }
        });
    }
}
