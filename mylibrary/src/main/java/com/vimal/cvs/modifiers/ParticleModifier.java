package com.vimal.cvs.modifiers;

import com.vimal.cvs.Particle;

public interface ParticleModifier {
    void apply(Particle particle, long miliseconds);

}
