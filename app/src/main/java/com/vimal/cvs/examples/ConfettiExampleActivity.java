package com.vimal.cvs.examples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.vimal.cvs.ParticleSystem;

public class ConfettiExampleActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confetti_example);
        findViewById(R.id.button1).setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        new ParticleSystem(this, 40, R.drawable.flower_small, 1000000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 180, 180)
                .setRotationSpeed(100)
                .setAcceleration(0.00040f, 90)
                .emit(findViewById(R.id.emiter_top_right), 10);

        new ParticleSystem(this, 40, R.drawable.flower, 1000000)
                .setSpeedModuleAndAngleRange(0f, 0.1f, 0, 0)
                .setRotationSpeed(100)
                .setAcceleration(0.00040f, 90)
                .emit(findViewById(R.id.emiter_top_left), 10);

    }
}
