package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v53<E> extends g43<E> {
    static final g43<Object> zza = new v53(new Object[0], 0);

    /* renamed from: i */
    private final transient int f24604i;
    final transient Object[] zzb;

    v53(Object[] objArr, int i) {
        this.zzb = objArr;
        this.f24604i = i;
    }

    public final E get(int i) {
        s13.m30498a(i, this.f24604i, "index");
        E e = this.zzb[i];
        e.getClass();
        return e;
    }

    public final int size() {
        return this.f24604i;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.f24604i);
        return i + this.f24604i;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.f24604i;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzb;
    }
}
