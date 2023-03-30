package com.vimal.cvs.initializers;

import com.vimal.cvs.Particle;

import java.util.Random;

public interface ParticleInitializer {

    void initParticle(Particle p, Random r);

}
