package com.vimal.cvs.initializers;

import com.vimal.cvs.Particle;

import java.util.Random;

public class ScaleInitializer implements ParticleInitializer {

    private final float mMaxScale;
    private final float mMinScale;

    public ScaleInitializer(float minScale, float maxScale) {
        mMinScale = minScale;
        mMaxScale = maxScale;
    }

    @Override
    public void initParticle(Particle p, Random r) {
        p.mScale = r.nextFloat() * (mMaxScale - mMinScale) + mMinScale;
    }

}
