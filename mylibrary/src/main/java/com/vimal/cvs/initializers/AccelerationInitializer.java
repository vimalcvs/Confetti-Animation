package com.vimal.cvs.initializers;

import com.vimal.cvs.Particle;

import java.util.Random;

public class AccelerationInitializer implements ParticleInitializer {

    private final float mMinValue;
    private final float mMaxValue;
    private final int mMinAngle;
    private final int mMaxAngle;

    public AccelerationInitializer(float minAcceleration, float maxAcceleration, int minAngle, int maxAngle) {
        mMinValue = minAcceleration;
        mMaxValue = maxAcceleration;
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }

    @Override
    public void initParticle(Particle p, Random r) {
        float angle = mMinAngle;
        if (mMaxAngle != mMinAngle) {
            angle = r.nextInt(mMaxAngle - mMinAngle) + mMinAngle;
        }
        float angleInRads = (float) (angle * Math.PI / 180f);
        float value = r.nextFloat() * (mMaxValue - mMinValue) + mMinValue;
        p.mAccelerationX = (float) (value * Math.cos(angleInRads));
        p.mAccelerationY = (float) (value * Math.sin(angleInRads));
    }

}
