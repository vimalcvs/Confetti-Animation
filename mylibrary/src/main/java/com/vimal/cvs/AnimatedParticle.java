package com.vimal.cvs;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;

public class AnimatedParticle extends Particle {

    private final AnimationDrawable mAnimationDrawable;
    private int mTotalTime;

    public AnimatedParticle(AnimationDrawable animationDrawable) {
        mAnimationDrawable = animationDrawable;
        mImage = ((BitmapDrawable) mAnimationDrawable.getFrame(0)).getBitmap();
        mTotalTime = 0;
        for (int i = 0; i < mAnimationDrawable.getNumberOfFrames(); i++) {
            mTotalTime += mAnimationDrawable.getDuration(i);
        }
    }

    @Override
    public boolean update(long miliseconds) {
        boolean active = super.update(miliseconds);
        if (active) {
            long animationElapsedTime = 0;
            long realMiliseconds = miliseconds - mStartingMilisecond;
            if (realMiliseconds > mTotalTime) {
                if (mAnimationDrawable.isOneShot()) {
                    return false;
                } else {
                    realMiliseconds = realMiliseconds % mTotalTime;
                }
            }
            for (int i = 0; i < mAnimationDrawable.getNumberOfFrames(); i++) {
                animationElapsedTime += mAnimationDrawable.getDuration(i);
                if (animationElapsedTime > realMiliseconds) {
                    mImage = ((BitmapDrawable) mAnimationDrawable.getFrame(i)).getBitmap();
                    break;
                }
            }
        }
        return active;
    }
}
