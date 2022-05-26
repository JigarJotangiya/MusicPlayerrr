package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.q */
/* compiled from: FitCenter */
public class C2041q extends C2017f {

    /* renamed from: b */
    private static final byte[] f7061b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C1786g.f6570a);

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        messageDigest.update(f7061b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8109c(C1807e eVar, Bitmap bitmap, int i, int i2) {
        return C2054z.m9641e(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C2041q;
    }

    public int hashCode() {
        return 1572326941;
    }
}
