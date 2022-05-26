package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y44 {

    /* renamed from: a */
    private final int[] f26260a;

    /* renamed from: b */
    private final uj0[] f26261b;

    /* renamed from: c */
    private final int[][][] f26262c;

    /* renamed from: d */
    private final uj0 f26263d;

    y44(String[] strArr, int[] iArr, uj0[] uj0Arr, int[] iArr2, int[][][] iArr3, uj0 uj0) {
        this.f26260a = iArr;
        this.f26261b = uj0Arr;
        this.f26262c = iArr3;
        this.f26263d = uj0;
    }

    /* renamed from: a */
    public final int mo22166a(int i) {
        return this.f26260a[i];
    }

    /* renamed from: b */
    public final int mo22167b(int i, int i2, int i3) {
        return this.f26262c[i][i2][0] & 7;
    }

    /* renamed from: c */
    public final uj0 mo22168c(int i) {
        return this.f26261b[i];
    }

    /* renamed from: d */
    public final uj0 mo22169d() {
        return this.f26263d;
    }
}
