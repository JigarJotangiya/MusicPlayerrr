package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.i */
/* compiled from: CenterCrop */
public class C2020i extends C2017f {

    /* renamed from: b */
    private static final byte[] f7030b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C1786g.f6570a);

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        messageDigest.update(f7030b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8109c(C1807e eVar, Bitmap bitmap, int i, int i2) {
        return C2054z.m9638b(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C2020i;
    }

    public int hashCode() {
        return -599754482;
    }
}
