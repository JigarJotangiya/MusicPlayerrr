package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b63<E> extends r43<E> {

    /* renamed from: l */
    private static final Object[] f14344l;
    static final b63<Object> zza;

    /* renamed from: i */
    private final transient int f14345i;

    /* renamed from: j */
    private final transient int f14346j;

    /* renamed from: k */
    private final transient int f14347k;
    final transient Object[] zzb;
    final transient Object[] zzc;

    static {
        Object[] objArr = new Object[0];
        f14344l = objArr;
        zza = new b63(objArr, 0, objArr, 0, 0);
    }

    b63(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.f14345i = i;
        this.zzc = objArr2;
        this.f14346j = i2;
        this.f14347k = i3;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = y33.m34010b(obj);
        while (true) {
            int i = b & this.f14346j;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    public final int hashCode() {
        return this.f14345i;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    public final int size() {
        return this.f14347k;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.f14347k);
        return i + this.f14347k;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.f14347k;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return 0;
    }

    public final j63<E> zze() {
        return zzd().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final g43<E> zzi() {
        return g43.zzk(this.zzb, this.f14347k);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzo() {
        return true;
    }
}
