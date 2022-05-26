package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.kc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5258kc extends C5111gd {

    /* renamed from: h */
    private static volatile Long f18852h;

    /* renamed from: i */
    private static final Object f18853i = new Object();

    public C5258kc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", b8Var, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (f18852h == null) {
            synchronized (f18853i) {
                if (f18852h == null) {
                    f18852h = (Long) this.f17020e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17019d) {
            this.f17019d.mo16123h0(f18852h.longValue());
        }
    }
}
