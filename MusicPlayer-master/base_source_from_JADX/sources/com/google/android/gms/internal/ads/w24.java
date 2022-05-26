package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w24 extends q14<Integer> {

    /* renamed from: q */
    private static final C5825zn f25200q;

    /* renamed from: j */
    private final i24[] f25201j;

    /* renamed from: k */
    private final bg0[] f25202k;

    /* renamed from: l */
    private final ArrayList<i24> f25203l;

    /* renamed from: m */
    private int f25204m = -1;

    /* renamed from: n */
    private long[][] f25205n;

    /* renamed from: o */
    private v24 f25206o;

    /* renamed from: p */
    private final s14 f25207p;

    static {
        C5767y3 y3Var = new C5767y3();
        y3Var.mo22158a("MergingMediaSource");
        f25200q = y3Var.mo22160c();
    }

    public w24(boolean z, boolean z2, i24... i24Arr) {
        s14 s14 = new s14();
        this.f25201j = i24Arr;
        this.f25207p = s14;
        this.f25203l = new ArrayList<>(Arrays.asList(i24Arr));
        this.f25202k = new bg0[i24Arr.length];
        this.f25205n = new long[0][];
        new HashMap();
        p53.m28887a(8).mo19344b(2).mo18851c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo16019A(Object obj, i24 i24, bg0 bg0) {
        int i;
        if (this.f25206o == null) {
            if (this.f25204m == -1) {
                i = bg0.mo15663b();
                this.f25204m = i;
            } else {
                int b = bg0.mo15663b();
                int i2 = this.f25204m;
                if (b == i2) {
                    i = i2;
                } else {
                    this.f25206o = new v24(0);
                    return;
                }
            }
            if (this.f25205n.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.f25202k.length;
                iArr[0] = i;
                this.f25205n = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.f25203l.remove(i24);
            this.f25202k[((Integer) obj).intValue()] = bg0;
            if (this.f25203l.isEmpty()) {
                mo18272u(this.f25202k[0]);
            }
        }
    }

    /* renamed from: e */
    public final void mo16022e(e24 e24) {
        u24 u24 = (u24) e24;
        int i = 0;
        while (true) {
            i24[] i24Arr = this.f25201j;
            if (i < i24Arr.length) {
                i24Arr[i].mo16022e(u24.mo21215n(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final e24 mo16023i(f24 f24, r54 r54, long j) {
        int length = this.f25201j.length;
        e24[] e24Arr = new e24[length];
        int a = this.f25202k[0].mo15662a(f24.f25531a);
        for (int i = 0; i < length; i++) {
            e24Arr[i] = this.f25201j[i].mo16023i(f24.mo17463c(this.f25202k[i].mo15667f(a)), r54, j - this.f25205n[a][i]);
        }
        return new u24(this.f25207p, this.f25205n[a], e24Arr, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo16024s(fr1 fr1) {
        super.mo16024s(fr1);
        for (int i = 0; i < this.f25201j.length; i++) {
            mo20358B(Integer.valueOf(i), this.f25201j[i]);
        }
    }

    /* renamed from: t */
    public final void mo16025t() throws IOException {
        v24 v24 = this.f25206o;
        if (v24 == null) {
            super.mo16025t();
            return;
        }
        throw v24;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo16026v() {
        super.mo16026v();
        Arrays.fill(this.f25202k, (Object) null);
        this.f25204m = -1;
        this.f25206o = null;
        this.f25203l.clear();
        Collections.addAll(this.f25203l, this.f25201j);
    }

    /* renamed from: x */
    public final C5825zn mo16027x() {
        i24[] i24Arr = this.f25201j;
        return i24Arr.length > 0 ? i24Arr[0].mo16027x() : f25200q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ f24 mo16028z(Object obj, f24 f24) {
        if (((Integer) obj).intValue() == 0) {
            return f24;
        }
        return null;
    }
}
