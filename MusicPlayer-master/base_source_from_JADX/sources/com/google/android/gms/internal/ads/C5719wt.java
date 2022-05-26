package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C5719wt {

    /* renamed from: a */
    public final Object f25531a;

    /* renamed from: b */
    public final int f25532b;

    /* renamed from: c */
    public final int f25533c;

    /* renamed from: d */
    public final long f25534d;

    /* renamed from: e */
    public final int f25535e;

    protected C5719wt(C5719wt wtVar) {
        this.f25531a = wtVar.f25531a;
        this.f25532b = wtVar.f25532b;
        this.f25533c = wtVar.f25533c;
        this.f25534d = wtVar.f25534d;
        this.f25535e = wtVar.f25535e;
    }

    public C5719wt(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private C5719wt(Object obj, int i, int i2, long j, int i3) {
        this.f25531a = obj;
        this.f25532b = i;
        this.f25533c = i2;
        this.f25534d = j;
        this.f25535e = i3;
    }

    /* renamed from: a */
    public final C5719wt mo21901a(Object obj) {
        if (this.f25531a.equals(obj)) {
            return this;
        }
        return new C5719wt(obj, this.f25532b, this.f25533c, this.f25534d, this.f25535e);
    }

    /* renamed from: b */
    public final boolean mo21902b() {
        return this.f25532b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5719wt)) {
            return false;
        }
        C5719wt wtVar = (C5719wt) obj;
        return this.f25531a.equals(wtVar.f25531a) && this.f25532b == wtVar.f25532b && this.f25533c == wtVar.f25533c && this.f25534d == wtVar.f25534d && this.f25535e == wtVar.f25535e;
    }

    public final int hashCode() {
        return ((((((((this.f25531a.hashCode() + 527) * 31) + this.f25532b) * 31) + this.f25533c) * 31) + ((int) this.f25534d)) * 31) + this.f25535e;
    }

    public C5719wt(Object obj, long j) {
        this(obj, -1, -1, -1, -1);
    }

    public C5719wt(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
