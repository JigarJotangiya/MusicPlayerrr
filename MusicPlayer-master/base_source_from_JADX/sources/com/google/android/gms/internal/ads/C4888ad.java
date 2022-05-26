package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ad */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4888ad extends C5111gd {

    /* renamed from: h */
    private static volatile Long f13848h;

    /* renamed from: i */
    private static final Object f13849i = new Object();

    public C4888ad(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", b8Var, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (f13848h == null) {
            synchronized (f13849i) {
                if (f13848h == null) {
                    f13848h = (Long) this.f17020e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17019d) {
            this.f17019d.mo16100I(f13848h.longValue());
        }
    }
}
