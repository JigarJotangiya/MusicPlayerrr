package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.oc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5406oc extends C5111gd {

    /* renamed from: h */
    private static volatile Long f20969h;

    /* renamed from: i */
    private static final Object f20970i = new Object();

    public C5406oc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", b8Var, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (f20969h == null) {
            synchronized (f20970i) {
                if (f20969h == null) {
                    f20969h = (Long) this.f17020e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17019d) {
            this.f17019d.mo16131p0(f20969h.longValue());
        }
    }
}
