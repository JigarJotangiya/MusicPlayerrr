package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.jc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5221jc extends C5111gd {
    public C5221jc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "glZYRiAaVgXhfq7gmv5KdTlxK1u1W7CDU+wEOCdR48SsabliUSLxOyNuMGeUOQq8", "BXtZidg/K24z5N/YUAEC4oPRR4OaYUycAQjBgFG9Ir4=", b8Var, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        this.f17019d.mo16121f0(-1);
        this.f17019d.mo16120e0(-1);
        int[] iArr = (int[]) this.f17020e.invoke((Object) null, new Object[]{this.f17016a.mo21778b()});
        synchronized (this.f17019d) {
            this.f17019d.mo16121f0((long) iArr[0]);
            this.f17019d.mo16120e0((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.f17019d.mo16119d0((long) i);
            }
        }
    }
}
