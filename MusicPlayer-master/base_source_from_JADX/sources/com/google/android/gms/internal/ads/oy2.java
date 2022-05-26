package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oy2 {

    /* renamed from: a */
    private final Context f21235a;

    /* renamed from: b */
    private final Looper f21236b;

    public oy2(Context context, Looper looper) {
        this.f21235a = context;
        this.f21236b = looper;
    }

    /* renamed from: a */
    public final void mo20152a(String str) {
        dz2 D = fz2.m24022D();
        D.mo17056r(this.f21235a.getPackageName());
        D.mo17058t(2);
        az2 D2 = bz2.m21600D();
        D2.mo15989r(str);
        D2.mo15990s(2);
        D.mo17057s(D2);
        new py2(this.f21235a, this.f21236b, (fz2) D.mo19761n()).mo20344a();
    }
}
