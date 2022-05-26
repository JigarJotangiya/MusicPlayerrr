package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z53 extends g43<Object> {

    /* renamed from: i */
    private final transient Object[] f26671i;

    /* renamed from: j */
    private final transient int f26672j;

    /* renamed from: k */
    private final transient int f26673k;

    z53(Object[] objArr, int i, int i2) {
        this.f26671i = objArr;
        this.f26672j = i;
        this.f26673k = i2;
    }

    public final Object get(int i) {
        s13.m30498a(i, this.f26673k, "index");
        Object obj = this.f26671i[i + i + this.f26672j];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f26673k;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }
}
