package com.coocent.video.videoplayercore.utils;

import java.util.Random;

/* compiled from: RandRomUitls.kt */
public final class RandRomUitls {
    public static final RandRomUitls INSTANCE = new RandRomUitls();

    private RandRomUitls() {
    }

    public final int getRandRomNum(int i) {
        if (i > 0) {
            return new Random().nextInt(i);
        }
        return 0;
    }

    public final int getRandRomNum(int i, int i2) {
        if (i2 > i) {
            return new Random().nextInt(i2 - i) + i;
        }
        return 0;
    }
}
