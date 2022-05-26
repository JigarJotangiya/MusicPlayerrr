package com.bumptech.glide.load.p036p.p041h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p036p.p037d.C2016e;
import com.bumptech.glide.p051s.C2193j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.h.f */
/* compiled from: GifDrawableTransformation */
public class C2074f implements C1794m<C2070c> {

    /* renamed from: b */
    private final C1794m<Bitmap> f7126b;

    public C2074f(C1794m<Bitmap> mVar) {
        C2193j.m10269d(mVar);
        this.f7126b = mVar;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        this.f7126b.mo7735a(messageDigest);
    }

    /* renamed from: b */
    public C1902v<C2070c> mo7751b(Context context, C1902v<C2070c> vVar, int i, int i2) {
        C2070c cVar = vVar.get();
        C2016e eVar = new C2016e(cVar.mo8188e(), C1719b.m8591c(context).mo7584f());
        C1902v<Bitmap> b = this.f7126b.mo7751b(context, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.mo7965a();
        }
        cVar.mo8198m(this.f7126b, b.get());
        return vVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2074f) {
            return this.f7126b.equals(((C2074f) obj).f7126b);
        }
        return false;
    }

    public int hashCode() {
        return this.f7126b.hashCode();
    }
}
