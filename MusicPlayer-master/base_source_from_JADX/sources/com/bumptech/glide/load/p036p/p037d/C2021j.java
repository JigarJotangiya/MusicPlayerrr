package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.j */
/* compiled from: CenterInside */
public class C2021j extends C2017f {

    /* renamed from: b */
    private static final byte[] f7031b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C1786g.f6570a);

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        messageDigest.update(f7031b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8109c(C1807e eVar, Bitmap bitmap, int i, int i2) {
        return C2054z.m9639c(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C2021j;
    }

    public int hashCode() {
        return -670243078;
    }
}
