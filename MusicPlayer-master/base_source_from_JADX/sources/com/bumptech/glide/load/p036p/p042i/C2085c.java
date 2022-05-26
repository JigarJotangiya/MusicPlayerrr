package com.bumptech.glide.load.p036p.p042i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.p037d.C2016e;
import com.bumptech.glide.load.p036p.p041h.C2070c;

/* renamed from: com.bumptech.glide.load.p.i.c */
/* compiled from: DrawableBytesTranscoder */
public final class C2085c implements C2087e<Drawable, byte[]> {

    /* renamed from: a */
    private final C1807e f7160a;

    /* renamed from: b */
    private final C2087e<Bitmap, byte[]> f7161b;

    /* renamed from: c */
    private final C2087e<C2070c, byte[]> f7162c;

    public C2085c(C1807e eVar, C2087e<Bitmap, byte[]> eVar2, C2087e<C2070c, byte[]> eVar3) {
        this.f7160a = eVar;
        this.f7161b = eVar2;
        this.f7162c = eVar3;
    }

    /* renamed from: b */
    private static C1902v<C2070c> m9761b(C1902v<Drawable> vVar) {
        return vVar;
    }

    /* renamed from: a */
    public C1902v<byte[]> mo8232a(C1902v<Drawable> vVar, C1790i iVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f7161b.mo8232a(C2016e.m9488f(((BitmapDrawable) drawable).getBitmap(), this.f7160a), iVar);
        }
        if (!(drawable instanceof C2070c)) {
            return null;
        }
        C2087e<C2070c, byte[]> eVar = this.f7162c;
        m9761b(vVar);
        return eVar.mo8232a(vVar, iVar);
    }
}
