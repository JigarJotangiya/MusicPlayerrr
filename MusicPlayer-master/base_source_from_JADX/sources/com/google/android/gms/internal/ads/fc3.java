package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fc3 {

    /* renamed from: c */
    public static final fc3 f16529c = new fc3(0, 0, 1, 1, (jl2) null);

    /* renamed from: a */
    public final int f16530a = 1;

    /* renamed from: b */
    private AudioAttributes f16531b;

    static {
        iu1 iu1 = iu1.f18158a;
    }

    /* synthetic */ fc3(int i, int i2, int i3, int i4, jl2 jl2) {
    }

    /* renamed from: a */
    public final AudioAttributes mo17518a() {
        if (this.f16531b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (wy2.f25579a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f16531b = usage.build();
        }
        return this.f16531b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fc3.class != obj.getClass()) {
            return false;
        }
        fc3 fc3 = (fc3) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
