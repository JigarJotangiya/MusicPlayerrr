package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r90 {

    /* renamed from: a */
    private final Object f22787a = new Object();

    /* renamed from: b */
    private final Object f22788b = new Object();

    /* renamed from: c */
    private ba0 f22789c;

    /* renamed from: d */
    private ba0 f22790d;

    /* renamed from: c */
    private static final Context m29998c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final ba0 mo20615a(Context context, zzcjf zzcjf) {
        ba0 ba0;
        synchronized (this.f22787a) {
            if (this.f22789c == null) {
                this.f22789c = new ba0(m29998c(context), zzcjf, (String) C5054ev.m23225c().mo20153b(C5503qz.f22472a));
            }
            ba0 = this.f22789c;
        }
        return ba0;
    }

    /* renamed from: b */
    public final ba0 mo20616b(Context context, zzcjf zzcjf) {
        ba0 ba0;
        synchronized (this.f22788b) {
            if (this.f22790d == null) {
                this.f22790d = new ba0(m29998c(context), zzcjf, o10.f20861a.mo20989e());
            }
            ba0 = this.f22790d;
        }
        return ba0;
    }
}
