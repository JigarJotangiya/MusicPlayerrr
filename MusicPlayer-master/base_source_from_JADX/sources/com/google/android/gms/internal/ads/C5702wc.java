package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.wc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5702wc extends C5111gd {

    /* renamed from: h */
    private final boolean f25334h;

    public C5702wc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", b8Var, i, 61);
        this.f25334h = wbVar.mo21792s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f17020e.invoke((Object) null, new Object[]{this.f17016a.mo21778b(), Boolean.valueOf(this.f25334h)})).longValue();
        synchronized (this.f17019d) {
            this.f17019d.mo16133r(longValue);
        }
    }
}
