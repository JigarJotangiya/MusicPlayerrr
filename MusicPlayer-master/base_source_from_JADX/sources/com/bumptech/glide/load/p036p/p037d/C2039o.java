package com.bumptech.glide.load.p036p.p037d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.o */
/* compiled from: DrawableTransformation */
public class C2039o implements C1794m<Drawable> {

    /* renamed from: b */
    private final C1794m<Bitmap> f7059b;

    /* renamed from: c */
    private final boolean f7060c;

    public C2039o(C1794m<Bitmap> mVar, boolean z) {
        this.f7059b = mVar;
        this.f7060c = z;
    }

    /* renamed from: d */
    private C1902v<Drawable> m9579d(Context context, C1902v<Bitmap> vVar) {
        return C2047u.m9613f(context.getResources(), vVar);
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        this.f7059b.mo7735a(messageDigest);
    }

    /* renamed from: b */
    public C1902v<Drawable> mo7751b(Context context, C1902v<Drawable> vVar, int i, int i2) {
        C1807e f = C1719b.m8591c(context).mo7584f();
        Drawable drawable = vVar.get();
        C1902v<Bitmap> a = C2037n.m9576a(f, drawable, i, i2);
        if (a != null) {
            C1902v<Bitmap> b = this.f7059b.mo7751b(context, a, i, i2);
            if (!b.equals(a)) {
                return m9579d(context, b);
            }
            b.mo7965a();
            return vVar;
        } else if (!this.f7060c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: c */
    public C1794m<BitmapDrawable> mo8132c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2039o) {
            return this.f7059b.equals(((C2039o) obj).f7059b);
        }
        return false;
    }

    public int hashCode() {
        return this.f7059b.hashCode();
    }
}
