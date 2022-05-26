package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.sc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5554sc extends C5111gd {

    /* renamed from: h */
    private static volatile String f23415h;

    /* renamed from: i */
    private static final Object f23416i = new Object();

    public C5554sc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", b8Var, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        this.f17019d.mo16136s0("E");
        if (f23415h == null) {
            synchronized (f23416i) {
                if (f23415h == null) {
                    f23415h = (String) this.f17020e.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f17019d) {
            this.f17019d.mo16136s0(f23415h);
        }
    }
}
