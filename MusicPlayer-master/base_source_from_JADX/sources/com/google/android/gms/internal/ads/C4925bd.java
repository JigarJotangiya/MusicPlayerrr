package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.bd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4925bd extends C5111gd {
    public C4925bd(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", b8Var, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        this.f17019d.mo16111U(3);
        boolean booleanValue = ((Boolean) this.f17020e.invoke((Object) null, new Object[]{this.f17016a.mo21778b()})).booleanValue();
        synchronized (this.f17019d) {
            if (booleanValue) {
                this.f17019d.mo16111U(2);
            } else {
                this.f17019d.mo16111U(1);
            }
        }
    }
}
