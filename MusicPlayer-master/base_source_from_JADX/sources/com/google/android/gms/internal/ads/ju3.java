package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ju3 extends m03 {

    /* renamed from: d */
    private final int f18644d;

    /* renamed from: e */
    private final int f18645e;

    /* renamed from: f */
    private final int[] f18646f;

    /* renamed from: g */
    private final int[] f18647g;

    /* renamed from: h */
    private final bg0[] f18648h;

    /* renamed from: i */
    private final Object[] f18649i;

    /* renamed from: j */
    private final HashMap<Object, Integer> f18650j = new HashMap<>();

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection<? extends com.google.android.gms.internal.ads.xt3>, com.google.android.gms.internal.ads.x34] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ju3(java.util.Collection r5, java.util.Collection<? extends com.google.android.gms.internal.ads.xt3> r6, com.google.android.gms.internal.ads.x34 r7) {
        /*
            r4 = this;
            r7 = 0
            r0 = 0
            r4.<init>(r7, r6, r0)
            int r6 = r5.size()
            int[] r0 = new int[r6]
            r4.f18646f = r0
            int[] r0 = new int[r6]
            r4.f18647g = r0
            com.google.android.gms.internal.ads.bg0[] r0 = new com.google.android.gms.internal.ads.bg0[r6]
            r4.f18648h = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.f18649i = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r4.f18650j = r6
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r0 = 0
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r5.next()
            com.google.android.gms.internal.ads.xt3 r1 = (com.google.android.gms.internal.ads.xt3) r1
            com.google.android.gms.internal.ads.bg0[] r2 = r4.f18648h
            com.google.android.gms.internal.ads.bg0 r3 = r1.zza()
            r2[r0] = r3
            int[] r2 = r4.f18647g
            r2[r0] = r7
            int[] r2 = r4.f18646f
            r2[r0] = r6
            com.google.android.gms.internal.ads.bg0[] r2 = r4.f18648h
            r2 = r2[r0]
            int r2 = r2.mo15664c()
            int r7 = r7 + r2
            com.google.android.gms.internal.ads.bg0[] r2 = r4.f18648h
            r2 = r2[r0]
            int r2 = r2.mo15663b()
            int r6 = r6 + r2
            java.lang.Object[] r2 = r4.f18649i
            java.lang.Object r1 = r1.mo16751a()
            r2[r0] = r1
            int r1 = r0 + 1
            java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f18650j
            java.lang.Object[] r3 = r4.f18649i
            r3 = r3[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            r0 = r1
            goto L_0x0026
        L_0x006d:
            r4.f18644d = r7
            r4.f18645e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ju3.<init>(java.util.Collection, com.google.android.gms.internal.ads.x34, byte[]):void");
    }

    /* renamed from: b */
    public final int mo15663b() {
        return this.f18645e;
    }

    /* renamed from: c */
    public final int mo15664c() {
        return this.f18644d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo18736p(Object obj) {
        Integer num = this.f18650j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo18737q(int i) {
        return wy2.m33414I(this.f18646f, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo18738r(int i) {
        return wy2.m33414I(this.f18647g, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo18739s(int i) {
        return this.f18646f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo18740t(int i) {
        return this.f18647g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final bg0 mo18741u(int i) {
        return this.f18648h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo18742v(int i) {
        return this.f18649i[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final List<bg0> mo18743y() {
        return Arrays.asList(this.f18648h);
    }
}
