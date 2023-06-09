package com.vimal.cvs.initializers;

import com.vimal.cvs.Particle;

import java.util.Random;

public class SpeedModuleAndRangeInitializer implements ParticleInitializer {

    private final float mSpeedMin;
    private final float mSpeedMax;
    private int mMinAngle;
    private int mMaxAngle;

    public SpeedModuleAndRangeInitializer(float speedMin, float speedMax, int minAngle, int maxAngle) {
        mSpeedMin = speedMin;
        mSpeedMax = speedMax;
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
        while (mMinAngle < 0) {
            mMinAngle += 360;
        }
        while (mMaxAngle < 0) {
            mMaxAngle += 360;
        }
        if (mMinAngle > mMaxAngle) {
            int tmp = mMinAngle;
            mMinAngle = mMaxAngle;
            mMaxAngle = tmp;
        }
    }

    @Override
    public void initParticle(Particle p, Random r) {
        float speed = r.nextFloat() * (mSpeedMax - mSpeedMin) + mSpeedMin;
        int angle;
        if (mMaxAngle == mMinAngle) {
            angle = mMinAngle;
        } else {
            angle = r.nextInt(mMaxAngle - mMinAngle) + mMinAngle;
        }
        double angleInRads = Math.toRadians(angle);
        p.mSpeedX = (float) (speed * Math.cos(angleInRads));
        p.mSpeedY = (float) (speed * Math.sin(angleInRads));
        p.mInitialRotation = angle + 90;
    }

}
