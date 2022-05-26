package com.bumptech.glide;

/* renamed from: com.bumptech.glide.f */
/* compiled from: MemoryCategory */
public enum C1729f {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float multiplier;

    private C1729f(float f) {
        this.multiplier = f;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
