package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.lc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5295lc extends C5111gd {

    /* renamed from: h */
    private final long f19295h;

    public C5295lc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, long j, int i, int i2) {
        super(wbVar, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", b8Var, i, 25);
        this.f19295h = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f17020e.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f17019d) {
            this.f17019d.mo16128m0(longValue);
            long j = this.f19295h;
            if (j != 0) {
                this.f17019d.mo16098G(longValue - j);
                this.f17019d.mo16099H(this.f19295h);
            }
        }
    }
}
