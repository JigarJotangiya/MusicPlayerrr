package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.p039f.C2062d;

/* renamed from: com.bumptech.glide.load.p.d.x */
/* compiled from: ResourceBitmapDecoder */
public class C2051x implements C1792k<Uri, Bitmap> {

    /* renamed from: a */
    private final C2062d f7089a;

    /* renamed from: b */
    private final C1807e f7090b;

    public C2051x(C2062d dVar, C1807e eVar) {
        this.f7089a = dVar;
        this.f7090b = eVar;
    }

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(Uri uri, int i, int i2, C1790i iVar) {
        C1902v<Drawable> c = this.f7089a.mo7749b(uri, i, i2, iVar);
        if (c == null) {
            return null;
        }
        return C2037n.m9576a(this.f7090b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo7748a(Uri uri, C1790i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
