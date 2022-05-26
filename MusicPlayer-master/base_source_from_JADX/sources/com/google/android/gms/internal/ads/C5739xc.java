package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.xc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5739xc extends C5111gd {

    /* renamed from: h */
    private final StackTraceElement[] f25748h;

    public C5739xc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(wbVar, "xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", b8Var, i, 45);
        this.f25748h = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.f25748h;
        if (obj != null) {
            int i = 1;
            C5442pb pbVar = new C5442pb((String) this.f17020e.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f17019d) {
                this.f17019d.mo16135s(pbVar.f21382b.longValue());
                if (pbVar.f21383c.booleanValue()) {
                    C4920b8 b8Var = this.f17019d;
                    if (true != pbVar.f21384d.booleanValue()) {
                        i = 2;
                    }
                    b8Var.mo16107P(i);
                } else {
                    this.f17019d.mo16107P(3);
                }
            }
        }
    }
}
